import java.util.Scanner;

public class App {

    static Scanner scannerObject = new Scanner(System.in);

    public static Line getLine() {
        System.out.println("Enter the start point of line: ");
        double x1 = scannerObject.nextDouble();
        double y1 = scannerObject.nextDouble();

        System.out.println("Enter the end point of line: ");
        double x2 = scannerObject.nextDouble();
        double y2 = scannerObject.nextDouble();

        Line line = new Line(new Point(x1, y1), new Point(x2, y2));

        return line;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Line Comparison Computation");

        System.out.println("Line 1: ");
        Line line1 = getLine();

        System.out.println("Length of the line1: " + line1.length);

        System.out.println("Line 2: ");
        Line line2 = getLine();

        System.out.println("Length of the line2: " + line2.length);

        boolean isLineEqual = line1.equals(line2);
        
        int comparison = line1.compareTo(line2);
        
        if(isLineEqual){
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

