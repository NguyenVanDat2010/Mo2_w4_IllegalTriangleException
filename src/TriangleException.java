import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao 3 canh cua tam giác: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        try {
            if (side1 < 0 || side2 < 0 || side3 < 0 ||
                    (side1 + side2) < side3 ||
                    (side1 + side3) < side2 ||
                    (side2 + side3) < side1)
            {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
