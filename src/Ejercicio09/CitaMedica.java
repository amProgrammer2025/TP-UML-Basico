/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio09;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gauta
 */
public class CitaMedica {
    
    private LocalDate fecha;
    private LocalTime hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
