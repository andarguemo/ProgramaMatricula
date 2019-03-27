/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author arguedan
 */
public class Estudiante extends Persona {
    
        private String NumeroEstudiante;  
        private String Carrera;  

    public Estudiante(String NumeroEstudiante, String Carrera,  String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String numeroCedula) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, numeroCedula);
    
    }
    
    

    /**
     * @return the NumeroEstudiante
     */
    public String getNumeroEstudiante() {
        return NumeroEstudiante;
    }

    /**
     * @param NumeroEstudiante the NumeroEstudiante to set
     */
    public void setNumeroEstudiante(String NumeroEstudiante) {
        this.NumeroEstudiante = NumeroEstudiante;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    

    
    
    
    
    
    
                                      }  
