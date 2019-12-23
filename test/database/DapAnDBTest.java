/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;
import model.DapAn;
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
public class DapAnDBTest {
    
    public DapAnDBTest() {
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
     * Test of getOne method, of class DapAnDB.
     */
    @Test
    public void testGetOne() throws Exception {
        System.out.println("getOne");
        String maDe1 = "";
        List<DapAn> expResult = null;
        List<DapAn> result = DapAnDB.getOne(maDe1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class DapAnDB.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        List<DapAn> expResult = null;
        List<DapAn> result = DapAnDB.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DapAnDB.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String maDe = "";
        int maDapAn = 0;
        String cauHoi = "";
        String traLoi1 = "";
        String traLoi2 = "";
        String traLoi3 = "";
        String dapAn = "";
        DapAnDB.update(maDe, maDapAn, cauHoi, traLoi1, traLoi2, traLoi3, dapAn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DapAnDB.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String maDe = "";
        int maDapAn = 0;
        DapAnDB instance = new DapAnDB();
        instance.delete(maDe, maDapAn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class DapAnDB.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        String maDe = "";
        int maDapAn = 0;
        String cauHoi = "";
        String traLoi1 = "";
        String traLoi2 = "";
        String traLoi3 = "";
        String dapAn = "";
        DapAnDB instance = new DapAnDB();
        instance.insert(maDe, maDapAn, cauHoi, traLoi1, traLoi2, traLoi3, dapAn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
