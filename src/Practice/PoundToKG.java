package Practice;
import java.util.Scanner;

public class PoundToKG {
    public static void main(String[] args) {
        double converter = 0.453592;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pound: ");
        String pound = input.nextLine();
        int poundInt = Integer.parseInt(pound);
        System.out.println(pound + " pounds is " + poundInt*converter + "KG");
    }
}
