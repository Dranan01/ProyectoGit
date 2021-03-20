


import java.io.PrintWriter;

/**
 * Esta es la clase Cube que representa un cubo tridimensional 
 * Es representado mediante la longitud de sus lados.
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

 public class Cube extends ThreeDimensionalShape{
    /**
     * Crea la variable length
     */
     double length;

     /**
      * Constructor vacio de cubo
      */
    public Cube() {
    }

    
    /**
     * Constructor predeterminado de cubo que toma length por parametro
     * @param length valor de la longitud
     */
    public Cube(double length) 
    {
        this.length = length;
    }
     
     
    /**
     * Constructor copia de cubo
     * @param cube Cubo
     */
    public Cube(Cube cube)
    {
         this.length = cube.length;
    }

   
    /**
     * Devuelve el valor de length
     * @return el valor de length.
     */
    public double getLength() 
    {
        return length;
    }

    
    /**
     * Establece el valor de length
     * @param length valor de la longitud 
     */
    public void setSideLength(double length) 
    {
        this.length = length;
    }

    
    
   
    /**
     * Metodo sobreescrito que devuelve el area
     * @return area del cubo
     */
    @Override
    public double getSurfaceArea() 
    {
        return 6 * this.length * this.length;
    }

    
    
    
    /**
     * Metodo sobreescrito que devuelve el volumen
     * @return el volumen
     */
    @Override
    public double getVolume() 
    {
        return this.length * this.length * this.length;
    }

    
    
    /**
     * Metodo sobreescrito que usa PrintWriter como parametro para imprimir el objeto cubo
     * @param out imprime en carpeta externa
     */
    @Override
    public void print(PrintWriter out) 
    {
        
        super.print(out);
        out.write("\n Side  Length = " + this.getLength()+ "\r\n");
        out.write("\n Surface  Area = " + this.getSurfaceArea()+ "\r\n");
        out.write("\n Volume = " + this.getVolume()+ "\r\n");;
        out.write("\n\n\n");
        
    }
     
     
}
