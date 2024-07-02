package org.example;

public class Url {
    private String url;
    private String host;
    private String protocol;

    Url(String url) {
        this.url = url;
    }

    public String getProtocol() {
        String[] urlArray = url.split("://");
        this.protocol = urlArray[0];
        return protocol;
    }

    public String getHost() {
        String[] urlArray = url.split("://");
        this.host = urlArray[1];
        return host;
    }
}
