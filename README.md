# Техническое задание №2
## Реализуйте функции чтения из файла, поиска минимального числа, поиска максимального числа, сложения и умножения всех чисел из файла
Данный пункт реализован в классе TestLib.java, где последовательно реализованы функции сложения чисел, умножения чисел, поиска максимального и поиска минимального чисел среди всех чисел из файла Untitled.txt. Ниже указан код TestLib.java:
``` java
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
```
## Реализуйте тесты для проверки корректности функций поиска минимума, максимума, сложения и умножения
В классе UnitTest.java прописаны тесты, проверяющие корректность выполнения функций класса TestLib.java на файле Untitled.txt, каждый из 4 тестов проверяет по отдельности каждую функцию TestLib и ее результат работы.
Класс UnitTest:
``` java
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
```
## Реализуйте тесты для проверки скорости работы программы при увеличении размера входного файла (для каждой из функций: поиск минимума, максимума, сложение и умножение)
Проведены тесты проверки скорости работы всех функций при различных размерах файлов. Класс TimeTest проверяет скорость для файла thousand.txt, хранящем 1000 одинаковых чисел, класс TimeTest1 делает это для файла ten_thousand.txt с 10000 чисел, TimeTest2 работает для файла hundred_thousand.txt с 100000 чисел в файле. Классы различаются только pathname файла с числами, так что ниже приведен пример работы только одного из классов, а именно TimeTest:
```java
import java.util.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;

public class TimeTest
{
    public static double TimeSum() throws FileNotFoundException
    {
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/thousand.txt");
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
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/thousand.txt");
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
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/thousand.txt");
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
        File file = new File("/Users/airtium/IdeaProjects/hse_java/src/thousand.txt");
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
        System.out.println("Results for 1000 numbers (in ms):");
        System.out.println("Time for _sum: " +  TimeTest.TimeSum());
        System.out.println("Time for _mult: " +  TimeTest.TimeMult());
        System.out.println("Time for _max: " +  TimeTest.TimeMax());
        System.out.println("Time for _min: " +  TimeTest.TimeMin());
    }
}
```
## Реализуйте любой другой тест на ваше усмотрение
Реализован тест для Untitled.txt на проверку корректности нахождения целой части среднего значения чисел файла. Код для данного теста указана в CountTest.java
``` java
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
```
## Постройте график зависимости времени выполнения от кол-ва чисел в файле (вы можете измерять время выполнения любой функции из реализованных на ваш выбор)
В данном пункте представлен график зависимости выполнения функции _sum в зависимости от количества чисел в файле:

## Заведите репозиторий для своего проекта на GitHub. Оформите простейший README.md (туториал по markdown (файлы формата .md)). Загрузите в репозиторий файлы своего мини-проекта (код, тесты, README.md).
Данный пункт автоматически выполнен:)
## Подключите к вашему проекту любую CI-систему (выше есть подсказки с вариантами систем, но мы крайне рекомендуем использовать GitHub Actions в рамках этого задания, только если Ваш семинарист не демонстрировал вам другую систему). Обеспечьте возможность запуска тестов в ручном режиме (например, по щелчку кнопки в веб-интерфейсе CI-системы)
