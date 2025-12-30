//Paquete donde se encuentra el DTO de respuesta
package com.churninsight.h12_25_l_equipo_49_backend.dto;

//DTO que representa la respuesta de la API, contiene el resultado de la predicción de churn
public class ChurnResponseDTO {

    //Resultado de la predicción (Ej: "Cancela" / "no cancela")
    private String prevision;

    //Probabilidad asociada a predicción
    private double probabilidad;

    //Constructor vacío, necesario para que el spring pueda crear el objeto automáticamente
    public ChurnResponseDTO() {
    }

    //Constructor con parámetros, permite crear el DTO con los valores definidos
    public ChurnResponseDTO(String prevision, double probabilidad) {
        this.prevision = prevision;
        this.probabilidad = probabilidad;
    }

    //Getter de prevision
   public String getPrevision() {
    return prevision;
    }

    //Seter de prevision
    public void setPrevision(String prevision) {
    this.prevision = prevision;
    }

    //Getter de probabilidad
    public double getProbabilidad() {
        return probabilidad;
    }

    //Seter de probabilidad
    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }
}


