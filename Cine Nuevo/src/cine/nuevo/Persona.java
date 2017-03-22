/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.nuevo;

/**
 *
 * @author srgab
 */
public class Persona {
    private String numero;    
    private String nombre;
    private String apellido;
    private short edad;
    private int genero;
    private Genero genero1;

    /**
     * Constructor de la clase
     * @param numero
     * @param nombre
     * @param apellido
     * @param edad
     * @param genero 
     * @param genero1
     */
    public Persona(String numero, String nombre, String apellido, short edad, int genero,Genero genero1) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.genero1= genero1;
    }

    
    
    /**
     * Retorna numero
     * @return numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Modifica numero
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * Retorna nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * modifica apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Retorna  edad
     * @return edad
     */    
    public short getEdad() {
        return edad;
    }
    /**
     * modifica edad
     * @param edad 
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }
    /**
     * Retorna genero
     * @return genero
     */
    public Genero getGenero1() {
        return genero1;
    }
    /**
     * modifica genero
     * @param genero 
     */
    public void setGenero1(Genero genero1) {
        this.genero1 = genero1;
    }
    /**
     * retorna genero
     * @return genero
     */
    public int getGenero() {
        return genero;
    }
    /**
     * modifica genero
     * @param genero 
     */
    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    
    
}
