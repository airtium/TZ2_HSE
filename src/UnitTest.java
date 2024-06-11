import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class UnitTest
{

    @Test
    public void testAdd() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        TestLib testLib = new TestLib();
        assertEquals(6, testLib._sum(array));
    }

    @Test
    public void testMultiply() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        TestLib testLib = new TestLib();
        assertEquals(6, testLib._mult(array));
    }

    @Test
    public void testMin() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        TestLib testLib = new TestLib();
        assertEquals(1, testLib._min(array));
    }
    @Test
    public void testMax() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/Untitled.txt");
        List<Integer> array = new ArrayList<>();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            array.add(number);
        }
        TestLib testLib = new TestLib();
        assertEquals(3, testLib._max(array));
    }
}
