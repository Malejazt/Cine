/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *Clase que representa las sillas segun el numero de filas y de columnas
 * @author Mary Alejandra Zapata Tellez
 * @author Gabriel Andres Zapata Morera
 */


public class Sillas {
    
    /**
     * Atributo que aloja el numero de filas
     */
    
   private int filas;
   /**
    * Atributo que aloja el numero de columnas 
    */
   
   private int columnas;
   
   /**
     * Atributo que contiene tipo general
     */
    private int tipoGeneral;
    /**
     * Atributo que contiene tipo ejecutivo
     */
    private int tipoEjecutivo;
    /**
     * Atributo que contiene tipo preferencial
     */
    private int tipoPreferencial;
    
   
   /**
    * Constructor de la clase que inicializa las variables
    * @param filas
    * @param columnas 
    */
   
   
    public Sillas(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }
    /**
     * Constructor de la clase que inicializa las variables
     * @param tipoGeneral
     * @param tipoEjecutivo
     * @param tipoPreferencial 
     */
    public Sillas(int tipoGeneral, int tipoEjecutivo, int tipoPreferencial) {
        this.tipoGeneral = tipoGeneral;
        this.tipoEjecutivo = tipoEjecutivo;
        this.tipoPreferencial = tipoPreferencial;
    }
  
    
    
    

    
    
  
    
   /**
    * Retorna el valor de filas
    * @return filas
    */ 

    public int getFilas() {
        return filas;
    }
    /**
     * Modifica filas 
     * @param filas 
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }
    /**
     * Retorna el valor de columnas
     * @return columnas
     */

    public int getColumnas() {
        return columnas;
    }
    /**
     * Modifica columnas
     * @param columnas 
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    /**
     * retorna el valor del Tipo general de las filas
     * @return tipoGeneral
     */
    
    public int getTipoGeneral() {
        return tipoGeneral;
    }
    /**
     * modifica el tipo general de las sillas
     * @param tipoGeneral 
     */
    public void setTipoGeneral(int tipoGeneral) {
        this.tipoGeneral = tipoGeneral;
    }
    /**
     * retorna el valor de tipo ejecutivo de las sillas
     * @return tipoEjecutivo
     */
    public int getTipoEjecutivo() {
        return tipoEjecutivo;
    }
    /**
     * modifica el valor de tipo ejecutivo de las sillas
     * @param tipoEjecutivo 
     */
    public void setTipoEjecutivo(int tipoEjecutivo) {
        this.tipoEjecutivo = tipoEjecutivo;
    }
    /**
     * retorna el valor de tipo  preferencial de las sillas
     * @return tipoPreferencial
     */
    public int getTipoPreferencial() {
        return tipoPreferencial;
    }
    /**
     * modifica el valor de tipo preferencial de las sillas
     * @param tipoPreferencial 
     */
    public void setTipoPreferencial(int tipoPreferencial) {
        this.tipoPreferencial = tipoPreferencial;
    }
  
   
    
   
    
}

