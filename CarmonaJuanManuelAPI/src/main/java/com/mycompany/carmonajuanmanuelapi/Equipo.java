/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carmonajuanmanuelapi;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author juanm
 */
public class Equipo {
    
    @SerializedName("strTeam")
    private String nombreEquipo;
    
    @SerializedName("strStadium")
    private String estadio;
    
    @SerializedName("intFormedYear")
    private int fundacionAno;
    
    @SerializedName("intStadiumCapacity")
    private int capacidadEstadio;
    
    @SerializedName("strStadiumLocation")
    private String localizacion;
    
    @SerializedName("strDescriptionES")
    private String descripcion;
    
        
    public Equipo(){
        
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getEstadio() {
        return estadio;
    }

    public int getFundacionAno() {
        return fundacionAno;
    }

    public int getCapacidadEstadio() {
        return capacidadEstadio;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
