/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carmonaruizpreexamenapi2;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author juanm
 */
public class ClaseObjetoAPI {
    
    @SerializedName("image")
    private String imagen;
    
    @SerializedName("name")
    private String nombre;

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ClaseObjetoAPI{" + "imagen=" + imagen + ", nombre=" + nombre + '}';
    }
    

    
}
