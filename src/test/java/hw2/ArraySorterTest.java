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

       int actual = arraySorter.arrSorter(testarr);

        Assert.assertEquals(48, actual);
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