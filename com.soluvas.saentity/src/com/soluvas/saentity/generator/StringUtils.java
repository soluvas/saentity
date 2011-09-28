package com.soluvas.saentity.generator;

public class StringUtils {
	
    public static String camelCase( final String name )
    {
        final StringBuilder builder = new StringBuilder();
        for ( final String part : name.split( "_" ) )
        {
            builder.append( Character.toTitleCase( part.charAt( 0 ) ) )
                    .append( part.substring( 1 ) );
        }
        return builder.toString();
    }
    
}
