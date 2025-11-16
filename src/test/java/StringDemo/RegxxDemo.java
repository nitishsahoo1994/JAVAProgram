package StringDemo;

public class RegxxDemo {
    public static void main(String[] args) {
        String kuchBhi="Hi@@ how are you doing you's h@ir is s0 so pretty";

        String regx=kuchBhi.replaceAll("[^a-zA-z]","");
        System.out.println(regx);
    }
}
