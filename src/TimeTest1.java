import java.util.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;

public class TimeTest1
{
    public static double TimeSum() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/ten_thousand.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        long start = System.nanoTime();
        TestLib._sum(array);
        long end = System.nanoTime();
        double result = (double) (end - start) / 1000000;
        return result;
    }
    public static double TimeMult() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/ten_thousand.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        long start = System.nanoTime();
        TestLib._mult(array);
        long end = System.nanoTime();
        double result = (double) (end - start) / 1000000;
        return result;
    }
    public static double TimeMax() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/ten_thousand.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        long start = System.nanoTime();
        TestLib._max(array);
        long end = System.nanoTime();
        double result = (double) (end - start) / 1000000;
        return result;
    }
    public static double TimeMin() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/ten_thousand.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        long start = System.nanoTime();
        TestLib._min(array);
        long end = System.nanoTime();
        double result = (double) (end - start) / 1000000;
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Results for 10000 numbers (in ms):");
        System.out.println("Time for _sum: " +  TimeTest1.TimeSum());
        System.out.println("Time for _mult: " +  TimeTest1.TimeMult());
        System.out.println("Time for _max: " +  TimeTest1.TimeMax());
        System.out.println("Time for _min: " +  TimeTest1.TimeMin());
    }
}
