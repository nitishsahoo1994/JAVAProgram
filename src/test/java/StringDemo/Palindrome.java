package StringDemo;

public class Palindrome {
    public static boolean checkPalindeome(String str){
        String rev="";
        for (int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        System.out.println("str is: "+str);
        System.out.println("rev is: "+rev);
        if (rev.equals(str))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindeome("abac"));
    }
}
