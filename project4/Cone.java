
import java.io.PrintWriter;

/**
 * Es una clase Cone que representa una cono tridimensional.
 * representa el radio y la altura
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 * 
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
     */
    public Cone(double radius, double height) 
    {
        this.radius = radius;
        this.height = height;
    }
     
    
    /**
     * Constructor copia de cono
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
     * @param radius 
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
     * @param height 
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
     * @param out 
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
