import java.util.Scanner;
import java.util.ArrayList;
public class dropsort {
    public static void main(String[] args)
    {
        // Read in numbers
        Scanner read = new Scanner(System.in);
        System.out.print("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");
        String nums[] = read.nextLine().split(" ");
        System.out.println();

        // convert numbers into an integer arraylist
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (String a : nums)
        {
            numbers.add(Integer.parseInt(a));
        }

        //perform sort
        int i = 1;
        while (i < numbers.size())
        {
            if (numbers.get(i) < numbers.get(i - 1))
            {
                numbers.remove(i);
                
            }
            else
            {
                i++;
            }
        }

        // print results and close scanners
        System.out.println(numbers);
        read.close();
    }
}