import java.util.Scanner;

import javax.sound.sampled.Line;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation");

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 of Line1: ");
        double x1 = scannerObject.nextDouble();
        double y1 = scannerObject.nextDouble();

        System.out.println("Enter coordinates for Point 2 of Line1: ");
        double x2 = scannerObject.nextDouble();
        double y2 = scannerObject.nextDouble();

        double line1Length = Math.pow((Math.pow(x2 -  x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
        System.out.println("Length of the line1: " + line1Length);

        System.out.println("Enter coordinates for Point 1 of Line2: ");
        double x3 = scannerObject.nextDouble();
        double y3 = scannerObject.nextDouble();

        System.out.println("Enter coordinates for Point 2 of Line2: ");
        double x4 = scannerObject.nextDouble();
        double y4 = scannerObject.nextDouble();

        
        double line2Length = Math.pow((Math.pow(x4 -  x3, 2) + Math.pow(y4 - y3, 2)), 0.5);
        System.out.println("Length of the line2: " + line2Length);

        String Line1 = String.valueOf(line1Length);
        String Line2 = String.valueOf(line2Length);
        
        int comparison = Line1.compareTo(Line2);
        
        if(Line1.equals(Line2)){
            System.out.println("Length of both the lines is equal.");
        }
        else{
            System.out.println("Length of both the lines is not equal.");

            if(comparison > 0){
                System.out.println("Line 1 is greater than Line 2.");
            }
            else{
                System.out.println("Line 1 is smaller than Line 2");
            }
        }
        
        scannerObject.close();
    }
}

