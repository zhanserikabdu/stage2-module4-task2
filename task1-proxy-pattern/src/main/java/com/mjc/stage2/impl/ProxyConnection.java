package com.mjc.stage2.impl;


public class ProxyConnection {
    private RealConnection realConnection;

    public ProxyConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    public void reallyClose() {
        // Write your code here!
    }
    // Implement methods here!
}
