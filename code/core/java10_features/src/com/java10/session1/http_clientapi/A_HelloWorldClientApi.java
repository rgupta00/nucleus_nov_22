package com.java10.session1.http_clientapi;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class A_HelloWorldClientApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        // basic HttpClient instance
        HttpClient client = HttpClient.newHttpClient();
    // Using builder pattern to get a basic HttpRequest instance with just
    //the URI
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.co.in/"))
                .build();
// response instance not created using a builder.
// HttpClient sends HttpRequests and makes HttpResponse available
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
