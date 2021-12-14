package Cleancode;
public class FindMinMax {

    public int max(int [] array, int elements)
    {
        int max = 0;

        for(int i=0; i<elements; i++ )
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array, int elements)
    {
        int min = array[0];

        for(int i=0; i<elements; i++ )
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {

        int[] array = {1000, 11, 445, 1, 330, 3000};

        FindMinMax obj = new FindMinMax();

        System.out.println("Minimum element in the array is := " + obj.min(array, 6));
        System.out.println("Maximum element in the array is := " + obj.max(array, 6));

    }
}