package org.acme.config;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Simple
@Singleton
public class Bravo {

    @Inject
    Charlie charlie;

    public String ping() {
        try {
            Thread.sleep(7l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return charlie.ping();
    }

}
