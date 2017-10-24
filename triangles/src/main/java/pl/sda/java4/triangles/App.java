package pl.sda.java4.triangles;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.print("Give three numbers, space separated: ");

        // wczytać ciąg znaków
        // czy try czy catch to zamknie scanner, nie trzeba dodawać za catch finally
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();

            // zastosować Parser
            int[] nums = new Parser().parseTriple(input);

            // zastosować Triangility
            boolean isTriangle = new Triangility()
                    .isTriangle(nums[0], nums[1], nums[2]);

            // wyświetlić wynik
            if (isTriangle) {
                System.out.println("It's a triangle");
            } else {
                System.out.println("It's NOT a triangle");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Failed: " + e.getMessage());
        }
    }
}
