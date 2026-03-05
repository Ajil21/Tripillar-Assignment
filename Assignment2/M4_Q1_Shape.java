abstract class shape {
    abstract double area();
}

class circle extends shape {
    double r;
    circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}

class rectangle extends shape {
    double l, w;
    rectangle(double l, double w) { this.l = l; this.w = w; }
    double area() { return l * w; }
}

public class M4_Q1_Shape {
    public static void main(String[] a) {
        shape s1 = new circle(5);
        shape s2 = new rectangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}
