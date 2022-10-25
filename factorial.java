import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int f=1;
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=N;i++)
            f=f*i;
        System.out.println(f);
    }
}
