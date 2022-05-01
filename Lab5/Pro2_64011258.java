/*Program# 2(Exercise 9.9 p.362 Geometry: n-sided regular polygon) 
In an n-sided regular polygon, all sideshave the same length and 
all angles have the same degree (i.e., the polygon isboth equilateral and equiangular).
 Design a class named RegularPolygonthatcontains:
 
 𝐴𝑟𝑒𝑎   = (𝑛×𝑠^3) / 4×tan(𝜋/𝑛) 
 
 Write a testprogram that creates three RegularPolygon objects, created using the no-argconstructor, 
 using RegularPolygon(6, 4), and using RegularPolygon(10,4, 5.6, 7.8). 
 For each object, display its perimeter and area.*/
public class Pro2_64011258 {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6, 4);
        RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter of r1: " + r1.getPerimeter());
        System.out.println("The area of r1: " + r1.getArea());
        System.out.println("The perimeter of r2: " + r2.getPerimeter());
        System.out.println("The area of r2: " + r2.getArea());
        System.out.println("The perimeter of r3: " + r3.getPerimeter());
        System.out.println("The area of r3: " + r3.getArea());
    }
}