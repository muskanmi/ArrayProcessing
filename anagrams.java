import java.util.Scanner;
public class anagrams {
    public static void main(String[] args) {
        int i,j,c=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of test cases: ");
        int T = in.nextInt();
        for(int z=0;z<T;z++)
        {
            System.out.println("Enter two strings: ");
            c=0;
            String s1=in.next();
            String s2=in.next();
            int l1=s1.length();
            int l2=s2.length();
            int A[]=new int[l2];
            for(j=0;j<l2;j++)
                A[j]=0;
            for(i=0;i<l1;i++)
            {
                for(j=0;j<l2;j++)
                {
                    if(s1.charAt(i) == s2.charAt(j)&&A[j]==0)
                    {
                        A[j]=1;
                        c++;
                        break;
                    }
                }
            }
            System.out.println(l1+l2-2*c);
        }
    }
}
