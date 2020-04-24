package org.eclipse.lyo.client.v4;

public class OslcClientFactory {
    
    static public OslcOAuthClientBuilder oslcOAuthClientBuilder() {
        return new OslcOAuthClientBuilder();
    }
    
    static public OslcClientBuilder oslcClientBuilder() {
        return new OslcClientBuilder();
    }


}
