package com.bigfang.springbootdruid.UnitTest.Admin;

import com.bigfang.springbootdruid.PO.Admin;
import com.bigfang.springbootdruid.dao.AdminDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;

    @Test
    public void testAdminDaoSelectAll(){
        List<Admin> admins = adminDao.selectAllAdmins();
        System.out.println(admins);
    }
}
