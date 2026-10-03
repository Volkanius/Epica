package com.epica.controller;

import com.epica.dto.AvistamientoDto;
import com.epica.model.Avistamiento;
import com.epica.service.AvistamientoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avistamientos")
public class AvistamientoController {

    private final AvistamientoService avistamientoService;

    public AvistamientoController(AvistamientoService avistamientoService) {
        this.avistamientoService = avistamientoService;
    }

    @PostMapping
    public ResponseEntity<Avistamiento> crearAvistamiento(
            @Valid @RequestBody AvistamientoDto avistamientoDto) {

        Avistamiento avistamiento =
                avistamientoService.crearAvistamiento(avistamientoDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(avistamiento);
    }

    // --- NUEVO ENDPOINT PARA HU-002 ---
    @GetMapping
    public ResponseEntity<List<Avistamiento>> obtenerTodos() {
        List<Avistamiento> avistamientos = avistamientoService.obtenerTodos();
        return ResponseEntity.ok(avistamientos);
    }
}