package com.example.Clinica2.service;

import com.example.Clinica2.persistence.entity.Odontologo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    private OdontologoService odontologoService;
    @Before
    public void registrarOdontologo(){
        Odontologo odontologo = new Odontologo(1,"Sergio","Sarmiento","123123");
        odontologoService.guardar(odontologo);
    }
    @Test
    public void listar() {
        List<Odontologo> odontologos = odontologoService.listar();
        Assert.assertTrue(odontologos.size()>0);
    }

    @Test
    public void guardar() {

    }

    @Test
    public void modificar() {

    }

    @Test
    public void eliminar() {

    }

    @Test
    public void buscar() {

    }
}