public class StringConcatenation {
    public static void main(String[] args) {

        // 1. Using "+" operator
        String name = "Sachin"+" Mallik";
        System.out.println(name);

        // what compiler does
        String s2 = (new StringBuilder()).append("Sachin Kr.").append(" Mallik").toString();
        System.out.println(s2);


        // NOTE
        String note = 20+30+"Sachin"+40+50;
        System.out.println(note);

        String note2 = "Sachin"+(40+50);
        System.out.println(note2);

        // 2. using concat() method
        String s3 = "Om ".concat("Prakash");
        System.out.println(s3.concat(" Mallik"));

        // Using StingBuilder
        StringBuilder stringBuilder = new StringBuilder("Jay ");
        stringBuilder.append("Prakash ");
        stringBuilder.append("Mallik ");
        System.out.println(stringBuilder.toString());

    }
}
