/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 * Clase que representa la sala y su impresion
 * 
 * @author Mary Alejandra Zapata Tellez
 * @author Gabriel Andres Zapata Morera
 */
public class Sala {
    
    /**
     *  Atributo que contiene filas y columnas
     */
    private Sillas silla;
    /**
     * Atributo que contiene el tipo de silla
     */
    private Sillas tipo;
    /**
     * Atributo que contiene un valor para un switch
     */    
    private int seleccion;
    /**
     * Atributo que contiene el numero de boletas
     */
    private Boletas boleta;
    
    /**
     * constructor de clase
     * @param silla
     * @param tipo
     
     */
    public Sala(Sillas silla, Sillas tipo) {
        this.silla = silla;
        this.tipo = tipo;
        //this.seleccion = seleccion;                
    }
    /**
     * Constructor de la clase de solo boletas
     * @param boleta 
     */
    public Sala(Boletas boleta)
    {
        this.boleta= boleta;
    }
    /**
     * Constructor de la clase solo para selecciom
     * @param seleccion 
     */
    public Sala(int seleccion) {
        this.seleccion = seleccion;
    }
    
    
    
    /**
     * variables globales
     */
    public Scanner leer = new Scanner(System.in);
    int i,j,k,fila1,columna1,boletas,cont = 0;   
   
    /**
     * metodo que clasifica e imprime la clasificacion de la sala, ya sea 
     * General, Ejecutiva y Preferencial.
     */
    public void clasificacionSala(){ 
        System.out.print("\t\t AQUI ESTA LA PANTALLA");
        System.out.print("\n ---------------------------------------------------------\n\n\n");                 
                       
            validacionGeneral();  
            validacionEjecutiva();
            validacionPreferencial();                
    }
    /**
     * Metodo que imprime las sillas generales
     */
    public void validacionGeneral(){ 
        int tip=tipo.getTipoGeneral();        
        int columna=silla.getColumnas();
        if(tip>0){
                System.out.print("------------------------- General ------------------------- \n");
        }   
         for( j=0; j<tip; j++){                                                                        
            for( k=0; k<columna; k++){ 
                System.out.print((j+1)+"-"+(k+1)+"[  ] \t ");                                                                                                                                                                    
            }                                      
            System.out.println();
         }           
    }
    /**
     * metodo que imprime las sillas ejecutivas
     */
    public void validacionEjecutiva(){
        int tip=tipo.getTipoGeneral();
        int tip2=tipo.getTipoGeneral()+tipo.getTipoEjecutivo();        
        int columna=silla.getColumnas();
        if(tipo.getTipoEjecutivo()>0){
            System.out.print("\n------------------------- Ejecutivo ------------------------- \n");   
        }  
        for( j=tip; j<tip2; j++){                                                                      
            for( k=0; k<columna; k++){ 
                System.out.print((j+1)+"-"+(k+1)+"[  ] \t ");                                                                                                                                                                    
            }
            System.out.println();
        }                
    }
    /**
     * metodo que imprime las sillas preferenciales
     */
    public void validacionPreferencial(){       
        int tip2=tipo.getTipoGeneral()+tipo.getTipoEjecutivo();
        int tip3=tipo.getTipoGeneral()+tipo.getTipoEjecutivo()+tipo.getTipoPreferencial();        
        int columna=silla.getColumnas();
        if(tipo.getTipoPreferencial()>0){
            System.out.print("\n------------------------ Preferencial ------------------------- \n");   
        }
        for( j=tip2; j<tip3; j++){                                                                       
            for( k=0; k<columna; k++){ 
                System.out.print((j+1)+"-"+(k+1)+"[  ] \t ");                                                                                                                                                                    
            }                                     
            System.out.println();
        } 
        
    }
    /**
     * metodo que pide el numero de boletas
     */
    public void pideNumBoletas(){
        System.out.println("\n¿Cuantas boletas desea?:  ");        
        boletas = leer.nextInt(); 
        boletas = boletas-1;    // se resta uno, poque de alguna forma suma 1 a la cantidad de boletas
        Boletas boleta = new Boletas(boletas);
        
    }
    /**
     * Metodo que pide el asiento que quiere ocupar el cliente en la Sala
     */
    public void pide_Tipo_Silla(){  
        int x=1;
        Boletas precio = new Boletas(x);
        precio.imprime_precios();
        
        if(boletas>0){
            for(i=0;i<boletas;i++){   
                
                  claseSilla();                                               
            }        
        }
    }
    /**
     * Metodo que selecciona la clase de silla de la sala
     */
    public void claseSilla(){
        
        System.out.println("\n¿Que clase desea?");
        System.out.println("\n1). General \n2). Ejecutivo \n3). Peferencial");
        seleccion = leer.nextInt();
        Boletas seleccion1 = new Boletas(seleccion);
        
        switch(seleccion){            
            case 1:   
                
                numero_Silla_General();                
                break;                        
            case 2:
                
                numero_Silla_ejecutivas();                                                        
                break;              
            case 3:                
                numero_Silla_Preferencial();
                break;        
        }                
    }
    /**
     * metodo que elige la silla del area General
     */
    public void numero_Silla_General(){        
        System.out.println("¿Que silla desea de la clase GENERAL?, por favor digite la fila y luego la columna: ");
        validacionGeneral();
        System.out.println("\nFila : ");
        fila1= leer.nextInt();
        System.out.println("Columna : ");
        columna1= leer.nextInt();        
        System.out.print("\n\t\t AQUI ESTA LA PANTALLA");
        System.out.print("\n ---------------------------------------------------------"); 
        System.out.print("\n \n");   
        xGeneral();                                                                               
    }
    /**
     * metodo que elije la silla del area ejecutiva
     */
    public void numero_Silla_ejecutivas(){
        System.out.println("¿Que silla desea de la clase EJECUTIVO?, por favor digite la fila y luego la columna: ");
        validacionEjecutiva();
        System.out.println("\nFila : ");
        fila1= leer.nextInt();
        System.out.println("Columna : ");
        columna1= leer.nextInt();
        System.out.print("\n\t\t AQUI ESTA LA PANTALLA");
        System.out.print("\n ---------------------------------------------------------"); 
        System.out.print("\n \n");   
        xEjecutiva();         
    }
    /**
     * metodo que elije la silla del area preferencial
     */
    public void numero_Silla_Preferencial(){
        System.out.println("¿Que silla desea de la clase PREFERENCIAL?, por favor digite la fila y luego la columna: ");
        validacionPreferencial();
        System.out.println("\nFila : ");
        fila1= leer.nextInt();
        System.out.println("Columna : ");
        columna1= leer.nextInt();
        System.out.print("\n\t\t AQUI ESTA LA PANTALLA");
        System.out.print("\n ---------------------------------------------------------"); 
        System.out.print("\n \n");   
        xPreferencial();    
        
    }
    
  
    /**
     * metodo que genera un asiento ocupado
     */
    public void xGeneral(){
        int tip=tipo.getTipoGeneral();        
        int columna=silla.getColumnas();        
        if(tip>0){
                System.out.print("------------------------- General ------------------------- ");
        }                         
        for( j=0; j<tip; j++){                                                    
            System.out.println();
            for( k=0; k<columna; k++){ 
                if((fila1==j+1)&&(columna1==k+1)){
                    System.out.print((j+1)+"-"+(k+1)+"[x] ");                            
                } else{
                    System.out.print((j+1)+"-"+(k+1)+"[  ] ");
                }                                                                                                                   
            }                                                   
        }                
    }
    /**
     * metodo que genera un asiento ocupado
     */
    public void xEjecutiva(){
        int tip=tipo.getTipoGeneral();
        int tip2=tipo.getTipoGeneral()+tipo.getTipoEjecutivo();               
        int columna=silla.getColumnas(); 
        if(tipo.getTipoEjecutivo()>0){
            System.out.print("\n------------------------- Ejecutivo ------------------------- ");   
        }  
        for( j=tip; j<tip2; j++){                                 
            System.out.println();
            for( k=0; k<columna; k++){                     
                if((fila1==j+1)&&(columna1==k+1)){
                    System.out.print((j+1)+"-"+(k+1)+"[x] ");                            
                } else{
                    System.out.print((j+1)+"-"+(k+1)+"[  ] ");
                }                         
            }                                                                                                       
        }                
    }
    /**
     * metodo que genera un asiento ocupado
     */
    public void xPreferencial(){        
        int tip2=tipo.getTipoGeneral()+tipo.getTipoEjecutivo();
        int tip3=tipo.getTipoGeneral()+tipo.getTipoEjecutivo()+tipo.getTipoPreferencial();        
        int columna=silla.getColumnas();  
        if(tipo.getTipoPreferencial()>0){
            System.out.print("\n------------------------ Preferencial ------------------------- ");   
        }
        for( j=tip2; j<tip3; j++){                                                             
            System.out.println();
            for( k=0; k<columna; k++){ 
                if((fila1==j+1)&&(columna1==k+1)){
                    System.out.print((j+1)+"-"+(k+1)+"[x] ");                            
                } else{
                    System.out.print((j+1)+"-"+(k+1)+"[  ] ");
                } 
            }                                                                        
        }                        
    }

            
        
    
      
    
    
    /**
     * Retorna silla
     * @return silla
     */

    public Sillas getSilla() {
        return silla;
    }
    /**
     * Modifica silla
     * @param silla 
     */
    public void setSilla(Sillas silla) {
        this.silla = silla;
    }
    /**
     * retorna tipo 
     * @return tipo
     */
    public Sillas getTipo() {
        return tipo;
    }
    /**
     * modifica tipo
     * @param tipo 
     */
    public void setTipo(Sillas tipo) {
        this.tipo = tipo;
    }
    /**
     * retorna seleccion
     * @return seleccion
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
    
    
    /**
     * retorna boletas
     * @return 
     */
    public Boletas getBoleta() {
        return boleta;
    }
    /**
     * modifica boletas
     * @param boleta 
     */
    public void setBoleta(Boletas boleta) {
        this.boleta = boleta;
    }
 
    
    
}
    
    
    
    
    

