import java.util.Scanner;
import java.util.ArrayList;
public class insertionsort {
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
        for (int i = 1; i < sort.size(); i++)
        {
            int curr = sort.get(i);
            int idx = i - 1;
            while (idx >= 0 && sort.get(idx) > curr)
            {
                sort.set(idx + 1, sort.get(idx));
                idx -= 1;
            }
            sort.set(idx + 1, curr);
        }

        System.out.println(sort);
        read.close();
    
    }

}