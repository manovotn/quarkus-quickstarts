package org.acme.config;

import java.util.concurrent.atomic.AtomicBoolean;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Delta {

    AtomicBoolean started = new AtomicBoolean();

    public void start() {
        this.started.set(true);
    }

}
