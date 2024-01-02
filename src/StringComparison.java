
public class StringComparison {
    public static void main(String[] args) {
        // there are three ways

        String s1 = "OPM";
        String s2 = new String("OPM");
        String s3 = new String("SKM");

        // 1. using equals() method
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(b1);
        System.out.println(b2);

        // 2. using "==" operator
        System.out.println(s1==s2);

        // 3. using compareTo() method
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}