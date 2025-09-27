package com.gestionacademica.manrique.domain.model;

import com.gestionacademica.manrique.domain.model.enums.EstatusAlumno;

import java.time.LocalDate;
import java.util.UUID;

public class Alumno {
    private UUID id;
    private String matricula;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private LocalDate fechaIngreso;
    private EstatusAlumno estatus;

    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombreCompleto() { return nombreCompleto; }

    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public LocalDate getFechaIngreso() { return fechaIngreso; }

    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public EstatusAlumno getEstatus() { return estatus; }

    public void setEstatus(EstatusAlumno estatus) { this.estatus = estatus; }
}
