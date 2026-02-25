package Asssignment1.Module3;
class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}
class Rectangle extends Shape {
    int l, b;
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }
}
class Circle extends Shape {
    int r;
    Circle(int r) {
        this.r = r;
    }
    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * r * r));
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(20, 21);
        Shape s2 = new Circle(10);
        s1.area();
        s2.area();
    }
}