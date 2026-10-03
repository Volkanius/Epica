package com.epica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AvistamientoDto {

    @NotBlank(message = "La especie es obligatoria")
    private String especie;

    @NotBlank(message = "La ubicación es obligatoria")
    private String ubicacion;

    @NotNull(message = "La fecha es obligatoria")
    private LocalDate fecha;

    private String observaciones;
}