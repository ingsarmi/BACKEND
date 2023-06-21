package com.example.Clinica2.controller;

import com.example.Clinica2.persistence.entity.Paciente;

import com.example.Clinica2.service.DomicilioService;
import com.example.Clinica2.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private DomicilioService domicilioService;
    @GetMapping()
    public List<Paciente> listarTodos(){
        return this.pacienteService.listar();
    }
    @GetMapping("/{id}")
    public Optional<Paciente> buscarPaciente(@PathVariable Integer id){
        return pacienteService.buscar(id);
    }

    @PostMapping()
    public ResponseEntity<?> registrar(@RequestBody Paciente paciente){
        domicilioService.guardardomicilio(paciente.getDomicilio());
        return ResponseEntity.ok(pacienteService.guardar(paciente));

    }

    @PutMapping()
    public ResponseEntity<?> modificarpaciente(@RequestBody Paciente paciente){
        pacienteService.modificarpaciente(paciente);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        pacienteService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
