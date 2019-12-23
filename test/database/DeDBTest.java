/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;
import model.De;
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
public class DeDBTest {
    
    public DeDBTest() {
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
     * Test of getAll method, of class DeDB.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        List<De> expResult = null;
        List<De> result = DeDB.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class DeDB.
     */
    @Test
    public void testGetOne() throws Exception {
        System.out.println("getOne");
        String maDe1 = "";
        List<De> expResult = null;
        List<De> result = DeDB.getOne(maDe1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DeDB.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String maDe = "";
        String tieuDe = "";
        String noiDung = "";
        String tacGia = "";
        String lop = "";
        String chuThich = "";
        DeDB.update(maDe, tieuDe, noiDung, tacGia, lop, chuThich);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DeDB.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String code = "";
        DeDB instance = new DeDB();
        instance.delete(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class DeDB.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        String maDe = "";
        String tieuDe = "";
        String noiDung = "";
        String tacGia = "";
        String chuThich = "";
        String lop = "";
        DeDB instance = new DeDB();
        instance.insert(maDe, tieuDe, noiDung, tacGia, chuThich, lop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
