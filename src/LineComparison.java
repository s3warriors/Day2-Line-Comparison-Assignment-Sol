// UC0: Welcome Message
public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        // UC1: Calculate Line Length
         calculateLineLength(0, 0, 3, 4);

        // UC2: Check Equality of Two Lines
         checkEquality(0, 0, 3, 4, 1, 1, 4, 5);

        // UC3: Compare Two Lines
         compareLines(0, 0, 3, 4, 1, 1, 2, 2);
    }
    // UC1: Calculate Line Length
    public static void calculateLineLength(double x1, double y1, double x2, double y2) {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Length of the line: %.2f\n", length);
    }

    // UC2: Check Equality of Two Lines
    public static void checkEquality(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2) {
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        if (Double.compare(length1, length2) == 0) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }
    // UC3: Compare Two Lines
    public static void compareLines(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2) {
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        int comparisonResult = Double.compare(length1, length2);

        if (comparisonResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else if (comparisonResult < 0) {
            System.out.println("The first line is shorter than the second line.");
        } else {
            System.out.println("The two lines are equal in length.");
        }
    }

}
