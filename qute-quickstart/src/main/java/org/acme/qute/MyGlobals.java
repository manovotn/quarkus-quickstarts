package org.acme.qute;

import io.quarkus.qute.TemplateGlobal;

public class MyGlobals {

    @TemplateGlobal
    public static final int SIZE = 10; 
    
}
