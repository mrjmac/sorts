import java.util.Scanner;
import java.util.ArrayList;
public class mergesort {
    public static void main(String[] args)
    {
        
        //Read in numbers
        Scanner read = new Scanner(System.in);
        System.out.print("Enter nums in format x x x x (ex: 1 2 3 4 5) :: ");
        String nums[] = read.nextLine().split(" ");
        System.out.println();

        //convert numbers into an integer arraylist
        ArrayList<Integer> sort = new ArrayList<Integer>();
        for (String a : nums)
        {
            sort.add(Integer.parseInt(a));
        }
        System.out.println(sort);
        
        //perform sort
        sort = recursiveMergesort(sort);

        System.out.println(sort);
        read.close();
    
    }

    public static ArrayList<Integer> recursiveMergesort(ArrayList<Integer> a)
    {
        if (a.size() == 1)
        {
            return a;
        }

        int mid = (a.size() - 1) / 2;

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        for (int i = 0; i <= mid; i++)
        {
            one.add(a.get(i));
        }

        for (int i = mid + 1; i < a.size(); i++)
        {
            two.add(a.get(i));
        }

        one = recursiveMergesort(one);
        two = recursiveMergesort(two);

        return merge(one, two);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> c = new ArrayList<Integer>();

        while (a.size() > 0 && b.size() > 0)
        {
            if (a.get(0) > b.get(0))
            {
                c.add(b.get(0));
                b.remove(0);
            }
            else
            {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        while(a.size() > 0)
        {
            c.add(a.get(0));
            a.remove(0);
        }

        while(b.size() > 0)
        {
            c.add(b.get(0));
            b.remove(0);
        }

        return c;
    }
    

}