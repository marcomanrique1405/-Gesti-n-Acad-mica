package com.gestionacademica.manrique.domain.model;

import com.gestionacademica.manrique.domain.model.enums.EstatusGeneral;

import java.util.UUID;

public class Docente {
    private UUID id;
    private String numeroEmpleado;
    private String nombreCompleto;
    private String email;
    private String especialidad;
    private EstatusGeneral estatus;

    public UUID getId() { return id; }

    public void setId(UUID id) { this.id = id; }

    public String getNumeroEmpleado() { return numeroEmpleado; }

    public void setNumeroEmpleado(String numeroEmpleado) { this.numeroEmpleado = numeroEmpleado; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getEspecialidad() { return especialidad; }

    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public EstatusGeneral getEstatus() { return estatus; }

    public void setEstatus(EstatusGeneral estatus) { this.estatus = estatus; }

    public String getNombreCompleto() { return nombreCompleto; }

    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
}
