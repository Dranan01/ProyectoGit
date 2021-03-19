package com.mycompany.proyecto_git;


/**
 * La clase twoDimensionalShape sera usada en la herencia con otras clases.
 * Establece los metodos getPerimeter y getArea para las demas formas.
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

abstract  class TwoDimensionalShape extends Shape{
    
  
   /**
     * Este metodo devuelve el perimetro
     * @return el valor 0
     */ 
   public double getPerimeter()
   {
        return 0 ;
   }
    
   /**
     * Este metodo devuelve el area
     * @return el valor 0
     */
   public double getArea()
   {
        return 0;
   }


}
