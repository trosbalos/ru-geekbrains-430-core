package hw2;

public class Runing {

    public static void main(String[] args) {

// Правильный массив 4 на 4.
        String arr2[][] = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][j] = String.valueOf(i + j);

            }

        }
// Массив с размером 5 на 5.
        String[][] arrWrongSize = new String[5][5];

//Массив содержащий не верную ячейку.
        String[][] arrWrongData = new String[4][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrWrongSize[i][j] = String.valueOf(i + j);
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                arrWrongData[i][j] = String.valueOf(i + j);


            }
            arrWrongData[2][2] = "ffff";
        }
// Работает исправно.
        ArraySorter.arrSorter(arr2);
// Ловим MyArraySizeException
        try {
            ArraySorter.arrSorter(arrWrongSize);
        } catch (MyArraySizeException e) {
            System.out.println("Упал по MyArraySizeException");
        }
// Ловим MyArrayDataException
        try {
            ArraySorter.arrSorter(arrWrongData);
        } catch (MyArrayDataException e) {
            System.out.println("Упал по MyArrayDataException ");
        }
    }
}
