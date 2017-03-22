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
public class Boleta {
    private int boletas;

    public Boleta(int boletas) {
        this.boletas = boletas;
    }

    

    /**
     * metodo que imprime precios de las boletas
     */
    
    public void imprime_precios(){
        
        System.out.println("Precios de las boletas segun su ubicacion\n");
        System.out.println("\t\tGeneral:\tEjecutivo:\tPreferencial: \n");        
        System.out.println("\tAdultos:      \t$12.000\t$14.400\t$16.800");                                
    }    
    
    
    /** 
     * retorna boletas
     * @return boletas
     */
    public int getBoletas() {
        return boletas;
    }
    /**
     * modifica boletas
     * @param boletas 
     */
    public void setBoletas(int boletas) {
        this.boletas = boletas;
    }

    
    
}
