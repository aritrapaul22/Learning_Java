import java.util.Scanner;

public class MyClass {
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int swap;
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        return arr;
    }

    public static void binarySearch(int search, int[] arr){
        int middle;
        int first = 0;
        int last = arr.length - 1;
        middle = (first+last)/2;

        while(arr[first] <= arr[last]){
            if(search < arr[middle]){
                last = middle;
            }
            else if(search == arr[middle]){
                System.out.println(search + " found at " + middle + " place. ");
                break;
            }
            else {
                first = middle + 1;
            }
            middle = (first+last)/2;
            if(arr[first] == arr[last]){
                System.out.println("\nItem Not Found!");
                break;
            }
        }
    }

    public static void main(String []args){
        int n;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Items: ");
        n = s.nextInt();
        int[] init_arr = new int[n];
        System.out.println("Enter " + n + " elements: \n");
        for(int i = 0; i<n; i++){
            init_arr[i] = s.nextInt();
        }

        System.out.println("Unsorted Array of length: " + init_arr.length);

        for(int i = 0; i<init_arr.length; i++){
            System.out.print(init_arr[i] + " ");
        }

        int[] sorted_arr = bubbleSort(init_arr);

        System.out.println("\n\nSorted Array: ");

        for(int i = 0; i<sorted_arr.length; i++){
            System.out.print(sorted_arr[i] + " ");
        }

        System.out.println("\n\nEnter item to search: ");
        int item = s.nextInt();

        binarySearch(item, sorted_arr);

    }
}
