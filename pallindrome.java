import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        System.out.print("Enter a number: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        temp=n;
        while (n > 0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Number is pallindrome");
        else
            System.out.println("Number is not pallindrome");
    }
}
