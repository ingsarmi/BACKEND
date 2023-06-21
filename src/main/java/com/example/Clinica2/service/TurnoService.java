package com.example.Clinica2.service;

import com.example.Clinica2.persistence.entity.Odontologo;
import com.example.Clinica2.persistence.entity.Paciente;
import com.example.Clinica2.persistence.entity.Turno;
import com.example.Clinica2.persistence.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;

    public Turno guardarTurno(Turno turno){
        return turnoRepository.save(turno);

    }

    public List<Turno> listarTurnos(){
        return turnoRepository.findAll();
    }

    public Turno modificarturno(Turno turno){
        return turnoRepository.save(turno);
    }

    public void eliminarturno(Integer id){turnoRepository.deleteById(id);}

}
