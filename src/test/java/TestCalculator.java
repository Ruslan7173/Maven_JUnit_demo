import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestCalculator {
    @Test

    public  void testNothing (){

        System.out.println(" Мы хотели  тестировать ");
    }

    @Test
    public void  testSum (){
        int z = Calculator.sum(2,2);
        Assertions.assertEquals(4, z);//стат метод  котюый  проверят что 2+2 это 4
    }
    @Test
    public void  testSum2 (){
        Assertions.assertEquals(8, Calculator.sum(3,5));

    }
    @Test
    public void  testSum3 (){
        Assertions.assertEquals(-2, Calculator.sum(3,-5));

    }
    @Test
    public void  testSum4 (){
        Assertions.assertNotEquals(0, Calculator.sum(12321456,94564));

    }
    @Test
    public void  testSum5 (){
        int a = ThreadLocalRandom.current().nextInt(-1000,1001); //случайное число
        int b = ThreadLocalRandom.current().nextInt(-1000,1001);
        Assertions.assertTrue(Calculator.sum(a, b)== Calculator.sum(b,a));

    }
    @Test
    public void  testSum6 () {
        int a = ThreadLocalRandom.current().nextInt(-1000, 1001); //случайное число
        int b = ThreadLocalRandom.current().nextInt(-1000, 1001);
        Assertions.assertTrue(Calculator.sum(a, b) == Calculator.sum(b, a));
    }
    @Test
    public void  testDif () {
       Assertions.assertEquals(0,Calculator.diff(12,12));
    }
    @Test
    public void  testDif1 () {
        Assertions.assertEquals(2, Calculator.diff(12, 10));
    }

}

