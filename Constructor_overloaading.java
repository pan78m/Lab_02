import java.util.Scanner;
import java.lang.Math;
/**
 * Constructor_overloaadinclass Area
 */
class Area {
    double ar;

    Area(double n) {
        ar = 3.1416 * n * n;
    }

    Area(double n1, double n2) {
        ar = n1 * n2;
    }

    Area(double a, double b, double c) {
        double s;
        s = (a + b + c) / 2;
        ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    void display() {
        System.out.println("The value of Area :" + ar);
    }
}

public class Constructor_overloaading {
    public static void main(String[] args) {
        int ch;
        double x, y, z;
        do {
            System.out.println("1.Area of Triangle");
            System.out.println("2.Area of Rectangle");
            System.out.println("3.Area of Circle");
            System.out.println("4.Exit");
            System.out.println("\n\nEnter Your choice: ");
            Scanner input = new Scanner(System.in);
            ch = input.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Enter the side of Triangle:");
                    x = input.nextDouble();
                    y = input.nextDouble();
                    z = input.nextDouble();

                    Area a1 = new Area(x, y, z);
                    a1.display();

                    break;
                case 2:
                    System.out.println("Enter breath and height of the Rectangle: ");
                    x = input.nextDouble();
                    y = input.nextDouble();

                    Area a2 = new Area(x, y);
                    a2.display();
                    break;

                case 3:

                    System.out.println("Enter the radius of circle: ");
                    x = input.nextDouble();
                    Area a3 = new Area(x);
                    a3.display();

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            input.close();
        } while (ch != 4);

    }
}