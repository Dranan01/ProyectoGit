package com.mycompany.proyecto_git;


import java.io.PrintWriter;

/**
 * Es una clase Point representada por un par de coordenadas cartesianas.
 * Esta clase no es parte de la herencia pero va a ser usada en las otras clases
 * Usa X e Y como coordenadas en el sistema. 
 *  
 * @author  Pratik Patel 
 * @version 2  Date: 16/03/2021
 */
public class Point 
{
    // Crea las variables X e Y que representan coordenadas como tipo double.
    private double x ;
    private double y;

    /**
     * El constructor por defecto que establece las coordenadas X e Y. 
     */
    public Point() 
    {
        this.x = 0.0;
        this.y = 0.0 ;
    }

    
    /**
     * Constructor que inicializa X e Y por parametros.
     * @param x valor de X
     * @param y valor de Y
     */
    public Point(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }
    
    
     /**
      * Constructor copia de Point.
      * @param pnt Punto
      */
    public Point(Point pnt)
    {
        this.x = pnt.x;
        this.y = pnt.y;
    }
    
   
     /**
     * Devuelve el valor de X 
     * @return el valor de X
     */
    public double getX() 
    {
        return x;
    }
    
    
     /**
      * Establece el valor de X
      * @param x valor de X
      */
    public void setX(double x) 
    {
        this.x = x;
    }
    
    
    /**
     * Devuelve el valor de Y 
     * @return el valor de Y
     */
    public double getY() 
    {
        return y;
    }
    
    
     /**
      * Establece el valor de Y.
      * @param y valor de Y
      */
    public void setY(double y) 
    {
        this.y = y;
    }
    
    
    /**
     * El metodo distance devuelve la distancia entre un punto y otro.
     * Coge un objeto Point como parametro.
     * A traves del parametro calcula la longitud de la linea.
     * @param p Punto
     * @return valor de la distancia
     */
    public double  distance(Point p)
    {
        return Math.sqrt( ((this.x - p.x)  * (this.x - p.x))  + ((this.y - p.y)  * (this.y - p.y)));
  
    }
    
    
    /**
     * Es un metodo PrintWriter que imprime las coordenadas X e Y del punto.
     * @param out imprime en carpeta externa
     */
    public void print(PrintWriter out)
    {
        
        out.write("\n Point Data => ");
        out.write("\nPrint Data = x = " + x + " y = " + y);
        out.write("\n\n\n");;
    }
    
    
}
