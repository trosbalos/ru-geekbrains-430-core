package hw2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testarrSorter() {
        ArraySorter arraySorter = new ArraySorter();
        String [][] testarr = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                testarr[i][j] = String.valueOf(i + j);
            }
        }
//        testarr[0][0] = "1";
//        testarr[0][1] = "2";
//        testarr[0][2] = "3";
//        testarr[0][3] = "4";
//        testarr[1][0] = "5";
//        testarr[1][1] = "6";
//        testarr[1][2] = "7";
//        testarr[1][3] = "8";
//        testarr[2][0] = "9";
//        testarr[2][1] = "10";
//        testarr[2][2] = "11";
//        testarr[2][3] = "12";
//        testarr[3][0] = "13";
//        testarr[3][1] = "14";
//        testarr[3][2] = "15";
//        testarr[3][3] = "16";

       int actual = arraySorter.arrSorter(testarr);

        Assert.assertEquals(9, actual);
    }
    


    @Test(expected = MyArraySizeException.class)
    public void testarrSorterMyArraySizeException() {
        ArraySorter arraySorter1 = new ArraySorter();
        String [][] testarr1 = new String[5][5];
        arraySorter1.arrSorter(testarr1);
    }
    @Test(expected = MyArrayDataException.class)
    public void testarrSorterMyArrayDataException() {
        ArraySorter arraySorter2 = new ArraySorter();
        String [][] testarr2 = new String[4][4];

            testarr2[0][0] = "ffff";


        arraySorter2.arrSorter(testarr2);
    }
}