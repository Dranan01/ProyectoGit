

import java.io.PrintWriter;

/**
 * La clase Sphere representa una esfera tridimensional. 
 * representado por el radio
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

public class Sphere extends ThreeDimensionalShape{
    /**
     * Creacion de la variable raidus.
     */
    double radius ;
    
    /**
     * 
     */
    public Sphere() {
    }
    
    
    /**
     * Constructor que toma radius por parametro
     * @param radius valor del radio 
     */
    public Sphere(double radius) 
    {
        this.radius = radius;
    }
    
    
    /**
     * Constructor copia.
     * @param sp esfera
     */
    public Sphere(Sphere sp)
    {
        this.radius = sp.radius;
    }

    
     /**
     * Devuelve el valor de radius
     * @return el valor de radius.
     */
    public double getRadius() 
    {
        return radius;
    }

    
    
    /**
     * Establece el valor de radius.
     * @param radius valor del radio
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    /**
     * Metodo sobreescrito que devuelve el valor del area
     * @return el valor del area
     */
    @Override
    public double getSurfaceArea() 
    {
        
        return 4 * Math.PI * this.radius * this.radius;
        
    }

    
    /**
     * Metodo sobreescrito que devuelve el valor del volumen.
     * @return el valor del volumen
     */
    @Override
    public double getVolume() 
    {
        return (4 * Math.PI * this.radius * this.radius * this.radius ) / 3;
    }

    
    /**
     * Metodo sobreescrito que usa PrintWriter para mostrar el objeto Sphere
     * @param out imprime en archivo externo
     */
    @Override
    public void print(PrintWriter out)
    {
        
        super.print(out);
        out.write("\n Radius = " + this.getRadius()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");
        out.write("\n\n\n");
        
    }
   
    
}
