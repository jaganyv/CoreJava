package CoreConcepts;

public class Strings {
    public static void main(String[] args) {
        String a = "Java";
        String b = "java";

        System.out.println(a.equals(b));            // false (case-sensitive)
        System.out.println(a.equalsIgnoreCase(b));  // true

        String text = "Full Stack Developer";

        System.out.println(text.substring(5));     // "Stack Developer"
        System.out.println(text.substring(0, 4));  // "Full"

        String msg = "Java is easy";
        System.out.println(msg.replace("easy", "powerful")); // "Java is powerful"

        String s = "Hello";
        char[] arr = s.toCharArray();

        for (char c : arr) {
            System.out.print(c + " ");
        }

    }
}
