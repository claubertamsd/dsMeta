package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.repositorys.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServices {

    @Autowired
    private SaleRepository repository;
    public List<Sale> findSales(){
      return repository.findAll();
    }
}
