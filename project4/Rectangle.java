
import java.io.PrintWriter;
/**
 * La clase Rectangle representa un rectangulo por su longitud y su ancho. 
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

 class Rectangle  extends TwoDimensionalShape{

     /**
      * Creacion de las variables length y width
      */
     double length;  
     double width;   
     
     /**
      * Constructor vacio de Rectangle
      */
    public Rectangle() {
    }

    
    
    /**
     * Constrcutor predeterminado de Rectangle que toma length y width por parametros
     * @param length
     * @param width 
     */
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
     
     
    /**
     * Constructor copia de Rectangle
     */
    public Rectangle(Rectangle rect)
    {
        this.length = rect.length;
        this.width = rect.width;
    }

    
    /**
     * Devuelve el valor de length.
     * @return el valor de length.
     */
    public double getLength() 
    {
        return length;
    }

    
    
    /**
     * Establece el valor de length.
     */
    public void setHeight(double length) 
    {
        this.length = length;
    }
    
    

    /**
     * Devuelve el valor de width.
     * @return el valor de width.
     */
    public double getWidth() 
    {
        return width;
    }

    
    /**
     * Establece el valor de width.
     */
    public void setWidth(double width) 
    {
        this.width = width;
    }
    

    
    
    /**
     * Metodo sobreescrito que usa PrintWriter para mostrar el objeto Rectangle
     * @param out 
     */
    @Override
    public void print(PrintWriter out) 
    {
       
        super.print(out);
        out.write("\n Area = " + this.getArea()+ "\r\n");
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n Is Square? = " + this.isSquare()+ "\r\n");;
        out.write("\n\n\n");
        
    }

    
    
    /**
     * Metodo sobreescrito que devuelve el valor del area
     * @return 
     */
    @Override
    public double getArea() 
    {
        return this.length * this.width;
    }
    
    

    
    /**
     * Metodo sobreescrito que devuelve el valor del perimetro
     * @return 
     */
    @Override
    public double getPerimeter() 
    {
        return 2 * (this.length + this.width);
    }
    
    
    
   
    /**
     * El metodo isSquare devuelve verdadero o falso de acuerdo a length y width
     * @return 
     */
    public boolean  isSquare()
    {
        if(this.length == this.width)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     
}
