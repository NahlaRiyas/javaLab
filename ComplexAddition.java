import java.util.Scanner;

class Complex {
    double real;
    double imag;

   
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    
    Complex add(Complex c) {
        return new Complex(this.real + c.real,
                           this.imag + c.imag);
    }

    
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Without user input");
        System.out.println("2. With user input");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Complex c1, c2, sum;

        if (choice == 1) {
            
            c1 = new Complex(2.5, 3.5);
            c2 = new Complex(1.5, 4.5);

            sum = c1.add(c2);

            System.out.print("Sum of complex numbers: ");
            sum.display();
        }
        else if (choice == 2) {
            
            System.out.print("Enter real part of first complex number: ");
            double r1 = sc.nextDouble();
            System.out.print("Enter imaginary part of first complex number: ");
            double i1 = sc.nextDouble();

            System.out.print("Enter real part of second complex number: ");
            double r2 = sc.nextDouble();
            System.out.print("Enter imaginary part of second complex number: ");
            double i2 = sc.nextDouble();

            c1 = new Complex(r1, i1);
            c2 = new Complex(r2, i2);

            sum = c1.add(c2);

            System.out.print("Sum of complex numbers: ");
            sum.display();
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

