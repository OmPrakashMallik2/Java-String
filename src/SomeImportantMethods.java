
public class SomeImportantMethods {
    public static void main(String[] args) {
        String sentence = new String(" My name is Om Prakash Mallik, and your ? ");
        System.out.println(sentence);

        // 1. toUpperCase();
        System.out.println(sentence.toUpperCase());

        // 2. toLowerCase();
        System.out.println(sentence.toLowerCase());

        //3. trim()
        System.out.println(sentence.trim());

        //4. startWith() and endWith()  return boolean
        System.out.println(sentence.startsWith(" "));
        System.out.println(sentence.endsWith("!!"));

        // 5. intern
        String s2 = sentence.intern();
        System.out.println(s2);

        // 6. valueOf(): converts values into String
        int number = 848213;
        String str = String.valueOf(number);
        System.out.println(str);
    }
}
