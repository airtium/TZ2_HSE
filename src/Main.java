import java.util.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;

class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                array.add(number);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла ");
        }
        Result result = JUnitCore.runClasses(UnitTest.class);
        Result result_new = JUnitCore.runClasses(CountTest.class);
        if (array.size() == 1000)
        {
            System.out.println("Results for 1000 numbers (in ms):");
            System.out.println("Time for _sum: " +  TimeTest.TimeSum());
            System.out.println("Time for _mult: " +  TimeTest.TimeMult());
            System.out.println("Time for _max: " +  TimeTest.TimeMax());
            System.out.println("Time for _min: " +  TimeTest.TimeMin());
        }
        else if (array.size() == 10000)
        {
            System.out.println("Results for 10000 numbers (in ms):");
            System.out.println("Time for _sum: " +  TimeTest.TimeSum());
            System.out.println("Time for _mult: " +  TimeTest.TimeMult());
            System.out.println("Time for _max: " +  TimeTest.TimeMax());
            System.out.println("Time for _min: " +  TimeTest.TimeMin());
        }
        else if (array.size() == 100000)
        {
            System.out.println("Results for 100000 numbers (in ms):");
            System.out.println("Time for _sum: " +  TimeTest.TimeSum());
            System.out.println("Time for _mult: " +  TimeTest.TimeMult());
            System.out.println("Time for _max: " +  TimeTest.TimeMax());
            System.out.println("Time for _min: " +  TimeTest.TimeMin());
        }
        else
        {
            System.out.println("_sum: " + TestLib._sum(array));
            System.out.println("_mult: " + TestLib._mult(array));
            System.out.println("_max: " + TestLib._max(array));
            System.out.println("_min: " + TestLib._min(array));
            System.out.println("The result of UnitTests: " + (result.wasSuccessful() && result_new.wasSuccessful()));
        }
    }
}
