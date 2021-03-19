package com.mycompany.proyecto_git;


import java.io.PrintWriter;

/**
 * Es una clase Cone que representa una cono tridimensional.
 * representa el radio y la altura
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

 class Cone extends ThreeDimensionalShape{
    /**
     * Crea las variables radius y height
     */
    double radius;
    double height;

    //Constructor vacio
    public Cone() 
    {
    }

    
    /**
     * Constructor de cono que toma por parametros radius y height 
     * @param radius valor del radio
     * @param height valor de la altura
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * Constructor copia de cono
     * @param con Cone
     */ 
    public Cone(Cone con)
    {
         this.radius = con.radius;
         this.height = con.height;
    }
    
    
  
    /**
     * Devuelve el valor de radius
     * @return el valor de radius
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor de radius
     * @param radius valor de radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    
    /**
     * Devuelve el valor de height.
     * @return el valor de altura.
     */
    public double getHeight() 
    {
        return height;
    }

    
    
    /**
     * Establece el valor de height
     * @param height valor de altura 
     */
    public void setHeight(double height) 
    {
        this.height = height;
    }

    
    
    /**
     * Metodo sobreescrito que devuelve el valor del area
     * @return el area de la superficie
     */
    @Override
    public double getSurfaceArea() 
    {

        return (Math.PI * (this.radius * this.radius) * this.height) / 3;
    }

    
    /**
     * Metodo sobreescrito que devuelve el volumen
     * @return el volumen
     */
    @Override
    public double getVolume() 
    {

        return (Math.PI * (this.radius)) * (this.radius  + Math.sqrt( ( this.radius * this.radius) + (this.height * this.height)));
        
    }

    
    

    /**
     * Metodo sobreescrito que usa un PrintWriter para imprimir el objeto Cono
     * @param out imprime en carpeta externa
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Radius  = " + this.getRadius()+ "\r\n");
        out.write("\n Height  = " + this.getHeight()+ "\r\n");
        out.write("\n  Surface  Area = " + this.getVolume() + "\r\n");
        out.write("\n  Volume  = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n\n\n");
    }
     
}
