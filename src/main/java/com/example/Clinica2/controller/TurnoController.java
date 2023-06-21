package com.example.Clinica2.controller;


import com.example.Clinica2.persistence.entity.Paciente;
import com.example.Clinica2.persistence.entity.Turno;

import com.example.Clinica2.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/turno")
public class TurnoController {
    @Autowired
    TurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Turno turno){
        return ResponseEntity.ok(turnoService.guardarTurno(turno));
    }

    @GetMapping()
    public List<Turno> listarTodos(){
        return this.turnoService.listarTurnos();
    }

    @PutMapping()
    public ResponseEntity<?> modificarturno(@RequestBody Turno turno){
        return ResponseEntity.ok(turnoService.modificarturno(turno));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarturno(@PathVariable Integer id){
        turnoService.eliminarturno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
