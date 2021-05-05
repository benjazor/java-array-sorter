import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int test[] = new int[10];

        for (int i=0; i < test.length; i++)
        {
            Random rand = new Random();
            test[i] = rand.nextInt(100);
        }


        System.out.print("Unsorted array: ");
        arraysort.display(test);
        System.out.print("Bubble sort: ");
        arraysort.display(arraysort.bubble_sort(test));
        System.out.print("Selection sort: ");
        arraysort.display(arraysort.selection_sort(test));
        System.out.print("Insertion sort: ");
        arraysort.display(arraysort.insertion_sort(test));


    }
}
