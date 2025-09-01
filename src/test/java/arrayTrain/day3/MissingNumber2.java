package arrayTrain.day3;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr.length;
        //sum of consrcutive num (n(n+1))/2
        int sumAll=(5*(5+1))/2;
        System.out.println(sumAll);

        int sumarr=0;
        for (int i=0;i<n;i++){
            sumarr=sumarr+arr[i];
        }
        System.out.println(sumarr);

        int missNum=sumAll-sumarr;
        System.out.println("Missing no is:"+missNum);
    }
}
