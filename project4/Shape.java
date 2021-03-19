package com.mycompany.proyecto_git;


import java.io.PrintWriter;

/**
 * La clase Shape usa los metodos area y perimetro.
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

abstract class Shape {
    
    /**
     * Metodo vacio para la herencia
     * @param out imprimira en archivo externo
     */
   public void print(PrintWriter out) {
  
   }
   
   /**
    * Devuelve el valor del area
    * @return valor 0.
   */
   public double getArea()
   {
       return 0;
       
   }
   
   /**
     * Devuelve el perimetro
     * @return el valor 0
     */
   public double getPerimeter()
   {
       return 0;
   }
   
}
