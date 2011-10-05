/*
 * generated by Xtext
 */
package com.soluvas.saentity.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import net.danieldietrich.xtext.bifsa.IBiFileSystemAccess
import com.soluvas.saentity.saentity.Model
import com.soluvas.saentity.saentity.Entity
import java.util.HashMap
import net.danieldietrich.xtext.generator.protectedregions.RegionParserFactory
import net.danieldietrich.protectedregions.xtext.IBidiFileSystemAccess
import net.danieldietrich.protectedregions.xtext.ProtectedRegionSupport
import net.danieldietrich.protectedregions.core.RegionParserFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SaentityJavaClassGenerator implements IGenerator {
	
	Logger logger
	IFileSystemAccess regionFsa
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		logger = LoggerFactory::getLogger(^class)
		val bfsa = fsa as IBidiFileSystemAccess

	    regionFsa = new ProtectedRegionSupport$Builder(bfsa)
	    	.addParser(RegionParserFactory::createJavaParser, ".java")
	    	.addParser(RegionParserFactory::createXmlParser, ".xml")
	    	.read("", IFileSystemAccess::DEFAULT_OUTPUT)
	    	.build
	    	
	    for (content : resource.contents) {
	    	if (content instanceof Model) {
				var model = content as Model
				
		//		var parser = RegionParserFactory::createDefaultJavaParser()
				for (entity : model.entities) {
					var generated = renderValueClass(model.packageName, entity).toString
					var fileName = model.packageName.toPath + "/" + entity.name + ".java"
		//			RegionUtils::generateProtectableFile(fileName, bfsa, parser, generated)
					logger.info("Generating {}", fileName)
					regionFsa.generateFile(fileName, generated)
				}
	    	}
	    }

	}
	
	def renderValueClass(String packageName, Entity entity) {
		var dataTypes = new HashMap<String, String>()
		for (attribute : entity.attributes) {
			var typeName = "String"
			switch (attribute.dataType) {
				case "string": typeName = "String"
				case "int": typeName = "Integer"
				case "decimal": typeName = "BigDecimal"
				case "boolean": typeName = "Boolean"
				case "date": typeName = "Date"
				case "int-array": typeName = "int[]"
				case "map": typeName = "Map<String, Object>"
				case "map-array": typeName = "Map<String, Object>[]"
				case "object": typeName = attribute.dataClass
			}
			dataTypes.put(attribute.name, typeName)
		}
		var labelExpr = '''«FOR label : entity.labels SEPARATOR ", "»«label.name.toCamelCaseLower»=" + «label.name.toCamelCaseLower» + "«ENDFOR»'''
		'''
		package «packageName»;

		import java.math.BigDecimal;
		import java.util.Date;
		import java.util.Map;
		import java.text.ParseException;
		import java.text.SimpleDateFormat;
		
		/**
		 * «entity.name».
		 * 
		 * Fields:
		 * <ol>
		«FOR attribute : entity.attributes» *   <li>«attribute.name»</li>
		«ENDFOR»
		 * </ol>
		 *
		 * @author ceefour
		 */
		public class «entity.name» {
			
			//PROTECTED REGION ID (custom.methods) START
			// add your own methods here
			//PROTECTED REGION END
			
			«FOR attribute : entity.attributes»
			private «dataTypes.get(attribute.name)» «attribute.name.toCamelCaseLower»;
			«ENDFOR»
			
			@Override public String toString() {
				return "«entity.name»(«labelExpr»)";
			}
			«FOR attribute : entity.attributes»
			
			/**
			 * «attribute.name»
			 * «attribute.description»
			 */
			public «dataTypes.get(attribute.name)» get«StringUtils::camelCase(attribute.name)»() { return «attribute.name.toCamelCaseLower»; }
			public void set«StringUtils::camelCase(attribute.name)»(«dataTypes.get(attribute.name)» «StringUtils::camelCase(attribute.name).toFirstLower») { this.«attribute.name.toCamelCaseLower» = «attribute.name.toCamelCaseLower»; }
			«ENDFOR»
			
		}
		'''
	}
	
	def String toCamelCase(String underscored) {
		StringUtils::camelCase(underscored)
	}

	def String toCamelCaseLower(String underscored) {
		StringUtils::camelCase(underscored).toFirstLower
	}
	
	def String toPath(String packageName) {
		packageName.replace('.', '/')
	}

}
