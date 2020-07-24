import org.apache.commons.lang.math.NumberUtils;

public class Test {

    public static void main(String[] args) {
        String s = "1233";

        String d = s.startsWith("IQ") ? s.substring(2) : s;
       System.out.println(NumberUtils.isNumber(d));


        String s2 =":S1";
        System.out.println(s2.contains(":"));
    }
}
