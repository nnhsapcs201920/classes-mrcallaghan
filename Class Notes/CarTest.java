

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarTest
{
    /**
     * Default constructor for test class CarTest
     */
    public CarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetFuelInTank()
    {
        Car testCar = new Car( 50 );  //create a car object that gets 50mpg
        double amount = testCar.getFuelInTank(); // test the method by running it on the new Car
        assertEquals(0, amount, 1e-6);  // make sure the expected value of fuel and teh actual value match
    }
}






