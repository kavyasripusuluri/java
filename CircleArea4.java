import java.io.*;
import java.util.*;

class CircleArea4 {
    double r;

    CircleArea4() {
        r = 0;
    }

    CircleArea4(double r) {
        
        this.r = r;
    }

    CircleArea4(CircleArea4 c) {
        this.r = c.r;
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

public class CircleMain extends Object {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CircleArea4 ca1 = new CircleArea4();
        System.out.println("Initially the area of first circle:"+ca1.area());
        CircleArea4 ca2 = new CircleArea4(7.0);
         System.out.println("Area of circle with radius 7.0 is"+ca2.area());
         System.out.println("Area of circle with radius 5.5 is"+ca2.area(5.5));
         
        CircleArea4 ca3 = new CircleArea4(ca2);
 System.out.println("After copy constructor area of third circle is" + ca3.area());
        ca1.SetCircle(8.8);
 System.out.println("After set circle area of first circle is"+ca1.area());
    }
}


       
