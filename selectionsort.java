import java.util.Scanner;
import java.util.ArrayList;
public class selectionsort {
    public static void main(String[] args)
    {
        // Read in numbers
        Scanner read = new Scanner(System.in);
        System.out.print("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");
        String nums[] = read.nextLine().split(" ");
        System.out.println();

        // convert numbers into an integer arraylist
        ArrayList<Integer> sort = new ArrayList<Integer>();
        for (String a : nums)
        {
            sort.add(Integer.parseInt(a));
        }
        System.out.println(sort.toString());
        
        // perform sort
        for (int i = 0; i < sort.size() - 1; i++)
        {
            // assume that current item is lowest
            int minInd = i;
            // verify this information
            for (int j = i + 1; j < sort.size(); j++)
            {
                // set the real min index if we have to
                if (sort.get(minInd) > sort.get(j))
                {
                    minInd = j;
                }
            }
            // swap the current item with the lowest
            sort.set(minInd, sort.set(i, sort.get(minInd)));
        }

        System.out.println(sort);
        read.close();
    }
}