/*
 * generated by Xtext
 */
package com.soluvas.saentity.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

class SaentityGenerator implements IGenerator {
	
	IFileSystemAccess efsa
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		efsa = fsa

		var javaClassGenerator = new SaentityJavaClassGenerator()
		javaClassGenerator.doGenerate(resource, fsa)
		
		var dozerGenerator = new SaentityDozerGenerator()
		dozerGenerator.doGenerate(resource, fsa)
		
		new SaentityJsfGenerator().doGenerate(resource, fsa)
	}
	
}