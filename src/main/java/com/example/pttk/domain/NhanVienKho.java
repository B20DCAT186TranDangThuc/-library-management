package com.example.pttk.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("KHO")
public class NhanVienKho extends NhanVien {
    // Các thuộc tính đặc thù của nhân viên kho
    // Ví dụ: số lượng sách nhập, quản lý kho sách

    // Getters and Setters
}
