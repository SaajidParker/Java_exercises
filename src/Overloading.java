public class Overloading {
    /*When methods have the same name, but different parameters, it is known as method overloading.
    This can be very useful when you need the same method functionality for different types of parameters.
    Another name for method overloading is compile-time polymorphism.*/

    //complete the method for integer value type
    public int doubleTheValue(int a) {
        return a*2;
    }
    //overload the method for double value type
    public double doubleTheValue(double b) {
        return b*2;
    }
}
