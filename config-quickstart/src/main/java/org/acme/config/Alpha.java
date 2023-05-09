package org.acme.config;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Alpha {
    
    @Inject
    @Simple
    Bravo bravo;
    
    public String ping() {
        return bravo.ping() + bravo.ping();
    }    

}
