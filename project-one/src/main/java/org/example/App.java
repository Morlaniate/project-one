package org.example;

import java.util.Objects;

public class App {

    public static String checkSecurity(Url url) {
        String protocol = url.getProtocol();
        return Objects.equals(protocol, "https") ? "Connection to " + url.getHost() + " is secure" : "Connection to " + url.getHost() + " is not secure";
    }
}