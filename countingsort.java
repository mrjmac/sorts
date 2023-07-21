import java.util.Scanner;
import java.util.Arrays;
public class countingsort {
    public static void main(String[] args)
    {
        // Read in numbers
        Scanner read = new Scanner(System.in);
        System.out.print("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");
        String nums[] = read.nextLine().split(" ");
        int sort[] = new int[nums.length];
        System.out.println();

        // convert numbers into an integer arraylist and find the maximum value
        int max = 0;
        int n = 0;
        for (String a : nums)
        {
            if (Integer.parseInt(a) > max)
            {
                max = Integer.parseInt(a);
            }
            sort[n] = Integer.parseInt(a);
            n++;
        }
        System.out.println(Arrays.toString(sort));

        // perform sort
        int[] count = new int[max + 1];
        int[] output = new int[sort.length];

        // count number of each unique number
        for (int i = 0; i <= sort.length - 1; i++)
        {
            count[sort[i]] += 1;
        }

        // turn the array into a prefix sum of the series
        for (int j = 1; j <= max; j++)
        {
            count[j] += count[j - 1];
        }

        // add numbers where they belong
        for (int k = sort.length - 1; k >= 0; k--)
        {
            count[sort[k]] -= 1;
            output[count[sort[k]]] = sort[k];
        }
        

        // print results and close scanners
        System.out.println(Arrays.toString(output));
        read.close();
    }
}
