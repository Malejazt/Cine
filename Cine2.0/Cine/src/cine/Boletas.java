/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Boletas {
    /**
     * atributo de boletas
     */
    private int boletas;
    /**
     * atributo de contador de infantes
     */
    private int contador1;
    /**
     * atributo de contador de Mujeres
     */
    private int contador2;
    /**
     * atributo de contador de Hombres
     */
    private int contador3;
    /**
     * atributo de contador de Adultos Mayores
     */        
    private int contador4;
    
    /**
     * atributo de seleccion
     * 
     */
    private int seleccion;
    /**
     * Atributo de variable de control
     */
    private int varControl;
    /**
     * atributo que recibe el valor de 1
     */
    private int x;
    
    /**
     * Constructor de la clase que inicializa variables
     * @param boletas
     * 
     */
    public Boletas(int boletas) {
        this.boletas = boletas;
        
    }
    
    
    /**
     * Constructor de la clase para solo contadores
     * @param contador1
     * @param contador2
     * @param contador3
     * @param contador4 
     */
    public Boletas(int contador1, int contador2, int contador3, int contador4) {
        this.contador1 = contador1;
        this.contador2 = contador2;
        this.contador3 = contador3;
        this.contador4 = contador4;
    }
    /**
     * Variables Globales
     */
    int precioInfante = 8000;
    int precioAdulto = 12000;
    int precio_Adulto_Mayor = 10000;   
    int contadorAdultos= this.contador2+this.contador3;
    int totalInfantes=0, totalAdultos=0,totalAdultosMayores=0, totalBoletas=0;    
    int precioEjecutivo,precioPreferencial,i;
    int precio_Infante_General,precio_Adulto_General,precio_Adulto_Mayor_General;
    int precio_Infante_Ejecutivo,precio_Adulto_Ejecutivo,precio_Adulto_Mayor_Ejecutivo ;
    int precio_Infante_Preferencial,precio_Adulto_Preferencial,precio_Adulto_Mayor_Preferencial;

    
    public void acumulador(){
        
        totalInfantes =totalInfantes+(this.contador1*precioInfante);
        totalAdultos =totalAdultos + (contadorAdultos*precioAdulto);
        totalAdultosMayores = totalAdultosMayores+(this.contador4*precio_Adulto_Mayor );
        
        totalBoletas= totalBoletas+(totalInfantes+totalAdultos+totalAdultosMayores);
        
    }
    
    public void imprime_precios(){
        
        System.out.println("Precios de las boletas segun su ubicacion\n");
        System.out.println("\t\tGeneral:  \tEjecutivo:  \tPreferencial: \n");
        System.out.println("Infantes:   \t $8.000\t\t$9.600\t         $11.200" );
        System.out.println("Adultos:      \t$12.000\t\t$14.400\t         $16.800");
        System.out.println("Adultos Mayores:$10.000\t$12.000\t         $14.000");
        
        
    }
    public void precioBoletasCine(){        
        
        for(i=0;i<this.boletas;i++){
            this.getSeleccion();            
            switch(this.getSeleccion()){ //switch para el tipo de silla 
                case 1:   
                    precio_General();                    
                    break;                        
                case 2:
                    precio_Ejecutiva();                                                                                            
                    break;              
                case 3:                
                     precio_Preferencial();               
                    break;                                     
            }            
        }              
    }
    
    public void precio_General(){
        switch(this.varControl){//switch para el tipo de persona 
            case 1: 
                precio_Infante_General();
                break;                            
            case 2: 
                precio_Adulto_General();
                break;                        
            case 3:
                precio_Adulto_Mayor_General();
                break;                        
            }
    }
    
    public void precio_Ejecutiva(){
        switch(this.varControl){//switch para el tipo de persona 
            case 1: 
                precio_Infante_Ejecutivo();
                break;                            
            case 2: 
                precio_Adulto_Ejecutivo();
                break;                        
            case 3:
                precio_Adulto_Mayor_Ejecutivo();
            break;                        
        }                    
    }
    
    public void precio_Preferencial(){        
        switch(this.varControl){//switch para el tipo de persona 
            case 1: 
                precio_Infante_Preferencial();
                break;                            
            case 2: 
                precio_Adulto_Preferencial();
                break;                        
            case 3:
                precio_Adulto_Mayor_Preferencial();
                break;                        
        }
    }
    /**
     * Metodo que calcula el precio de la boleta para infantes en clase General
     */
    public void precio_Infante_General(){
        precio_Infante_General=8000 ;
        System.out.println("Precio Boleta Infante en Clase General: "+precio_Infante_General);
    }
    /**
     * Metodo que calcula el precio de la boleta para Adultos en clase General
     */
    public void precio_Adulto_General(){
        precio_Adulto_General = 12000;
        System.out.println("Precio Boleta Adulto en Clase General: "+precio_Adulto_General);
    }     
    /**
     * Metodo que calcula el precio de la boleta para Adultos Mayores en clase General
     */
    public void precio_Adulto_Mayor_General(){
        precio_Adulto_Mayor_General=10000;
        System.out.println("Precio Boleta Adulto Mayor en Clase General: "+precio_Adulto_Mayor_General);
    }         
    /**
     * Metodo que calcula el precio de la boleta para infantes en clase Ejecutivo
     */
    public void precio_Infante_Ejecutivo(){
        precio_Infante_Ejecutivo=8000+((8000*20)/100);
        System.out.println("Precio Boleta Infante en Clase Ejecutivo: "+precio_Infante_Ejecutivo);
    }
    /**
     * Metodo que calcula el precio de la boleta para Adultos en clase Ejecutivo
     */
    public void precio_Adulto_Ejecutivo(){
        precio_Adulto_Ejecutivo=12000+((12000*20)/100);
        System.out.println("Precio Boleta Adulto en Clase Ejecutivo: "+precio_Adulto_Ejecutivo);
    }     
    /**
     * Metodo que calcula el precio de la boleta para Adulto Mayor en clase Ejecutivo
     */
    public void precio_Adulto_Mayor_Ejecutivo(){
        precio_Adulto_Mayor_Ejecutivo=10000+((10000*20)/100);
        System.out.println("Precio Boleta Adulto Mayor en Clase Ejecutivo: "+precio_Adulto_Mayor_Ejecutivo);
     }  
    /**
     * Metodo que calcula el precio de la boleta para Infante en clase Preferencial
     */
    public void precio_Infante_Preferencial(){
        precio_Infante_Preferencial=8000+((8000*40)/100);
        System.out.println("Precio Boleta Infante en Clase Preferencial: "+precio_Infante_Preferencial);         
    }
    /**
     * Metodo que calcula el precio de la boleta para Adulto en clase preferencial
     */    
    public void precio_Adulto_Preferencial(){
        precio_Adulto_Preferencial=12000+((12000*40)/100);
        System.out.println("Precio Boleta Adulto en Clase Preferencial: "+precio_Infante_Preferencial);
    }
    /**
     * Metodo que calcula el precio de la boleta para Adulto Mayor en clase preferencial
     */    
    public void precio_Adulto_Mayor_Preferencial(){
        precio_Adulto_Mayor_Preferencial=10000+((10000*40)/100);
        System.out.println("Precio Boleta Adulto Mayor en Clase Preferencial: "+precio_Infante_Preferencial);
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
    /**
     * retorna contador1 que es el contador de infantes
     * @return contador1
     */
    public int getContador1() {
        return contador1;
    }
    /**
     * modifica contador1
     * @param contador1 
     */
    public void setContador1(int contador1) {
        this.contador1 = contador1;
    }
    /**
     * retorna contador 2, que es el contador de mujeres
     * @return contador2
     */
    public int getContador2() {
        return contador2;
    }
    /**
     * modifica contador2
     * @param contador2 
     */
    public void setContador2(int contador2) {
        this.contador2 = contador2;
    }
    /**
     * retorna contador 3 que es el contador de Hombres
     * @return contador3
     */
    public int getContador3() {
        return contador3;
    }
    /**
     * modifica contador3
     * @param contador3 
     */
    public void setContador3(int contador3) {
        this.contador3 = contador3;
    }
    /**
     * retorna contador4 que es el contador de Adultos mayores
     * @return contador4
     */
    public int getContador4() {
        return contador4;
    }
    /**
     * modifica contador4
     * @param contador4 
     */
    public void setContador4(int contador4) {
        this.contador4 = contador4;
    }
    /**
     * retorna seleccion 
     * @return 
     */
    public int getSeleccion() {
        return seleccion;
    }
    /**
     * modifica seleccion
     * @param seleccion 
     */
    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
    
    
}
