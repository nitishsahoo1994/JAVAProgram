package StringDemo;

public class RotationOfAnother {
    public static boolean checkRotation(String str1,String str2){

        String str3=str1+str1;

       // System.out.println(str3);
        if (str3.contains(str2))
            return true;
        else return false;

    }
    public static void main(String[] args) {
        System.out.println(checkRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee")); ;
    }
}
