package com.bigfang.springbootdruid.dao;

import com.bigfang.springbootdruid.PO.Admin;

import java.util.List;

public interface AdminDao {
    List<Admin> selectAllAdmins();
}
