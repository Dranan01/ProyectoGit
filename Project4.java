

/*
 * Copyright (C) 2014 Aparna Mahadev
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 */
import java.util.ArrayList;
import java.io.*; // Para la IOException y el printWriter
import java.util.Scanner;

/**
 * @author Aparna Mahadev
 * @version 1 - Project 4 Driver
 */

public class Project4 {
    /**
     * Aplicacion
     * @param args aplicacion 
     */
    public static void main(String args[]) {
        try {
            PrintWriter out = new PrintWriter (new FileWriter(args[0]));
            ArrayList <Shape> myShapes = new ArrayList<Shape> (30);
            
            //Crea una serie de puntos 
            Point pt1 = new Point(1,1);
            Point pt2 = new Point(5,8);
            Point pt3;
            Point pt4 = new Point();

            //Crea una serie de triangulos en base a los puntos creados anteriormente
            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            pt1.setX(2);
            pt1.setY(2);
            pt2 = new Point(2, 8); //Cambia los atributos de los puntos
            pt3 = new Point(12, 2);
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            Triangle triangle_3 = new Triangle(triangle_2);  //llama al constructor copia
            triangle_2.setPoint2(new Point(5,8));
            
            //Añade los triangulos en la lista myShapes
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            
            //Crea una serie Circulos con sus parametros Point
            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            circle_3 = new Circle(circle_2);
            circle_3.setRadius(5);
            //Añade los circulos a la lista myShapes
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            
            //Crea una serie rectangulos con sus parametrpos
            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            r1.setWidth(3);
            r2.setHeight(10);
            r3 = new Rectangle(r2);
            r3.setHeight(100);
            //Añade los rectangulos a la lista myShapes
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);

            
            //Crea una serie esferas con sus parametros
            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            sphere_3 = new Sphere(sphere_1);  //llama al constructor copia
            sphere_3.setRadius(5);
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);

            
            //Crea una serie cubos con sus parametros 
            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            cube_3 = new Cube(cube_1);  //llama al constructor copia
            cube_3.setSideLength(5);
            //Añade los cubos a la lista myShapes
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);

            
            //Crea una serie cilindros con sus parametros 
            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            cy3 = new Cylinder(cy2);   //llama al constructor copia
            cy3.setHeight(15);
            cy3.setRadius(10);
            //Añade los cilindros a la lista myShapes
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);


            
            //Crea una serie Conos con sus parametros
            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            cone_3 = new Cone(cone_1);  //llama al constructor copia
            cone_3.setHeight(15);
            cone_3.setRadius(10);
            //Añade los conos a la lista myShapes
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            for (Shape s: myShapes) {  // Lee e imprime todos los objetos de la lista 
                // for (int ii = 0; ii < myShapes.size(); ii++) {
                out.println(s.getClass().getName());  // imprime el nombre de la clase del objeto
                s.print(out);             
                out.println();
            }
            out.close();
        }  // fin del try

        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }  //fin del catch
    } 
}  
