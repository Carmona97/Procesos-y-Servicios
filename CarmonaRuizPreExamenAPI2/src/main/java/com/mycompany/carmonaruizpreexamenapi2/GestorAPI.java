/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carmonaruizpreexamenapi2;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author juanm
 */
public class GestorAPI {
    public ClaseObjetoAPI objetoSeleccionado(String esquema, String servidor, String recurso) throws Exception {
        
        recurso = URLEncoder.encode(recurso,StandardCharsets.UTF_8);
        String direccion = esquema + servidor + recurso;
        //Cambiar por el objeto que pido
        ClaseObjetoAPI objetoNuevo = new ClaseObjetoAPI();
        
        HttpClient httpCliente = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(direccion))
                .headers("Content-Type","text/plain")
                .setHeader("User-Agent","Mozilla/5.0")
                .build();
        
        HttpResponse response = httpCliente.send(request,HttpResponse.BodyHandlers.ofString());
        
        if(response.statusCode() == 200){
            Gson gson = new Gson();
            //Cambiar contenido
            objetoNuevo= gson.fromJson(response.body().toString(), ClaseObjetoAPI.class);
            return objetoNuevo;
        }else{
            return null;
        }
    }
    
    public int almacenarFoto(String url, String path) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());

        if (response.statusCode() == 200) {
            Path filePath = Paths.get(path);
            Files.copy(response.body(), filePath, StandardCopyOption.REPLACE_EXISTING);
            return 200;
        } else {
            return response.statusCode();
        }
    }
}
