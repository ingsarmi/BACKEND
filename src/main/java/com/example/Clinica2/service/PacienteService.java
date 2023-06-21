package com.example.Clinica2.service;
import com.example.Clinica2.persistence.entity.Paciente;
import com.example.Clinica2.persistence.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;
    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }


    public Paciente guardar(Paciente paciente){
        if (pacienteRepository.save(paciente) != null) {
            return paciente;
        }
        else {
            return null;
        }
    }
    public Paciente modificarpaciente(Paciente paciente){
        if (pacienteRepository.save(paciente) != null) {
            return paciente;
        }
        else {
            return null;
        }
    }
    public void eliminar(Integer id){pacienteRepository.deleteById(id);}

    public Optional<Paciente> buscar(Integer id){
        return pacienteRepository.findById(id);
    }
}
