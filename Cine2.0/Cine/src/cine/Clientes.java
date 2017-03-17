/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 *
 *  @author Mary Alejandra Zapata Tellez
 *  @author Gabriel Andres Zapata Morera
 */
public class Clientes {
    
    /**
     * atributo para el numero de boletas compradas
     */
    private int boletas;
    /**
     * atributo para el numero de Boletas compradas para Niños
     */
    private int numInfante;
    /**
     * atributo para el numero de Boletas compradas para Mujeres
     */
    private int numMujeres;
    /**
     * atributo para el numero de Boletas compradas para Hombres
     */
    private int numHombres;
    /**
     * atributo para el numero de Boletas compradas para Adultos Mayores
     */
    private int num_Adultos_Mayores;
    
    
    
    /**
     * Constructor de la clase que inicializa variables
     * 
     * @param boletas
     * @param numInfante
     * @param numMujeres
     * @param numHombres
     * @param num_Adultos_Mayores 
     
     */
    public Clientes(int boletas, int numInfante, int numMujeres, int numHombres, int num_Adultos_Mayores) {
        this.boletas = boletas;
        this.numInfante = numInfante;
        this.numMujeres = numMujeres;
        this.numHombres = numHombres;
        this.num_Adultos_Mayores = num_Adultos_Mayores;        
    }
    /**
    * Variables globales para los diferentes metodos
    */
    public byte i=0;
    public String nombre1,nombre2,nombre3,nombre4;
    public long identificacion1,identificacion2,identificacion3,identificacion4;
    public int contador1=0,contador2=0,contador3=0,contador4=0;
    public Scanner leerS = new Scanner(System.in);
    public Scanner leer = new Scanner(System.in);
   
    //public Sala salas = new Sala (boletas);
    
    /**
     * Metodo Que contiene los diferentes metodos de esta clase
     */
    public void enviarDatos(){
        
        if(this.numInfante>0){
            datosInfante();
        }
        if(this.numMujeres>0){
            datosMujer();
        }     
        if(this.numHombres>0){
            datosHombre();
        }    
        if(this.num_Adultos_Mayores>0){
            datosAdultoMayor();
        }
        imprime_Numero_Clientes();
        
    }
    
    /**
     * Metodo que recoge los datos del Infante 
     */
    public void datosInfante(){
        
        for(i=0;i<this.numInfante;i++){
            System.out.println("Ingrese Nombre del Infante: ");
            nombre1 = leerS.nextLine();
            System.out.println("Identificacion: ");
            identificacion1 = leer.nextLong();
            System.out.println("Tipo Boleta: Infante");
            contador1++;
        }
    }
    /**
    * Metodo que recoge los datos del adulto Mujer
    */
    public void datosMujer(){       
        
        for(i=0;i<this.numMujeres;i++){
            System.out.println("\nIngrese Nombre del Adulto M: ");
            nombre2 = leerS.nextLine();
            System.out.println("Identificacion: ");
            identificacion2 = leer.nextLong();
            System.out.println("Tipo Boleta: Adulto");    
            contador2++;
        }
    }
    /**
    * Metodo que recoge los datos del adulto Hombre
    */
    public void datosHombre(){  
        
        for(i=0;i<this.numHombres;i++){
            System.out.println("\nIngrese Nombre del Adulto H: ");
            nombre3 = leerS.nextLine();
            System.out.println("Identificacion: ");
            identificacion3 = leer.nextLong();
            System.out.println("Tipo Boleta: Adulto");       
            contador3++;
        }
    }
    /**
    * Metodo que recoge los datos del adulto Mayor
    */
    public void datosAdultoMayor(){   
        for(i=0;i<this.num_Adultos_Mayores;i++){
            System.out.println("\nIngrese Nombre del Adulto Mayor: ");
            nombre4 = leerS.nextLine();
            System.out.println("Identificacion: ");
            identificacion4 = leer.nextLong();
            System.out.println("Tipo Boleta: Adulto Mayor");        
            contador4++;
        }
    }
    
    public void imprime_Numero_Clientes(){
        int contador=contador1+contador2+contador3+contador4;
        System.out.println("\nNumero de personas en Total: "+contador);
        System.out.println("\nNumero de Infantes: "+contador1);
        System.out.println("\nNumero de Mujeres: "+contador2);
        System.out.println("\nNumero de Hombres: "+contador3);
        System.out.println("\nNumero de Adultos Mayores: "+contador4);
        
        Boletas clientes1= new Boletas(contador1,contador2,contador3,contador4);
        
        
    }
    
    
   
    
    
    
    
    
    
    
    
    /**
     * retorna el numero de boletas
     * @return boletas
     */
    public int getBoletas() {
        return boletas;
    }
    /**
     * Modifica el numero de boletas
     * @param boletas 
     */    
    public void setBoletas(int boletas) {
        this.boletas = boletas;
    }
    /**
     * retorna el numero de boletas para infantes
     * @return numInfante
     */
    public int getNumInfante() {
        return numInfante;
    }
    /**
     * Modifica el numero de boletas para Infantes
     * @param numInfante 
     */
    public void setNumInfante(int numInfante) {
        this.numInfante = numInfante;
    }
    /**
     * Retorna el numero de boletas para mujeres
     * @return numMujeres
     */
    public int getNumMujeres() {
        return numMujeres;
    }
    /**
     * Modifica el numero de boletas para mujeres
     * @param numMujeres 
     */
    public void setNumMujeres(int numMujeres) {
        this.numMujeres = numMujeres;
    }
    /**
     * Retorna el numero de boletas para Hombres
     * @return numHombres
     */
    public int getNumHombres() {
        return numHombres;
    }
    /**
     * Modifica el numero de boletas para hombres 
     * @param numHombres 
     */
    public void setNumHombres(int numHombres) {
        this.numHombres = numHombres;
    }
    /**
     * Retorna el numero de boletas para adultos mayores
     * @return num_Adultos_Mayores
     */
    public int getNum_Adultos_Mayores() {
        return num_Adultos_Mayores;
    }
    /**
     * Modifica el numero de boletas para adultos mayores
     * @param num_Adultos_Mayores 
     */
    public void setNum_Adultos_Mayores(int num_Adultos_Mayores) {
        this.num_Adultos_Mayores = num_Adultos_Mayores;
    }
    
    
    
    
}
