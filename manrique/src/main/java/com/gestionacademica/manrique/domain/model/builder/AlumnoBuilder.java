package com.gestionacademica.manrique.domain.model.builder;

import com.gestionacademica.manrique.domain.model.Alumno;
import com.gestionacademica.manrique.domain.model.enums.EstatusGeneral;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.UUID;

public class AlumnoBuilder {
    private final Alumno alumno = new Alumno();

    private AlumnoBuilder () { }

    public AlumnoBuilder(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        this.alumno.setNombreCompleto(nombreCompleto);
    }

    public AlumnoBuilder conId(UUID id) { alumno.setId(id); return this; }

    public AlumnoBuilder conMatricula(String matricula) {
        alumno.setMatricula(matricula != null ? matricula.trim() : null);
        return this;
    }

    public AlumnoBuilder conEmail(String email) {
        alumno.setEmail(email != null ? email.trim() : null);
        return this;
    }

    public AlumnoBuilder conTelefono(String telefono) {
        alumno.setTelefono(telefono != null ? telefono.trim() : null);
        return this;
    }

    public AlumnoBuilder conFechaIngreso(String fechaIngreso) {
        if(fechaIngreso == null || fechaIngreso.isBlank()) {
            alumno.setFechaIngreso(null);
        } else {
            try {
                alumno.setFechaIngreso(LocalDate.parse(fechaIngreso));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("La fecha ingresada no es valida");
            }
        }
        return this;
    }

    public AlumnoBuilder conEstatus(EstatusGeneral estatus) {
        alumno.setEstatus(estatus);
        return this;
    }

    public Alumno build() {
        if (alumno.getId() == null) {
           alumno.setId(UUID.randomUUID());
        }
        if (alumno.getEstatus() == null) {
            alumno.setEstatus(EstatusGeneral.ACTIVO);
        }
        if (alumno.getFechaIngreso() == null) {
            alumno.setFechaIngreso(LocalDate.now());
        }

        return alumno;
    }

}
