/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.nuevo;

/**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Silla {
    /**
     * atributo numero
     */
    private int numero;
    /**
     * atributo tipo
     */
    private TipoSilla tipo;
    /**
     * atributo persona
     */
    private Persona persona;
    

    public Silla(int numero, TipoSilla tipo, Persona persona) {
        this.numero = numero;
        this.tipo = tipo;
        this.persona = persona;
    }

    
    
    
    
    
    
    /**
     * retorna numero
     * @return numero
     */
    
    public int getNumero() {
        return numero;
    }
    /**
     * modifica numeo
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * retorna tipo
     * @return tipo
     */
    public TipoSilla getTipo() {
        return tipo;
    }
    /**
     * modifica tipo
     * @param tipo 
     */
    public void setTipo(TipoSilla tipo) {
        this.tipo = tipo;
    }
    /**
     * retorna persona
     * @return persona
     */

    public Persona getPersona() {
        return persona;
    }
/**
 * modifica persona
 * @param persona 
 */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
