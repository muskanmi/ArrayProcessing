import java.util.Scanner;
public class array_insert {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter values of N & Q: ");
        int N = in.nextInt();
        int Q = in.nextInt();
        long sum;
        int A[] = new int[N];
        System.out.println("Enter values of array: ");
        for(int i =0;i<N;i++)
            A[i] = in.nextInt();
        for(int j=0;j<Q;j++)
        {
            System.out.print("Enter values of c,X,Y: ");
            int c = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            if(c==1&&X<N)
            {
                A[X]=Y;
            }
            else
            {
                sum = 0;
                if(X>=0&&Y<N&&X<=Y)
                {
                    for(int k=X;k<=Y;k++)
                        sum+=A[k];
                    System.out.println(sum);
                }
                else
                    System.out.println("-1");
            }
        }
    }
}
