package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "SanPhamChiTiet")
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IdMauSac", referencedColumnName = "ID")
    private MauSac ms;

    @ManyToOne
    @JoinColumn(name = "IdKichThuoc", referencedColumnName = "ID")
    private KichThuoc kt;

    @ManyToOne
    @JoinColumn(name = "IdSanPham", referencedColumnName = "ID")
    private SanPham sp;

    @Column(name = "MaSPCT")
    private String maSPCT;

    @Column(name = "SoLuong")
    private int soLuong;

    @Column(name = "DonGia")
    private double donGia;

    @Column(name = "TrangThai")
    private int trangThai;
}
