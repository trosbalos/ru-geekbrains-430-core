package hw7;


import org.junit.Assert;
import org.junit.Test;

public class BoxTest {


    @Test
    public void testgetWeight() {
        Box<Apple> appleBox = new Box();
        appleBox.addFruit(new Apple(), 6);
        Assert.assertEquals(appleBox.getWeight(), 6.0f, 0.01);


        Box<Orange> orangeBox = new Box();
        orangeBox.addFruit(new Orange(), 6);
        Assert.assertEquals(orangeBox.getWeight(), 9.0f, 0.01);



    }

    @Test
    public void testcompare() {
        Box<Apple> appleBox = new Box();
        appleBox.addFruit(new Apple(), 6);
        Box<Orange> orangeBox = new Box();
        orangeBox.addFruit(new Orange(), 4);
        Assert.assertTrue(appleBox.compare(orangeBox));


//        Box<Apple> appleBox2 = new Box<>();
//        appleBox2.addFruit(new Orange(),4);

    }


}