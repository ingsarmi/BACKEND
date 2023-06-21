package com.example.Clinica2.service;

import com.example.Clinica2.persistence.entity.Domicilio;
import com.example.Clinica2.persistence.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService {
    @Autowired
    DomicilioRepository domicilioRepository;

    public Domicilio guardardomicilio(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }
}
