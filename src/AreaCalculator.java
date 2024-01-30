public class AreaCalculator {
    double area;
    public void CircleArea(){

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
