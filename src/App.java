import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation");

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1: ");
        double x1 = scannerObject.nextDouble();
        double y1 = scannerObject.nextDouble();

        System.out.println("Enter coordinates for Point 2: ");
        double x2 = scannerObject.nextDouble();
        double y2 = scannerObject.nextDouble();

        double lineLength = Math.pow((Math.pow(x2 -  x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

        System.out.println("Length of the line: " + lineLength);

        scannerObject.close();
    }
}

