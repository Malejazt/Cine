/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 * @author Mary Alejandra Zapata Tellez
 * @author Gabriel Andres Zapata Morera
 */
public class Menu {
           
    public int filas, columnas,general,preferencial,ejecutivo,tipoPel, boletas, numInfante,numMujeres, numHombres,num_Adultos_Mayores;              
    public Scanner leer;
    
    public int varControl;
              
    public Menu() {
        leer= new Scanner(System.in);        
        pedirDatos();
        clasificarSillasGenerales();
        clasificarSillasEjecutivas();
        clasificarSillasPreferencial();
       
        datosCliente(); 
        //do{
        //elegir_Tipo_Pelicula();
        enviarDatos();  
       // }while(s==1);
    }

    
    /**
     * Metodo que pide el numero de filas y el de columnas 
     */
    
    private void pedirDatos(){       
        leer = new Scanner(System.in);  
        
        System.out.println("Ingrese numero de filas");
        filas = leer.nextInt();
      
        System.out.println("Ingrese numero de columnas");
        columnas = leer.nextInt();                       
    }
    /**
     * Metodo que Clasifica el numero de filas Generales
     */
    private void clasificarSillasGenerales(){     
        
        System.out.println("Cuantas filas son Generales");
        general= leer.nextInt();
        
        if(general>filas){
            System.out.println("Cantidad Digitada sobre pasa el numero de filas"); 
            clasificarSillasGenerales();
        }
        
    }
    /**
     * Metodo que Clasifica el numero de filas ejecutivas
     */
    private void clasificarSillasEjecutivas(){     
        
        System.out.println("Cuantas filas son Ejecutivas");
        ejecutivo= leer.nextInt();
        
        if(filas<(general+ejecutivo)){
            System.out.println("Cantidad Digitada sobre pasa el numero de filas"); 
            clasificarSillasEjecutivas();
        }
        
    }
    /**
     * Metodo que Clasifica el numero de filas Preferenciales
     */    
    private void clasificarSillasPreferencial(){     
        
        System.out.println("Cuantas filas son Preferenciales");
        preferencial= leer.nextInt();
        
        if(filas<(general+ejecutivo+preferencial)){
            System.out.println("Cantidad Digitada sobre pasa el numero de filas"); 
            clasificarSillasPreferencial();
        }
        
    }       
   
    /**
     * Metodo que envia datos a la Clase peliculas para elegir el tipo de pelicula
     */             
    private void datosCliente(){      
        Sillas silla= new Sillas(filas,columnas);
        Sillas tipo = new Sillas(general,ejecutivo,preferencial);
             
        Sala sillas=new Sala(silla,tipo);               
        sillas.clasificacionSala(); 

        System.out.println("\nQue genero desea ver: ");
        System.out.println("1). Terror \n2). Aventura \n3). Accion");
        tipoPel= leer.nextInt();
        
        Peliculas pelicula = new Peliculas(tipoPel);
        pelicula.tipoPelicula();

        sillas.pideNumBoletas();                
        sillas.pide_Tipo_Silla();
        sillas.claseSilla();
        
    }  
    /**
     * metodo que recolecta los datos de los clientes
     */
    private void enviarDatos(){
        System.out.println("\n¿Cuantas son para Infantes?:  ");
        numInfante = leer.nextInt();        
        System.out.println("\n¿Cuantas son para Mujeres ?:  ");
        numMujeres = leer.nextInt();
        System.out.println("\n¿Cuantas son para Hombres?:  ");
        numHombres = leer.nextInt();
        System.out.println("\n¿Cuantas son para Adultos mayores?:  ");
        num_Adultos_Mayores = leer.nextInt();
        
        if(numInfante>0){
            varControl = 1;         
        }
        if((numMujeres>0)||(numHombres>0)){
            varControl = 2;         
        }
        if(num_Adultos_Mayores>0){
            varControl = 3;         
        }
        Boletas boleta = new Boletas(varControl);
        
        Clientes clientes = new Clientes(boletas,numInfante,numMujeres,numHombres,num_Adultos_Mayores);
        
        clientes.enviarDatos();
               
    }   
    
    private void preciosBoletas(){
        
        
        
        
        
    }
}
