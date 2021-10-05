import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 9, 2, -1, 6};
        bubblesrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesrt(int[] arr){
//        checking if truly swapping occurs
        boolean isSwapped = false;

        int start = 0;
        int end = arr.length;
//        outer loop counter
        for (int i = start; i < end; i++) {
//            inner loop
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
//                    swapping the number
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    isSwapped = true;
                }
            }

            if (!isSwapped){
                break;
            }

        }
    }

}