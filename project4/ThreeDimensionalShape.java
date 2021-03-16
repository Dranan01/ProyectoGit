
/**
 * La clase threeDimensionalShape se usara en la jerarquia.
 * Establece los metodos getSurfaceArea y getVolume de las otras clases.
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

abstract class ThreeDimensionalShape extends Shape{
 
    /**
     * Este metodo devuelve el area
     * @returns el valor 0.
     */
    public double getSurfaceArea()
    {
        return 0 ;
    }
    
    
    /**
     * Este metodo devuelve el volumen
     * @returns el valor 0.
     */
    public double getVolume()
    {
        return 0;
    }
    
}
