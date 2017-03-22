/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.nuevo;

import java.util.Scanner;

/**
 *
 * @author Gabriel Andres Zapata Morera
 * @author Mary Alejandra Zapata Tellez
 */
public class Menu {
    /**
     * Variables Globales
     */
    int fila,columna,general,vip,preferencial,tipoSilla,i,seleccion, boleta,genero;
    
    
    Sala sala;
    Pelicula pelicula;
    Boleta boletas;
    Persona persona;
    Silla silla;
    Scanner leer = new Scanner(System.in);
    /**
     * constructor de la clase
     */
    public Menu(){
        pideFilasColumnas();
        tipo();
        sala=new Sala(fila,columna,general,vip,preferencial,0);
        sala.asignaSala();
        sala.imprimeSala();
        pelicula = new Pelicula();
        pelicula.imprimePelicula();
        pideNumBoletas();
        sala.datosPersona();
        claseSilla();
        
        
        sala.datosPersona();
        sala.imprimeLosOcupados();
        
    }
    /**
     * metodo que pide filas y columnas
     */
    private void pideFilasColumnas(){
        System.out.println("Digite numero de filas: ");
        fila=leer.nextInt();
        System.out.println("Digite numero de columnas: ");
        columna=leer.nextInt();                  
    }    
    /**
     * metodo que pide cuantas son generales
     */
    private void tipoGeneral(){
        System.out.println("Cuantas son Generales: ");
        general=leer.nextInt();
        if(general>fila){
           System.out.println("La cantidad sobre pasa el numero de filas disponible ");
           tipoGeneral();

        }      
    }
    /**
     * metodo que pide cuantas son Vip
     */    
    private void tipoVIP(){
        if(general==fila){
            System.out.println("Ya no quedan asientos por asignar");            
        }else{
            System.out.println("Cuantas son Ejecutivas: ");
            vip=leer.nextInt();
            if(vip+general>fila){
                System.out.println("La cantidad sobre pasa el numero de filas disponible ");
                tipoVIP();                
            }           
        }
    }
    /**
     * metodo que pide cuantas son preferencales
     */
    private void tipoPreferencial(){   
        
        System.out.println("Cuantas son preferenciales: ");
        preferencial=leer.nextInt();
        if((general+vip+preferencial)>fila){
            System.out.println("La cantidad sobre pasa el numero de filas disponible ");
            tipoPreferencial();
        }
       
        
    }  
    /**
     * metodo que decide cuando no pedir el tipo
     */
    private void tipo(){
        tipoGeneral();
        if(general<fila){
            tipoVIP();
        }
        if(vip + general<fila){
            tipoPreferencial();
        }                                                                                
     }    
    /**
     * metodo que pide numero de boletas
     */
    private void pideNumBoletas(){
        System.out.println("\n¿Cuantas boletas desea?:  ");           
        boleta = leer.nextInt(); 
        boletas = new Boleta(boleta);
        boletas.setBoletas(boleta);
        boletas.imprime_precios();
    } /**
     * metodo que pide la clase que quiere comprar
     */
    private void claseSilla(){        
        if(boleta>0){
            for(i=0;i<boleta;i++){
        
            System.out.println("\n¿Que clase desea?");
            System.out.println("\n1). General \n2). Ejecutivo \n3). Peferencial");
            seleccion = leer.nextInt();       
            switch(seleccion){            
                case 1:                   
                    sala.sillaGeneral();
                    break;                        
                case 2:                
                    sala.sillaVIP();
                    break;              
                case 3:                
                    sala.sillaPreferencial();
                    break;        
                }                
            }      
        }
    }
    



}
