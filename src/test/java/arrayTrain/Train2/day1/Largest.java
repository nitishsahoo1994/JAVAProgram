package arrayTrain.Train2.day1;

public class Largest {
    public static void main(String[] args) {
        int[] arr={34,23,725,931,325,6663};
        int largest=arr[0];
        int  n=arr.length;
        for (int i=1;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
