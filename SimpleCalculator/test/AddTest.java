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
import simplecalculator.AddClass;

/**
 *
 * @author hp
 */
public class AddTest {
    
    public AddTest() {
    }
AddClass add;    
    @Before
    public  void setUpClass() {
        add = new AddClass();
    }
    
    
    
    @Test
    public void TestAdditonInt() {
        
        assertEquals("Correct",17,add.add(11, 6));
        assertEquals("Correct",12,add.add(4, 8));

    }
    
    @Test
    public void TestAdditonDouble() {
        
        assertEquals("Correct",12.15,add.add(11.00, 1.15),0.00);
        assertEquals("Correct",12.15,add.add(11, 1.15),0.00);
        assertEquals("Correct",10.43,add.add(9.32, 1.11),0.00);

    }
    
    @After
    public void tearDown() {
        add = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
