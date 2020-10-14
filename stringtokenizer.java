import java.util.StringTokenizer;

public class stringtokenizer {
    static String str = "title=Java:The Complete Reference;"+"author= Schilt;"+"publisher = mcgraw-hill;"+"copyright = 2002";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(str,"=;");
        System.out.println(str);
        while(st.hasMoreTokens())
        {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key+"\t"+val);
        }
    }
}

