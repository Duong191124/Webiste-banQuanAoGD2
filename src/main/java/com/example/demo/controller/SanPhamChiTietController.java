package com.example.demo.controller;

import com.example.demo.entity.SanPhamChiTiet;
import com.example.demo.repository.SanPhamChiTietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("spct")
public class SanPhamChiTietController {
    @Autowired
    private SanPhamChiTietRepository sanPhamChiTietRepository;

    @GetMapping("index")
    public String index(Model model, @RequestParam(value = "page", defaultValue = "1") int pageNumber, @RequestParam(value = "limit") int pageSize){
        PageRequest p = PageRequest.of(pageNumber, pageSize);
        Page<SanPhamChiTiet> ds = sanPhamChiTietRepository.findAll(p);
        model.addAttribute("data", ds);
        return "spct/index";
    }
}
