import java.io.*;
import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) throws IOException
    {
        
        // Read in numbers
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        System.out.println("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");

        String[] nums = r.readLine().split(" ");
        int[] sort = new int[nums.length];

        // convert numbers into an integer array
        
        for (int i = 0; i < nums.length; i++)
        {
            sort[i] = (Integer.parseInt(nums[i]));
        }
        System.out.println(Arrays.toString(sort));
        
        // perform sort
        sort(sort, 0, sort.length - 1);
        pw.println(Arrays.toString(sort));

        pw.close();
    
    }

    // simple method to swap two items in an array
    public static void swap(int[] a, int spot1, int spot2)
    {
        int temp = a[spot1];
        a[spot1] = a[spot2];
        a[spot2] = temp;
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int greater = low - 1;

        for (int i = low; i < high; i++)
        {
            if (arr[i] <= pivot)
            {
                greater += 1;
                swap(arr, greater, i);
            }
        }
        swap(arr, greater + 1, high);


        return greater + 1;
    }

    public static void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }
}