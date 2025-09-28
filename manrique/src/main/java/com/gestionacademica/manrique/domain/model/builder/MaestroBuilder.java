package com.gestionacademica.manrique.domain.model.builder;

import com.gestionacademica.manrique.domain.model.Maestro;
import com.gestionacademica.manrique.domain.model.enums.EstatusGeneral;

import java.util.UUID;

public class MaestroBuilder {
    Maestro maestro = new Maestro();

    private MaestroBuilder() { }

    public MaestroBuilder(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        this.maestro.setNombreCompleto(nombreCompleto);
    }

    public MaestroBuilder conNumeroEmpleado(String numeroEmpleado) {
        maestro.setNumeroEmpleado(numeroEmpleado != null ? numeroEmpleado.trim().toUpperCase() : null);
        return this;
    }

    public MaestroBuilder conId(UUID id) { maestro.setId(id); return this; }

    public MaestroBuilder conEmail(String email) {
        maestro.setEmail(email != null ? email.trim() : null);
        return this;
    }

    public MaestroBuilder conEspecialidad(String especialidad) {
        maestro.setEspecialidad(especialidad != null ? especialidad.trim() : null);
        return this;
    }

    public MaestroBuilder activo() { maestro.setEstatus(EstatusGeneral.ACTIVO); return this; }
    public MaestroBuilder inactivo() {maestro.setEstatus(EstatusGeneral.INACTIVO); return this; }

    public Maestro build() {
        if (maestro.getId() == null) {
            maestro.setId(UUID.randomUUID());
        }
        if (maestro.getEstatus() == null) {
            maestro.setEstatus(EstatusGeneral.ACTIVO);
        }
        return maestro;
    }

}
