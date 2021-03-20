package com.mycompany.proyecto_git;


import java.io.PrintWriter;

/**
 * Clase Cylinder que representa un cilindro tridimensional 
 * Se le representa usando radius y height
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

public class Cylinder extends ThreeDimensionalShape{
    /**
     * creacion de los atributos radius y height
     */
    double radius , height;

    /**
     * Constructor vacio de Cylinder
     */
    public Cylinder() {
    }

    
    /**
     * Constructor predeterminado de cilindro que toma radius y height por parametros
     * @param radius valor del radio
     * @param height valor de la altura
     */
    public Cylinder(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }

    
   
    /**
     * Constructor copia de Cylinder
     * @param cyl cilindro
     */
    public Cylinder(Cylinder cyl)
    {
        this.radius = cyl.radius;
        this.height = cyl.height;
    }

    
    /**
     * Devuelve el valor de radius.
     * @return el valor de radius.
     */
    public double getRadius() 
    {
        return radius;
    }

    
   /**
    * Establece el valor de radius
    * @param radius valor del radio
    */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Devuelve el valor de height.
     * @return el valor de height.
     */
    public double getHeight() 
    {
        return height;
    }

    
    /**
     * Establece el valor de height
     * @param height valor de la altura
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Metodo sobreescrito que devuelve el valor de la area
     * @return valor del area
     */
    @Override
    public double getSurfaceArea() 
    {
        return 2 * Math.PI * this.radius * this.height;
    }

    
    
    
    /**
     * Metodo sobreescrito que devuelve el volumen
     * @return el volumen
     */
    @Override
    public double getVolume() 
    {
        return  Math.PI * this.radius * this.radius * this.height;
    }

    
    
    
    /**
     * Metodo sobreescrito que usa un PrintWriter para imprimir el objeto Cylinder
     * @param out imprime en archivo externo
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Height = " + this.getHeight()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");;
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
    
    
}
