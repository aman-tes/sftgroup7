/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simplecalculator.MultiplyClass;

/**
 *
 * @author hp
 */
public class MultiplyTest {
    
    public MultiplyTest() {
    }
MultiplyClass mul;    
    @Before
    public  void setUpClass() {
        mul = new MultiplyClass();
    }
    
    
    
    @Test
    public void TestMultiplyInt() {
        
        assertEquals("Correct",66,mul.mul(11, 6));
        assertEquals("Correct",12,mul.mul(4, 3));

    }
    
    @Test
    public void TestMultiplyDouble() {
        
        assertEquals("Correct",22.00,mul.mul(11.00, 2.00),0.00);
        assertEquals("Correct",11.50,mul.mul(10, 1.15),0.00);
        assertEquals("Correct",6.24,mul.mul(3.12, 2.00),0.00);

    }
    
    @After
    public void tearDown() {
        mul = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
