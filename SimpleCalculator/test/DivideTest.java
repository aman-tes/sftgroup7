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
import simplecalculator.DivideClass;

/**
 *
 * @author hp
 */
public class DivideTest {
    
    public DivideTest() {
    }
DivideClass div;    
    @Before
    public  void setUpClass() {
        div = new DivideClass();
    }
    
    
    
    @Test
    public void TestDivideInt() {
        
        assertEquals("Correct",2,div.div(12, 6));
        assertEquals("Correct",3,div.div(18, 6));

    }
    
    @Test
    public void TestDivideDouble() {
        
        assertEquals("Correct",11.00,div.div(11.00, 1.00),0.00);
        assertEquals("Correct",6.00,div.div(12, 2.00),0.00);
        assertEquals("Correct",10.00,div.div(60.00, 6.00),0.00);

    }
    
    @After
    public void tearDown() {
        div = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
