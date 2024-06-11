import java.util.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;

import static org.junit.Assert.assertEquals;

public class CountTest
{
    @Test
    public void testAverage() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        TestLib testLib = new TestLib();
        int average = testLib._sum(array) / array.size();
        assertEquals(2, average);
    }
}
