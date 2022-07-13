package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.services.SaleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {
    @Autowired
    private SaleServices services;
    @GetMapping
    public List<Sale> findSales(){
       return services.findSales();
    }
}
