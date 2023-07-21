import java.util.Scanner;
import java.util.ArrayList;
public class bubblesort {
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
            for (int n = 0; n < sort.size() - 1 - i; n++)
            {
                if (sort.get(n) > sort.get(n+1))
                {
                    // swap nums
                    sort = swap(sort, n);
                }
            }
        }

        System.out.println(sort);
        read.close();
    
    }

    // simple method to swap two items in an array
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int spot)
    {
        list.set(spot, list.set(spot + 1, list.get(spot)));
        return list;
    }
}