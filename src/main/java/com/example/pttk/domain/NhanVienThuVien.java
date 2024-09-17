package com.example.pttk.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("THU_VIEN")
public class NhanVienThuVien extends NhanVien {
    // Các thuộc tính đặc thù của nhân viên thư viện
    // Ví dụ: số lượng sách duyệt mượn, số độc giả quản lý

    // Getters and Setters
}
