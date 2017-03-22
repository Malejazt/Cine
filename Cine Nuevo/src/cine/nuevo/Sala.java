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
public class Sala {
        
    /**
     * Atributo que aloja el numero de filas
     */
    
   private int fila;
   /**
    * Atributo que aloja el numero de columnas 
    */
   
   private int columna;
   
   /**
     * Atributo que contiene tipo general
     */
    private int general;
    /**
     * Atributo que contiene tipo ejecutivo
     */
    private int vip;
    /**
     * Atributo que contiene tipo preferencial
     */
    private int preferencial;
    /**
     * atributo que contiene numero de boletas
     */
    private int boleta;
    
    
    /**
     * Constructor la clase 
     * @param fila
     * @param columna
     * @param general
     * @param vip
     * @param preferencial 
     * @param boleta
     */
    public Sala(int fila, int columna, int general, int vip, int preferencial,int boleta) {
        this.fila = fila;
        this.columna = columna;
        this.general = general;
        this.vip = vip;
        this.preferencial = preferencial;
        this.boleta = boleta;
        
    }
    TipoSilla tipoSilla;
    Silla [][] sillaS;
    Persona persona;
    Silla silla;
    
    short edad;
    String nombre,apellido,identificacion;
    Scanner leer = new Scanner(System.in) ;    
    int contadorHombres=0,contadorMujeres=0;
    int contador,sillaE, genero;
    int tip=this.getGeneral();
    int tip2=this.general+this.vip;
    int tip3=this.general+this.vip+this.preferencial;  
    /**
     * metodo que asigna las sillas
     */
    public void asignaSala(){
        sillaS = new Silla[this.fila][this.columna];
            
            contador=1;
            for(int i = 0; i < this.fila; i++) {
                for(int j = 0; j < this.columna; j++) {   
                    Silla silla;   
                    if(i<this.getGeneral()) 
                        silla= new Silla(contador++,TipoSilla.GENERAL, null);  
                    
                    else if(i < (this.general+this.vip))
                        silla= new Silla(contador++,TipoSilla.VIP, null);
                    else 
                        silla= new Silla(contador++, TipoSilla.PREFERENCIAL, null);
                   
                    this.sillaS [i][j] = silla;
                
            }
        }
                            
    }
        /**
         * metodo que imprime la sala
         */
    public void imprimeSala(){
        
        System.out.print("\t\t AQUI ESTA LA PANTALLA");
        System.out.print("\n ---------------------------------------------------------\n\n\n");   
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {           
                if( this.sillaS[i][j].getTipo()==TipoSilla.GENERAL)
                    System.out.print("["+this.sillaS[i][j].getNumero() + "G] ");
                 else if(this.sillaS[i][j].getTipo()== TipoSilla.VIP) 
                    System.out.print("["+this.sillaS[i][j].getNumero() + "V] ");
                 else 
                    System.out.print("["+this.sillaS[i][j].getNumero() + "P] ");                               
            } 
            System.out.println();    

        }
    }
    /**
     * metodo que pide la silla en el area general
     */
    public void sillaGeneral(){   
        
        System.out.println("¿Que silla desea de la clase GENERAL? ");
        imprimeGeneral();
        sillaE= leer.nextInt(); 
        sillaE=sillaE-1;
        imprimeOcupadoGeneral();
        imprimeLosOcupados();
                                                                                             
    }
    /**
     * metodo que pide la silla en el area VIP
     */
    public void sillaVIP(){
        System.out.println("¿Que silla desea de la clase VIP?");
        imprimeVIP();
        sillaE= leer.nextInt();  
        sillaE=sillaE-1;
        imprimeOcupadolVIP();
        imprimeLosOcupados();
        
    }
    /**
     * metodo que pide la silla en el area preferencial
     */
    public void sillaPreferencial(){
        System.out.println("¿Que silla desea de la clase Preferencial?");
        imprimePreferencial();
        sillaE= leer.nextInt(); 
        sillaE=sillaE-1;
        imprimeOcupadolPreferencial();
        imprimeLosOcupados();
        
    }    
    /**
     * 
     * metodo que imprime el area general
     */
     
    public void imprimeGeneral(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.GENERAL)
                    
                    System.out.print("["+this.sillaS[i][j].getNumero() + "G] ");
                
            }
            System.out.println();    
            
        }                
   
    }
     /**
     * 
     * metodo que ocupa una silla de general
     */
    public void imprimeOcupadoGeneral(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.GENERAL)
                    if (this.sillaS[i][j].getNumero()==sillaE)                           
                        
                        this.sillaS[i][j].setPersona(persona);
 
            }
            System.out.println();    

        }                
    }
    
    
    /**
     * metodo que improme el area Vip
     */
    public void imprimeVIP(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.VIP)
                    System.out.print("["+this.sillaS[i][j].getNumero() + "V] ");
            }
            System.out.println();    
            
        }                
    }   
    /**
     * metodo que ocupa una silla de VIP
     */
    public void imprimeOcupadolVIP(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.VIP)
                    if (this.sillaS[i][j].getNumero()==sillaE)                                                            
                        this.sillaS[i][j].setPersona(persona);
                
            }
            System.out.println();    
            
        }                
    }/**
     * metodo que imprime area preferencial
     */
    public void imprimePreferencial(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.PREFERENCIAL)
                    System.out.print("["+this.sillaS[i][j].getNumero() + "P] ");
            }
            System.out.println();    
            
        }                
    } 
    /**
     * metodo que ocupa una silla en referencial
     */
    public void imprimeOcupadolPreferencial(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if( this.sillaS[i][j].getTipo()==TipoSilla.PREFERENCIAL)
                    if (this.sillaS[i][j].getNumero()==sillaE)                                                            
                        this.sillaS[i][j].setPersona(persona);     
                
            }
            System.out.println();    
            
        }                
    }    
    /**
     * intenta imprimir todas las  sillas ocupadas; pero aun no lo logra
     */
    
    public void imprimeLosOcupados(){
        for(int i = 0; i < this.fila; i++) {
            for(int j = 0; j < this.columna; j++) {   
                if((this.sillaS[i][j].getPersona())==null){
                    if( this.sillaS[i][j].getTipo()==TipoSilla.GENERAL)                    
                        System.out.print("["+this.sillaS[i][j].getNumero()+"-" + "G] ");
                    else if( this.sillaS[i][j].getTipo()==TipoSilla.VIP)
                        System.out.print("["+this.sillaS[i][j].getNumero()+"-"+ "V] ");
                    else 
                        System.out.print("["+this.sillaS[i][j].getNumero()+"-"+ "P] ");
                }else
                    System.out.print("["+this.sillaS[i][j].getNumero()+"-"+ "X] ");
                             
            }
            System.out.println();    
            
            
        }         
        
        
    }
        /**
         * metodo que recopila datos de la persona
         */
        public void datosPersona(){                           
         System.out.println("Por Favor ingrese los siguientes datos: ");
         System.out.println("\nIdentificacion: ");
         identificacion= leer.next();
         
         System.out.println("Nombre: ");
         nombre=leer.next();
         
         System.out.println("Apellido: ");
         apellido=leer.next();
         
         System.out.println("Genero:  1).MASCULINO / 2).FEMENINO: ");
         genero = leer.nextInt();    
         
         System.out.println("Edad: ");
         edad = leer.nextShort();  
                           
        if(genero==1){
            persona = new Persona(identificacion,nombre,apellido,(short)edad,0,Genero.MASCULINO);
            
            contadorHombres++;
            
            
        }else if(genero==2){
            persona = new Persona(identificacion,nombre,apellido,(short)edad,0,Genero.FEMENINO);
            contadorMujeres++;
            
        }else{
            System.out.println("GENERO DESCONOCIDO");         
                                   
        }     
        
        

    }
    /**
     * retorna fila
     * @return fila
     */
    public int getFila() {
        return fila;
    }
    /**
     * modifica fila
     * @param fila 
     */
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * retorna columna
     * @return columna
     */
    public int getColumna() {
        return columna;
    }
    /**
     * modifica columna
     * @param columna 
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }
    /**
     * retorna general
     * @return general
     */
    public int getGeneral() {
        return general;
    }
    /**
     * modifica general
     * @param general 
     */
    public void setGeneral(int general) {
        this.general = general;
    }
    /**
     * retorna vip
     * @return vip
     */
    public int getVip() {
        return vip;
    }
    /**
     * modifica vip
     * @param vip 
     */
    public void setVip(int vip) {
        this.vip = vip;
    }
    /**
     * retorna preferencial
     * @return preferencial
     */
    public int getPreferencial() {
        return preferencial;
    }
    /**
     * modifica preferencial
     * @param preferencial 
     */
    public void setPreferencial(int preferencial) {
        this.preferencial = preferencial;
    }
    /** retorna array silla
     * 
     * @return  silla[][]
     */
    public Silla[][] getSilla() {
        return sillaS;
    }
    /**
     * modifica el array
     * @param sillaS 
     */
    public void setSillas(Silla[][] sillaS) {
        this.sillaS = sillaS;
    }
    /**
     * retorna boleta
     * @return boleta
     */
    public int getBoleta() {
        return boleta;
    }
    /**
     * modifica boleta
     * @param boleta 
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }


    
    
    
    
    
    
    
    
    
 
    
    
    
}
