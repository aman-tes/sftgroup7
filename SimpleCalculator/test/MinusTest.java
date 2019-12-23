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
import simplecalculator.MinusClass;

/**
 *
 * @author hp
 */
public class MinusTest {
    
    public MinusTest() {
    }
MinusClass sub;    
    @Before
    public  void setUpClass() {
        sub = new MinusClass();
    }
    
    
    
    @Test
    public void TestMinusInt() {
        
        assertEquals("Correct",5,sub.min(11, 6));
        assertEquals("Correct",-4,sub.min(4, 8));

    }
    
    @Test
    public void TestMinusDouble() {
        
        assertEquals("Correct",10.12,sub.min(11.27, 1.15),0.00);
        assertEquals("Correct",10.00,sub.min(11, 1.00),0.00);
        assertEquals("Correct",8.21,sub.min(9.32, 1.11),0.00);

    }
    
    @After
    public void tearDown() {
        sub = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
