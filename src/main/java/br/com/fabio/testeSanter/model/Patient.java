package br.com.fabio.testeSanter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name= "patient")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="NOME" )
    private String nome;
    @Column(name="VACCIN" )
    private String vaccin;
    @Column(name="DATENAISSANCE" )
    private Date dateNaissance;


}
