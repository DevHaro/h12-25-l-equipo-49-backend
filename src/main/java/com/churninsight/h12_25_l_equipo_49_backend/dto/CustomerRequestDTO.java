//Paquete donde se encuentra el DTO, DTO se usa para transportar datos entre capas (request/response)
package com.churninsight.h12_25_l_equipo_49_backend.dto;

//Importaciones de validaciones de Jakarta,
// estas anotaciones permiten validar los datos que llegan desde el cliente (JSON)
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//DTO representan los datos de entradas que recibe la API, cuando se solicita una predicción de churn
public class CustomerRequestDTO {

    //Tiempo que el cliente lleva el servicio (en meses), este no puede ser nulo y no puede ser negativo
    @NotNull(message = "tenure es obligatorio")
    @Min(value = 0, message = "tenure no puede ser negativo")
    private Integer tenure;

    //Cargo mensual del cliente, no puede ser nulo y debe ser mayor o igual a 0
    @NotNull(message = "monthlyCharges es obligatorio")
    @DecimalMin(value = "0.0", inclusive = true, message = "monthlyCharges no puede ser negativo")
    private Double monthlyCharges;

    //Tipo de contrato del cliente ( Ej: mensual, anual), no puede venir vacio ni nulo
    @NotBlank(message = "contract es obligatorio")
    private String contract;

    @NotBlank(message = "paymentMethod es obligatorio")
    private String paymentMethod;

    // GETTERS Y SETTERS, permiten acceder y modificar los atibutos privados de la clase

    public Integer getTenure() {
        return tenure;
    }

    public void setTenure(Integer tenure) {
        this.tenure = tenure;
    }

    public Double getMonthlyCharges() {
        return monthlyCharges;
    }

    public void setMonthlyCharges(Double monthlyCharges) {
        this.monthlyCharges = monthlyCharges;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
