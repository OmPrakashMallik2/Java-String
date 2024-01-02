public class String1 {
    public static void main(String[] args) {
        char[] ch = {'o', 'p', 'm'};
        String str = new String(ch);
        System.out.println(str);

        String s1 = "apple";
        String s2 = "apple";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String("Hello");
        System.out.println(s3);
        String s4 = new String("welcome");
        System.out.println(s4);
    }
}
