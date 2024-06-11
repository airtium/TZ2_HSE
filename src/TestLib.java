import java.util.*;

public class TestLib
{

    public static int _sum(List<Integer> array)
    {
        int summa = 0;
        for (int i = 0; i < array.size(); i ++)
        {
            summa += array.get(i);
        }

        return summa;
    }

    public static int _mult(List<Integer> array)
    {
        int mult = 1;
        for (int i = 0; i < array.size(); i ++)
        {
            mult *= array.get(i);
        }
        return mult;
    }

    public static int _max(List<Integer> array)
    {
        int max = array.getFirst();
        for (int i = 1; i < array.size(); i ++)
        {
            max = Math.max(array.get(i), max);
        }
        return max;
    }

    public static int _min(List<Integer> array)
    {
        int min = array.getFirst();
        for (int i = 1; i < array.size(); i ++)
        {
            min = Math.min(array.get(i), min);
        }
        return min;
    }
}