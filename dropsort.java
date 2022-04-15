import java.util.Scanner;
import java.util.ArrayList;
public class dropsort {
    public static void main(String[] args)
    {
        //Read in numbers
        Scanner read = new Scanner(System.in);
        System.out.print("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");
        String nums = read.nextLine();
        System.out.println("");

        //add numbers to a new scanner with object String to let me iterate through
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner string = new Scanner(nums);

        //add numbers from string to an arrayList
        while(string.hasNext())
        {
            numbers.add(string.nextInt());
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

        //print results and close scanners
        System.out.println(numbers);
        string.close();
        read.close();
    }
}