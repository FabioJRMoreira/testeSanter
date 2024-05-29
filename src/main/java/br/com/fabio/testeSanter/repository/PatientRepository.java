package br.com.fabio.testeSanter.repository;

import br.com.fabio.testeSanter.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    Optional<Patient> findByNomeAndDateNaissance(String name,Date dtNaissance);
}
