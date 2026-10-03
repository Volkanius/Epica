package com.epica.service;

import com.epica.dto.AvistamientoDto;
import com.epica.model.Avistamiento;
import com.epica.repository.AvistamientoRepository;
import org.springframework.stereotype.Service;

@Service
public class AvistamientoService {

    private final AvistamientoRepository avistamientoRepository;

    public AvistamientoService(AvistamientoRepository avistamientoRepository) {
        this.avistamientoRepository = avistamientoRepository;
    }

    public Avistamiento crearAvistamiento(AvistamientoDto avistamientoDto) {

        Avistamiento avistamiento = new Avistamiento();

        avistamiento.setEspecie(avistamientoDto.getEspecie());
        avistamiento.setUbicacion(avistamientoDto.getUbicacion());
        avistamiento.setFecha(avistamientoDto.getFecha());
        avistamiento.setObservaciones(avistamientoDto.getObservaciones());

        return avistamientoRepository.save(avistamiento);
    }
}