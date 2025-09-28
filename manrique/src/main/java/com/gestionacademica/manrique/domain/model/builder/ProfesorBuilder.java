package com.gestionacademica.manrique.domain.model.builder;

import com.gestionacademica.manrique.domain.model.Profesor;
import com.gestionacademica.manrique.domain.model.enums.EstatusGeneral;
import com.gestionacademica.manrique.domain.model.enums.RolProfesor;

import java.util.UUID;

public class ProfesorBuilder {
    Profesor profesor = new Profesor();

    private ProfesorBuilder() { }

    public ProfesorBuilder(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        this.profesor.setNombreCompleto(nombreCompleto);
    }

    public ProfesorBuilder conNumeroEmpleado(String numeroEmpleado) {
        profesor.setNumeroEmpleado(numeroEmpleado != null ? numeroEmpleado.trim().toUpperCase() : null);
        return this;
    }

    public ProfesorBuilder conId(UUID id) { profesor.setId(id); return this; }

    public ProfesorBuilder conEmail(String email) {
        profesor.setEmail(email != null ? email.trim() : null);
        return this;
    }

    public ProfesorBuilder conEspecialidad(String especialidad) {
        profesor.setEspecialidad(especialidad != null ? especialidad.trim() : null);
        return this;
    }

    public ProfesorBuilder coRolMaestro() { profesor.setRolProfesor(RolProfesor.MAESTRO); return this; }
    public ProfesorBuilder conRolDocente() { profesor.setRolProfesor(RolProfesor.DOCENTE); return this; }

    public ProfesorBuilder activo() { profesor.setEstatus(EstatusGeneral.ACTIVO); return this; }
    public ProfesorBuilder inactivo() { profesor.setEstatus(EstatusGeneral.INACTIVO); return this; }

    public Profesor build() {
        if (profesor.getId() == null) {
            profesor.setId(UUID.randomUUID());
        }
        if (profesor.getEstatus() == null) {
            profesor.setEstatus(EstatusGeneral.ACTIVO);
        }
        return profesor;
    }

}
