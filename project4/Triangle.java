
import java.io.PrintWriter;

/**
 * La clase Triangle representa un triangulo de dos dimensiones.
 * Usa 3 Points como vertices del triangulo.
 * 
 * @author Pratik Patel
 * @version 2  Date: 16/03/2021
 */

class Triangle extends TwoDimensionalShape {

    /**
     * Creacion de las variables point1,point2,point3
     */
    private Point point1, point2, point3;

    /**
     * Constructor vacio
     */
    public Triangle() {
    }

    
    /**
     * Constructor predeterminado que tomar por parametro 3 Points.
     * @param pt1
     * @param py2
     * @param py3 
     */
    public Triangle(Point pt1, Point py2, Point py3) 
    {
        this.point1 = pt1;
        this.point2 = py2;
        this.point3 = py3;
    }

    
    
    /**
     * Constructor copia
     * @param t 
     */
    public Triangle(Triangle t) 
    {
        this.point1 = t.point1;
        this.point2 = t.point2;
        this.point3 = t.point3;
    }

    
    
    /**
     * Devuelve el valor de point1
     * @return el valor de point1.
     */
    public Point getPoint1() 
    {
        return point1;
    }

    /**
     * Establece el valor de point1
     * @param point1 
     */
    public void setPoint1(Point point1) 
    {
        this.point1 = point1;
    }

    
    /**
     * Devuelve el valor de point2
     * @return el valor de point2.
     */
    public Point getPoint2() 
    {
        return point2;
    }

    
    
    /**
     * Establece el valor de point2
     * @param point2 
     */
    public void setPoint2(Point point2) 
    {
        this.point2 = point2;
    }

    
    
    /**
     * Devuelve el valor de point3.
     * @return el valor de point3.
     */
    public Point getPoint3()
    {
        return point3;
    }

    /**
     * Establece el valor de point3.
     */
    public void setPoint3(Point point3) 
    {
        this.point3 = point3;
    }

    
    /**
     * Metodo sobreescrito que usa un PrintWriter para imprimir el objeto Cono
     * @param out 
     */
    @Override
    public void print(PrintWriter out) 
    {
        super.print(out);
        out.write("\n Triangle Data => "+ "\r\n");
        out.write("\n Point 1 = " + this.point1.getX() + " , " + this.point1.getY()+ "\r\n");
        out.write("\n Point 2 = " + this.point2.getX() + " , " + this.point2.getY()+ "\r\n");
        out.write("\n Point 3 = " + this.point3.getX() + " , " + this.point3.getY()+ "\r\n");
        out.write("\n Area = " + this.getArea()+ "\r\n");   
        out.write("\n Perimeter = " + this.getPerimeter()+ "\r\n");
        out.write("\n\n\n");;
    }

    
    /**
     * Metodo sobreescrito que devuelve el valor del area
     * @return 
     */
    @Override
    public double getArea() 
    {

        double area;
        double perimeter = this.getPerimeter()/2;

        double a = this.point1.getX() + this.point1.getY();
        double b = this.point2.getX() + this.point2.getY();
        double c = this.point3.getX() + this.point3.getY();

        area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }

    /**
     * This is an overridden method which gets the Perimeter.
     */
    @Override
    public double getPerimeter() 
    {

        double sum =  0 ;
        sum +=  this.point1.getX() + this.point1.getY();
        sum += this.point2.getX() + this.point2.getY();
        sum += this.point3.getX() + this.point3.getY();
        return sum;

      
        
    }
}
