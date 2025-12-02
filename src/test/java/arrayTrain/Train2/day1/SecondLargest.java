package arrayTrain.Train2.day1;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={34,23,75,91,25,63,84,22};
        int n=arr.length;
        int largest=arr[0];
        int sLargest=-1;

        for (int i=0;i<n;i++){
            if (arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>sLargest) {
                sLargest=arr[i];
            }
        }

        System.out.println("second largest is "+sLargest);
    }
}
