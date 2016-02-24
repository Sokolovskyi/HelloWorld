/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import helloworld.RPIServoBlasterExample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author osokolovskyi
 */
public class NewEmptyJUnitTest {
    String strVar;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
    
    RPIServoBlasterExample BlasterControl = RPIServoBlasterExample.getInstance(7);
    strVar = BlasterControl.getDimValue().toString();
    BlasterControl.dim(20);
    strVar = BlasterControl.getDimValue().toString();
    }
}
