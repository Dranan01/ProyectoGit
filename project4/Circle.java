
import java.io.PrintWriter;
/**
 * This is a circle class which is representing radius and center of circle. 
 * The center is a Point object.
 * 
 * @author  Pratik Patel
 * @version 1 Date: 04/27/2014
 */

public class Circle  extends TwoDimensionalShape{
   /**
    * Instanciacion de los atributos radius y center
    */
    private double  radius ;
    private Point center;

    /**
     * Constructor de circulo que toma por argumento un Point y un double
     * @param center
     * @param radius 
     */
    public Circle( Point center,double radius) 
    {
        this.radius = radius;
        this.center = center;
    }
    
    
    /**
     * Constructor copia
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
     * @param center 
     */
    public void setCenter(Point center) 
    {
        this.center = center;
    }

    
    
    /**
     * Metodo Override que imprime los atribus del objeto circulo
     * @param out 
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
     * @return 
     */
    @Override
    public double getArea() 
    {
        return Math.PI * this.radius * this.radius ;
    }

    
    /**
     * Metodo Overrida que devuelve el radio.
     * @return 
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    
    
    
    
}

    

