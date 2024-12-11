// UC0: Welcome Message
public class LineComparison {
    public static void main(String[] args) {

        // UC1: Calculate Line Length
         calculateLineLength(0, 0, 3, 4);

    }
    // UC1: Calculate Line Length
    public static void calculateLineLength(double x1, double y1, double x2, double y2) {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Length of the line: %.2f\n", length);
    }


}
