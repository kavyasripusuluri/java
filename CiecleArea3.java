import java.io.*;
import java.util.*;

class CircleArea3 {
    double r;

    CircleArea3() {
        r = 0;
    }

    CircleArea3(double c) {
        this.r = c;
    }

    CircleArea3(int r) {
        this.r = r;
    }

    double area() {
        return (22 / 7.0) * r * r;
    }

    double area(double x) {
        return (22 / 7.0) * x * x;
    }

    void SetCircle(double r) {
        this.r = r;
    }
}

public class CircleMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea3 ca1 = new CircleArea3();
        CircleArea3 ca2 = new CircleArea3(3.6);
        CircleArea3 ca3 = new CircleArea3(5);
        System.out.println("Area of 1st circle is " + ca1.area());
        System.out.println("Area of 1st circle with radius 8 is " + ca1.area(8));

        System.out.println("Enter the radius of circle by area():");
        double radius = sc.nextDouble();
        CircleArea3 ca4 = new CircleArea3();
        ca4.SetCircle(radius);

        System.out.println("Area of circle is " + ca4.area());
        System.out.println("Area of 2nd circle is " + ca2.area());
        System.out.println("Area of 3rd circle is " + ca3.area());
    }
}
