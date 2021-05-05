public class arraysort {

    public static void display(int[] array){
        System.out.print('[');
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i != array.length - 1 ? ", " : ""));
        }
        System.out.print("]\n");
    }


    public static int[] bubble_sort(int[] array){
        boolean sorted = true;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1]){
                sorted = false;
                int tmp  = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
        if (sorted) {
            return array;
        } else {
            return bubble_sort(array);
        }
    }

    public static int[] selection_sort(int[] array){
        //  Iterate through the array
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        return array;
    }

    public static int[] insertion_sort(int[] array){
        //  Iterate through the array
        for (int i=0; i < array.length; i++){
            int min = i;

            //  Get the index of the smallest value in array
            for (int j=i; j < array.length; j++){
                min = (array[min] > array[j] ? j : min);
            }

            //  Insert the min value at the beginning of the table
            for (int j=0; j < i; j++){

                //  If the value of array[min] is smaller than the value of array[j], swap them
                if (array[min] < array[j]){
                    int tmp = array[j];
                    array[j] = array[min];
                    array[min] = tmp;
                }
            }
        }
        return array;
    }
}
