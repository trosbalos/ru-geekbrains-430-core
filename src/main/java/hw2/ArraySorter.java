package hw2;

import org.w3c.dom.ls.LSOutput;

public class ArraySorter {
    public static int arrSorter(String arr[][]) throws MyArrayDataException, MyArraySizeException {
        //arr[0].length =!4
        //arr[1].length =!4
        //arr.length =!2
        //Не срабатывают.
        if (arr.length != 4 ) {
            throw new MyArraySizeException("Размер массива не 4 на 4");
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
        try {
        int s = Integer.parseInt(arr[i][j]);
}catch (NumberFormatException e ) {
            throw new MyArrayDataException("Ячейка массива " + i + " " + j +" содержит не число");
        }

                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println("Сумма чисел массива равна " + sum);
     return sum;
    }

}
