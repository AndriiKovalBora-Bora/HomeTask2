package TestModel;

import HomeTask2.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
    private static Model model;

    @BeforeClass
    public static void runModelTest(){
        model = new Model();
    }

    @Test(timeout = 5000)
    public void testRandForZero(){
        int number;
        do {
            number = model.callRand(0, 100);
        }while (number != 0);
        Assert.assertEquals(number, 0);
    }

    @Test(timeout = 5000)
    public void testRandForOneHundred(){
        int number;
        do {
            number = model.callRand(0, 100);
        }while (number != 100);
        Assert.assertEquals(number, 100);
    }

    @Test
    public void testRandForOutOfBounds(){
        int number = model.callRand(10, 90);
        Assert.assertTrue((number <= 90) && (number >= 10));
    }

    @Test
    public void testRandForOutOfBoundsSecond(){
        int number = model.callRand(10, 90);
        Assert.assertFalse((number > 90) && (number < 10));
    }

    @Test
    public void testCheckNumberOne(){
        model.setSpecifiedNumber(50);
        Assert.assertEquals(model.checkNumber(50),0);
    }

    @Test
    public void testCheckNumberTwo(){
        model.setSpecifiedNumber(50);
        Assert.assertEquals(model.checkNumber(60),-1);
    }

    @Test
    public void testCheckNumberThree(){
        model.setSpecifiedNumber(50);
        Assert.assertEquals(model.checkNumber(40),1);
    }
}