package arrayTrain.day1;

public class Largest {

    public static void main(String[] args) {
        int[] arr={33,20,968,32,13,84,25,97,64};
        int largest=arr[0];
        int sc_largest=-1;

        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                sc_largest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>sc_largest) {
                sc_largest=arr[i];
            }
        }

        System.out.println("Second largest of an array is :"+sc_largest);
        System.out.println(largest);
    }
}
