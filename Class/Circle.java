package com.mycompany.proyecto_git;


import java.io.PrintWriter;
/**
 * Es una clase circulo que representa el radio y el centro de un circulo. 
 * el centro es un objeto point
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

public class Circle  extends TwoDimensionalShape{
   /**
    * Instanciacion de los atributos radius y center
    */
    private double  radius ;
    private Point center;

    /**
     * Constructor de circulo que toma por argumento un Point y un double
     * @param center centro del circulo
     * @param radius radio del circulo
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * Constructor copia
     * @param circle Circulo
     */
    public Circle(Circle circle)
    {
        this.radius = circle.radius;
        this.center = circle.center;
    }

    
    /**
     * recoge el valor del radio
     * @return el valor del radio
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Le da un valor a radius
     * @param radius valor del racio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Muestra el valor de centerIt gets the value of center.
     * @return el valor de center
     */
    public Point getCenter() 
    {
        return center;
    }

    
    
    /**
     * Guarda el valor de center.
     * @param center valor del centro
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Metodo Override que imprime los atribus del objeto circulo
     * @param out impresion en archivo externo
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Cirle: "+ "\r\n");
        out.print("\n Center = " + this.center.getX() + " " + this.center.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");;
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Radius = " + this.getRadius()+ "\r\n");;
        out.write("\n\n\n");
    }

    
    /**
     * Metodo Override que devuelve el area.
     * @return valor del area
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Metodo Overrida que devuelve el radio.
     * @return valor del perimetro
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

