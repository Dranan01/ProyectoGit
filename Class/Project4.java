package com.mycompany.proyecto_git;

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

            Point pt1 = new Point(1,1);
            Point pt2 = new Point(5,8);
            Point pt3;
            Point pt4 = new Point();

            Triangle triangle_1 = new Triangle(pt1, pt2, new Point(10, 4));
            pt1.setX(2);
            pt1.setY(2);
            pt2 = new Point(2, 8);
            pt3 = new Point(12, 2);
            Triangle triangle_2 = new Triangle(pt1, pt2, pt3);
            Triangle triangle_3 = new Triangle(triangle_2);  //llama al constructor copia

            triangle_2.setPoint2(new Point(5,8));
            myShapes.add(triangle_1);
            myShapes.add(triangle_2);
            myShapes.add(triangle_3);

            Circle circle_1, circle_2, circle_3;
            circle_1 = new Circle(pt1, 4);
            circle_2 = new Circle(pt2, 12);
            circle_3 = new Circle(circle_2);
            circle_3.setRadius(5);
            myShapes.add(circle_1);
            myShapes.add(circle_2);
            myShapes.add(circle_3);

            Rectangle r1, r2, r3;
            r1 = new Rectangle(10, 3);
            r2 = new Rectangle(20, 4);
            r1.setWidth(3);
            r2.setHeight(10);
            r3 = new Rectangle(r2);
            r3.setHeight(100);
            myShapes.add(r1);
            myShapes.add(r2);
            myShapes.add(r3);

            Sphere sphere_1, sphere_2, sphere_3;
            sphere_1 = new Sphere(4);
            sphere_2 = new Sphere(12);
            sphere_3 = new Sphere(sphere_1);  //llama al constructor copia
            sphere_3.setRadius(5);
            myShapes.add(sphere_1);
            myShapes.add(sphere_2);
            myShapes.add(sphere_3);

            Cube cube_1, cube_2, cube_3;
            cube_1 = new Cube(4);
            cube_2 = new Cube(12);
            cube_3 = new Cube(cube_1);  //llama al constructor copia
            cube_3.setSideLength(5);
            myShapes.add(cube_1);
            myShapes.add(cube_2);
            myShapes.add(cube_3);

            Cylinder cy1, cy2, cy3;
            cy1 = new Cylinder(4, 10);
            cy2 = new Cylinder(7, 12);
            cy3 = new Cylinder(cy2);   //llama al constructor copia
            cy3.setHeight(15);
            cy3.setRadius(10);
            myShapes.add(cy1);
            myShapes.add(cy2);
            myShapes.add(cy3);


            Cone cone_1, cone_2, cone_3;
            cone_1 = new Cone(4, 10);
            cone_2 = new Cone(7, 12);
            cone_3 = new Cone(cone_1);  //llama al constructor copia
            cone_3.setHeight(15);
            cone_3.setRadius(10);
            myShapes.add(cone_1);
            myShapes.add(cone_2);
            myShapes.add(cone_3);

            for (Shape s: myShapes) {  // uso por cada vuelta 
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
