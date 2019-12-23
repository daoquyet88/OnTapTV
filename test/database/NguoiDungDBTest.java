/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;
import model.NguoiDung;
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
public class NguoiDungDBTest {
    
    public NguoiDungDBTest() {
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
     * Test of layMotNguoi method, of class NguoiDungDB.
     */
    @Test
    public void testLayMotNguoi() throws Exception {
        System.out.println("layMotNguoi");
        String username = "";
        String password = "";
        List<NguoiDung> expResult = null;
        List<NguoiDung> result = NguoiDungDB.layMotNguoi(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadAll method, of class NguoiDungDB.
     */
    @Test
    public void testLoadAll() throws Exception {
        System.out.println("loadAll");
        List<NguoiDung> expResult = null;
        List<NguoiDung> result = NguoiDungDB.loadAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of themNguoiDangKy method, of class NguoiDungDB.
     */
    @Test
    public void testThemNguoiDangKy() throws Exception {
        System.out.println("themNguoiDangKy");
        String use = "";
        String pass = "";
        String id = "";
        String hoTen = "";
        String diaChi = "";
        String gioiTinh = "";
        String email = "";
        String ngaySinh = "";
        NguoiDungDB instance = new NguoiDungDB();
        instance.themNguoiDangKy(use, pass, id, hoTen, diaChi, gioiTinh, email, ngaySinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTaiKhoan method, of class NguoiDungDB.
     */
    @Test
    public void testUpdateTaiKhoan() throws Exception {
        System.out.println("updateTaiKhoan");
        String useName = "";
        String passWord = "";
        String id = "";
        String hoTen = "";
        String diaChi = "";
        String ngaySinh = "";
        String gioiTinh = "";
        String email = "";
        NguoiDungDB.updateTaiKhoan(useName, passWord, id, hoTen, diaChi, ngaySinh, gioiTinh, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class NguoiDungDB.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String code = "";
        NguoiDungDB instance = new NguoiDungDB();
        instance.delete(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
