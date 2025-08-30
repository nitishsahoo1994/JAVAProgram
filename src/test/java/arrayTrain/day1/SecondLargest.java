package arrayTrain.day1;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={453,30,987,634,2873,42,382};
        int l=arr[0];
        int sl=-1;
        int n=arr.length;
        for (int i=1;i<n;i++){
            if(arr[i]>l) {
                sl=l;
                l=arr[i];
            }
            else if (arr[i]<l && arr[i]>sl){
                sl=arr[i];
            }
        };
        System.out.println(sl);
        }

    }
