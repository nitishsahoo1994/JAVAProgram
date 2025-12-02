package stringTrain;

public class Reverse {

    public static String doReverse(String str){
        String[] letter=str.split("");
        String rev="";
        for (int i=0;i<letter.length;i++){
            rev=letter[i]+rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(doReverse("JAVA"));
    }
}
