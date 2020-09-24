package hw2;



public class ArraySorter {


    public int arrSorter(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        // Ловим MyArraySizeException
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива не 4 на 4");
        }



        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Ловим MyArrayDataException
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Ячейка массива " + i + " " + j + " содержит не число");
                }


                sum += Integer.parseInt(arr[i][j]);


            }
     }

        System.out.println("Сумма чисел массива равна " + sum);
        return sum;
    }
}
