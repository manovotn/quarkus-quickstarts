package org.acme.config;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class A {

    public String ping() {
        return this.getClass().getName();
    }
}
