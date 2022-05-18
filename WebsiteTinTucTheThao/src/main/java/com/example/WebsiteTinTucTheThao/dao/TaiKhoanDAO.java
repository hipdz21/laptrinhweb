/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.dao;

import com.example.WebsiteTinTucTheThao.model.TaiKhoanModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dovan
 */
@Repository
public interface TaiKhoanDAO extends CrudRepository<TaiKhoanModel, Integer>{
    @Query(value = "select * from tai_khoan where tai_khoan.ten_dang_nhap = ?1", nativeQuery = true)
    public TaiKhoanModel getTaiKhoanTheoTenDangNhap(String tenDangNhap);
}
