package StringDemo;


import java.util.Arrays;

public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        String copyOfS1=s1.replaceAll("\\s","").toLowerCase();
        String copyOfS2=s2.replaceAll("\\s","").toLowerCase();
        boolean status=true;

        if(copyOfS1.length()!=copyOfS2.length())
            status=false;

        else{
            for (char c:copyOfS1.toCharArray()){
                int index=copyOfS2.indexOf(c);
                if(index!=-1){
                    copyOfS2=copyOfS2.substring(0,index)+copyOfS2.substring(index+1);
                }
                else{
                    status=false;
                    break;
                }
            }
        }

        if(status){
            System.out.println(s1+" and "+s2+" both are anagram");
        }
        else
            System.out.println(s1+" and "+s2+" both are not anagram");

    }





    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }
}