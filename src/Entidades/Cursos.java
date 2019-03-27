/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author arguedan
 */
public class Cursos {
    
    private String NombreCurso;
    private int NumeroEstudiantes;
    private String NombreProfesor;
    private String TipoCurso;
    private String CodigoCurso;
    

    public Cursos(String NombreCurso, String NombreProfesor, String TipoCurso, String CodigoCurso) {
        this.NombreCurso = NombreCurso;
        this.NombreProfesor = NombreProfesor;
        this.TipoCurso = TipoCurso;
        this.CodigoCurso = CodigoCurso;
    }
    
    

    
    

    /**
     * @return the NombreCurso
     */
    public String getNombreCurso() {
        return NombreCurso;
    }

    /**
     * @param NombreCurso the NombreCurso to set
     */
    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    /**
     * @return the NumeroEstudiantes
     */
    public int getNumeroEstudiantes() {
        return NumeroEstudiantes;
    }

    /**
     * @param NumeroEstudiantes the NumeroEstudiantes to set
     */
    public void setNumeroEstudiantes(int NumeroEstudiantes) {
        this.NumeroEstudiantes = NumeroEstudiantes;
    }

    /**
     * @return the NombreProfesor
     */
    public String getNombreProfesor() {
        return NombreProfesor;
    }

    /**
     * @param NombreProfesor the NombreProfesor to set
     */
    public void setNombreProfesor(String NombreProfesor) {
        this.NombreProfesor = NombreProfesor;
    }

    /**
     * @return the TipoCurso
     */
    public String getTipoCurso() {
        return TipoCurso;
    }

    /**
     * @param TipoCurso the TipoCurso to set
     */
    public void setTipoCurso(String TipoCurso) {
        this.TipoCurso = TipoCurso;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
}
