/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gigabyte
 */
public class makeColorTransparentTest {
    
    public makeColorTransparentTest() {
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

    /**
     * Test of Maketrans method, of class makeColorTransparent.
     */
    @Test
    public void testMaketrans() {
        System.out.println("Maketrans");
        Image im = new ImageIcon("defiaut.png").getImage();
        Image expResult = new ImageIcon("defiaut.png").getImage();
        Image result = makeColorTransparent.Maketrans(im);
        boolean checka=false;
        if(expResult==result)
        {checka=true;}
        System.out.print(checka);
        assertFalse("picture is not get a transparent", checka);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
