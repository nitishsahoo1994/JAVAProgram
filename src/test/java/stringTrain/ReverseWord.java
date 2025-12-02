package stringTrain;

public class ReverseWord {

    public static String doRevrseWord(String str){
        String[] words=str.split(" ");
        String rev="";
        for (int i=0;i<words.length;i++){
            rev=words[i]+" "+rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(doRevrseWord("My name is Nitish"));
    }
}
