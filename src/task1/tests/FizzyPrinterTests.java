package task1.tests;

import task1.src.FizzyPrinter;
import org.junit.*;
import static org.junit.Assert.*;



public class FizzyPrinterTests {

    @Test
    public void testFiz() {
        FizzyPrinter fp1 = new FizzyPrinter();
        assertEquals("Fizz", fp1.printFizzy(9));
    }
    @Test
    public void testBuzz(){
        FizzyPrinter fp1 = new FizzyPrinter();
        assertEquals("Buzz", fp1.printFizzy(55));
    }
    @Test
    public void testBang(){
        FizzyPrinter fp1 = new FizzyPrinter();
        assertEquals("Bang", fp1.printFizzy(77));
    }

    @Test
    public void testFizzbuzz(){
        FizzyPrinter fp1 = new FizzyPrinter();
        assertEquals("Fizzbuzz", fp1.printFizzy(15));
    }
    @Test
    public void testFizzbuzzbang(){
        FizzyPrinter fp1 = new FizzyPrinter();
        assertEquals("Fizzbuzzbang", fp1.printFizzy(105));
    }
}
