import java.math.*;
public class AreaCalculator {
    double area;
    public void CircleArea(double radius){
        area = Math.ceil(Math.PI * Math.pow(radius,2));
        System.out.println("The area of the circle is: "+ area);

    }
    public void RectangleArea(double l, double w){
        area = l*w;
        System.out.println("The area of the rectangle is: "+ area);
    }

    public void TriangleArea(double b, double h){
        area = 0.5*(b*h);
        System.out.println("The area of the triangle is: "+ area);
    }
}
