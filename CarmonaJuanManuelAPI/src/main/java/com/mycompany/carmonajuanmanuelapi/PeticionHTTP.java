/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carmonajuanmanuelapi;

import com.google.gson.Gson;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/**
 *
 * @author juanm
 */
public class PeticionHTTP {

     public Equipo equipoSeleccionado(String esquema, String servidor, String recurso) throws Exception {
        
        recurso = URLEncoder.encode(recurso,StandardCharsets.UTF_8);
        String direccion = esquema + servidor + recurso;
        Equipo equipoNuevo = new Equipo();
        
        HttpClient httpCliente = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();
        
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(direccion))
                .headers("Content-Type","text-plain")
                .setHeader("User-Agent","Mozilla/5.0")
                .build();
        
        HttpResponse response = httpCliente.send(request,HttpResponse.BodyHandlers.ofString());
        
        if(response.statusCode() == 200){
            Gson gson = new Gson();
            equipoNuevo= gson.fromJson(response.body().toString(), Equipo.class);
            return equipoNuevo;
        }else{
            return null;
        }
    }

}
