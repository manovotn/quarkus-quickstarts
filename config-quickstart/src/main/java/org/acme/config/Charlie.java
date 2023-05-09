package org.acme.config;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class Charlie {

    public String ping() {
        return "pong";
    }

    public String pong() {
        return "ping";
    }

}
