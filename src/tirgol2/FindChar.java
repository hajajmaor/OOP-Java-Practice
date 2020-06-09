package tirgol2;

public class FindChar {

    static boolean CharInString(String str, String ch) {
        return str.contains(ch);
    }

    public static void main(String[] args) {

        String a = "Hello";
        System.out.println(a.contains("He"));

    }
}