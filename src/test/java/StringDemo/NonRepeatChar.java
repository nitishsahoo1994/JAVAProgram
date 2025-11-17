package StringDemo;

public class NonRepeatChar {
    public static void main(String[] args) {
        System.out.println("The first non repeating char is:"+nonRep("geeksforgeeks"));
    }

    public static char nonRep(String str){
        int n=str.length();
        for (int i=0;i<n;i++){
            boolean found=false;
            for (int j=0;j<n;j++){
                if (i!=j && str.charAt(i)==str.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found)
                return str.charAt(i);
        }
        return '$';
    }
}
