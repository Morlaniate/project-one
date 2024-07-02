package org.example;

public class Main {
    public static void main(String[] args) {

        // Создаем новый Url
        Url url = new Url("https://google.com");

        // Получаем протокол
        System.out.println(url.getProtocol()); // "https"

        // Получаем хост
        System.out.println(url.getHost()); // "google.com"

        var url1 = new Url("https://google.com");

        // Протокол https - соединение считается безопасным
        // google.com – имя хоста
        // "Connection to google.com is secure"
        System.out.println(App.checkSecurity(url1));

        var url2 = new Url("http://example.com");

        // Протокол http - соединение считается не безопасным
        // example.com – имя хоста
        System.out.println(App.checkSecurity(url2));

    }
}
