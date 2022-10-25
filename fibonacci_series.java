public class fibonacci_series {
    public static void main(String[] args) {
        int i,a,b,c;
        a=0;
        b=1;
        System.out.print(a+" "+b+" ");
        for(i=1;i<=7;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
