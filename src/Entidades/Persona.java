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




public class Persona {
    
    
    
   private String Nombre;
   private String ApellidoPaterno;
   private String ApellidoMaterno; 
   private Date FechaNacimiento; 
   private String NumeroCedula;   
    
    
      public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String numeroCedula) {
        this.Nombre = nombre;
        this.ApellidoPaterno = apellidoPaterno;
        this.ApellidoMaterno = apellidoMaterno;
        this.FechaNacimiento = fechaNacimiento;
        this.NumeroCedula = numeroCedula;
    }
    
    
    
    
    

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    /**
     * @param ApellidoPaterno the ApellidoPaterno to set
     */
    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    /**
     * @return the ApellidoMaterno
     */
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    /**
     * @param ApellidoMaterno the ApellidoMaterno to set
     */
    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    /**
     * @return the FechaNacimiento
     */
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento the FechaNacimiento to set
     */
    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return the NumeroCedula
     */
    public String getNumeroCedula() {
        return NumeroCedula;
    }

    /**
     * @param NumeroCedula the NumeroCedula to set
     */
    public void setNumeroCedula(String NumeroCedula) {
        this.NumeroCedula = NumeroCedula;
    }
    

   
   
    
   
   
   
   
   
   
   
   

    
    
    
    
}// end class
