package br.com.fabio.testeSanter.controller;

import br.com.fabio.testeSanter.dto.PatientDTO;
import br.com.fabio.testeSanter.model.Patient;
import br.com.fabio.testeSanter.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    public PatientServices services;

    @PostMapping
    public Patient getPreuveVaccination(@RequestBody PatientDTO patientDTO){
        return this.services.finfByNameDtNaissance(patientDTO);
    }
}
