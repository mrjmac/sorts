import java.io.*;
import java.util.Arrays;

public class radixsort {
    public static void main(String[] args) throws IOException
    {
        
        //Read in numbers
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        System.out.println("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");

        String[] nums = r.readLine().split(" ");
        int[] sort = new int[nums.length];

        //convert numbers into an integer array
        for (int i = 0; i < nums.length; i++)
        {
            sort[i] = (Integer.parseInt(nums[i]));
        }
        System.out.println(Arrays.toString(sort));
        

        //perform sort
        sort(sort, sort.length);


        pw.println(Arrays.toString(sort));
        pw.close();
    
    }

    //simple method to swap two items in an array
    public static void swap(int[] a, int spot1, int spot2)
    {
        int temp = a[spot1];
        a[spot1] = a[spot2];
        a[spot2] = temp;
    }

    public static void countingSort(int[] arr, int size, int place)
    {
        int max = getMax(arr);
        int[] count = new int[max + 1];
        int[] output = new int[size];

        for (int i = 0; i < size; i++)
        {
            count[(arr[i] / place) % 10] += 1;
        }

        for (int i = 1; i < 10; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--)
        {
            output[count[(arr[i] / place) % 10] - 1] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < size; i++)
        {
            arr[i] = output[i];
        }

    }

    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void sort(int[] arr, int size)
    {
        int max = getMax(arr);
        for (int i = 1; max / i > 0; i *= 10)
        {
            countingSort(arr, size, i);
        }

    }

}