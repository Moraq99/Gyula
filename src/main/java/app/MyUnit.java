package app;

public class MyUnit {
    public static int getNumber(int[] numbers) {
        if(numbers.length==0) {
            return 0;
        }
        return numbers[0];
    }

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for( int i : numbers){
            sum+= i;
        }
        return sum;
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for( int i = array.length-1;i>0;i ++){
            for ( int j = 0; j < i;j++){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }

        return array;
    }
    public static int[] bubbleSort2D(int[][] matrix){
        return null;
    }


}
