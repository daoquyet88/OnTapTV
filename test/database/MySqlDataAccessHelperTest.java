/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daoquyet
 */
public class MySqlDataAccessHelperTest {
    
    public MySqlDataAccessHelperTest() {
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
     * Test of getConnection method, of class MySqlDataAccessHelper.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        MySqlDataAccessHelper instance = new MySqlDataAccessHelper();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class MySqlDataAccessHelper.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        MySqlDataAccessHelper instance = new MySqlDataAccessHelper();
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class MySqlDataAccessHelper.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        MySqlDataAccessHelper instance = new MySqlDataAccessHelper();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeQuery method, of class MySqlDataAccessHelper.
     */
    @Test
    public void testExecuteQuery() {
        System.out.println("executeQuery");
        String sql = "";
        MySqlDataAccessHelper instance = new MySqlDataAccessHelper();
        ResultSet expResult = null;
        ResultSet result = instance.executeQuery(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeUpdate method, of class MySqlDataAccessHelper.
     */
    @Test
    public void testExecuteUpdate() {
        System.out.println("executeUpdate");
        String sql = "";
        MySqlDataAccessHelper instance = new MySqlDataAccessHelper();
        int expResult = 0;
        int result = instance.executeUpdate(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
