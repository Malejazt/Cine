/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author Mary Alejandra Zapata Tellez
 * @author Gabriel Andres Zapata Morera
 * 
 */
public class Peliculas {

    /**
    * Atributo que aloja el tipo de pelicula en valor numerico
    */
    private int tipoPel;
    /**
     * Constructor de la clase que inicializa variables
     * @param tipoPel 
     */
    public Peliculas(int tipoPel) {
        this.tipoPel = tipoPel;
    }
    
    public Peliculas(){
        
        tipoPelicula();
        
        
    }
    
    int terror;

    /**
     * metodo para seleccionar segun el genero elegido, las peliculas correspondientes
     */
   public void tipoPelicula(){
        Scanner pelicula1 = new Scanner(System.in);
        switch(this.tipoPel){            
            case 1:
                System.out.println("Usted eligio terror, las peliculas de este genero son las siguientes.\n Por favor eliga una: ");
                System.out.println("1).El Resplandeciente \n2).Los Sin Cara \n3).Siniestro");
                terror = pelicula1.nextInt();
                terror1();                
                break;            
            case 2:
                System.out.println("Usted eligio Aventura, las peliculas de este genero son las siguientes.\n Por favor eliga una: ");
                System.out.println("1).Una aventura en Otro Mundo \n2).Un Alien en Apuros \n3).Un Paseo");
                terror = pelicula1.nextInt();
                aventura1();
                break;                
            case 3:
                System.out.println("Usted eligio Accion, las peliculas de este genero son las siguientes.\n Por favor eliga una: ");
                System.out.println("1).La guerra de Los Universos \n2).60 Minutos \n3).Z-Men");
                terror = pelicula1.nextInt();
                accion1();
                break;                                
        }        
    }
    /**
     * metodo que contiene la informacion de cada pelicula por Genero
     */
   public void terror1(){
       switch(terror){
                    case 1:
                        System.out.println("Nombre: El Resplandeciente");
                        System.out.println("Duracion: 170 min.");
                        System.out.println("Clasificacion: Mayores de 18");
                        System.out.println("Actores: Rafael White, Taylor H. Flores, Scott B. Kiefer, Desire R. Ables, Edith D. Hazeltine\n");
                        break;                        
                    case 2:
                        System.out.println("Nombre: Los Sin Cara");
                        System.out.println("Duracion: 150 min.");
                        System.out.println("Clasificacion: Mayores de 18");
                        System.out.println("Actores: Reita B. McVey, Paula T. Thompson, Jane F. Adkins, Laura L. Bull, Barry H. Stout\n");
                        break;                        
                    case 3:
                        System.out.println("Nombre: Siniestro");
                        System.out.println("Duracion: 200 min.");
                        System.out.println("Clasificacion: Mayores de 18");
                        System.out.println("Actores: Genevieve B. Jones, Natasha Parker, Brooke Spencer,  Sofia Begum, Zoe Fraser\n");
                        break;                                              
                }
   }
   /**
    * metodo que contiene la informacion de cada pelicula por Genero
    */
   public void aventura1(){
       switch(terror){
                    case 1:
                        System.out.println("Nombre: Una aventura en Otro Mundo");
                        System.out.println("Duracion: 190 min.");
                        System.out.println("Clasificacion: Mayores de 12");
                        System.out.println("Actores: Rafael White, Taylor H. Flores, Scott B. Kiefer, Desire R. Ables, Edith D. Hazeltine\n");
                        break;                        
                    case 2:
                        System.out.println("Nombre: Un Alien en Apuros");
                        System.out.println("Duracion: 210 min.");
                        System.out.println("Clasificacion: Mayores de 14");
                        System.out.println("Actores: Reita B. McVey, Paula T. Thompson, Jane F. Adkins, Laura L. Bull, Barry H. Stout\n");
                        break;                        
                    case 3:
                        System.out.println("Nombre: Un Paseo");
                        System.out.println("Duracion: 200 min.");
                        System.out.println("Clasificacion: Mayores de 12");
                        System.out.println("Actores: Genevieve B. Jones, Natasha Parker, Brooke Spencer,  Sofia Begum, Zoe Fraser\n");
                        break;                                              
                }
   }
    /**
     * metodo que contiene la informacion de cada pelicula por Genero
     */
    public void accion1(){        
        switch(terror){
                    case 1:
                        System.out.println("Nombre: La guerra de Los Universos");
                        System.out.println("Duracion: 190 min.");
                        System.out.println("Clasificacion: Mayores de 16");
                        System.out.println("Actores: Rafael White, Taylor H. Flores, Scott B. Kiefer, Desire R. Ables, Edith D. Hazeltine\n");
                        break;                        
                    case 2:
                        System.out.println("Nombre: 60 Minutos");
                        System.out.println("Duracion: 215 min.");
                        System.out.println("Clasificacion: Mayores de 16");
                        System.out.println("Actores: Reita B. McVey, Paula T. Thompson, Jane F. Adkins, Laura L. Bull, Barry H. Stout\n");
                        break;                        
                    case 3:
                        System.out.println("Nombre: Z-Men");
                        System.out.println("Duracion: 200 min.");
                        System.out.println("Clasificacion: Mayores de 14");
                        System.out.println("Actores: Genevieve B. Jones, Natasha Parker, Brooke Spencer,  Sofia Begum, Zoe Fraser\n");
                        break;                                              
                }
    }
    
 
    /**
     * retorna el tipo de pelicula en valor numerico
     * @return 
     */
    public int getTipoPel() {
        return tipoPel;
    }
    /**
     * modifica el tipo de pelicula en valor numerico
     * @param tipoPel 
     */
    public void setTipoPel(int tipoPel) {
        this.tipoPel = tipoPel;
    }
        
        
        
        
        
    
    
    
    
    
}
