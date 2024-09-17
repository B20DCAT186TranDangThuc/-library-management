package com.example.pttk.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class YeuCauMuonSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "docGia_id")
    private DocGia docGia;

    @ManyToOne
    @JoinColumn(name = "sach_id")
    private Sach sach;

    private Date ngayYeuCau;
    private String trangThai; // "CHỜ DUYỆT", "ĐÃ DUYỆT", "ĐÃ TRẢ"

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DocGia getDocGia() {
        return docGia;
    }

    public void setDocGia(DocGia docGia) {
        this.docGia = docGia;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public Date getNgayYeuCau() {
        return ngayYeuCau;
    }

    public void setNgayYeuCau(Date ngayYeuCau) {
        this.ngayYeuCau = ngayYeuCau;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    // Getters and Setters

}
