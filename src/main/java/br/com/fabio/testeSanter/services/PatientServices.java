package br.com.fabio.testeSanter.services;

import br.com.fabio.testeSanter.dto.PatientDTO;
import br.com.fabio.testeSanter.model.Patient;
import br.com.fabio.testeSanter.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class PatientServices {
    @Autowired
    public PatientRepository patientRepository;

    public Patient finfByNameDtNaissance(PatientDTO patientDTO){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        Optional<Patient> optPatient = this.patientRepository.findByNomeAndDateNaissance(patientDTO.getNome(),patientDTO.getDateNaissance());
        if (optPatient.isPresent()){
            if(optPatient.get().getVaccin().contains("2 COVID"))
            {
                return optPatient.get();
            }
        }

        return null;
    }
}
