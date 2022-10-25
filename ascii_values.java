import java.util.Scanner;
public class ascii_values
{
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner p = new Scanner(System.in);
        char C =p.next().charAt(0);
        System.out.println((int)C);
    }
}
