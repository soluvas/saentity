package com.soluvas.saentity.generator;

import java.io.IOException;

import org.eclipse.xtext.util.StringInputStream;

import net.danieldietrich.xtext.bifsa.IBiFileSystemAccess;
import net.danieldietrich.xtext.generator.protectedregions.IDocument;
import net.danieldietrich.xtext.generator.protectedregions.IProtectedRegionParser;
import net.danieldietrich.xtext.generator.protectedregions.ProtectedRegionUtil;

public class RegionUtils {

	public static void generateProtectableFile(String fileName, IBiFileSystemAccess bfsa, IProtectedRegionParser parser, String generated) {
		String merged = null;
		String _protected = null;
		try {
			_protected = bfsa.getFileContents(fileName);
		} catch (IOException ex) {
			// don't generate
		}
		if (_protected != null) {
			try {
				IDocument protectedDoc = parser.parse(new StringInputStream(_protected));
				IDocument generatedDoc = parser.parse(new StringInputStream(generated));
				IDocument mergedDoc = ProtectedRegionUtil.merge(generatedDoc, protectedDoc);
				merged = mergedDoc.getContents();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		} else {
			merged  = generated;
		}
		bfsa.generateFile(fileName, merged);
	}
}
