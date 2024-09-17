package com.example.pttk.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("QUAN_LY")
public class NhanVienQuanLy extends NhanVien {
    // Các thuộc tính đặc thù của nhân viên quản lý
    // Ví dụ: số lượng báo cáo thống kê

    // Getters and Setters
}
