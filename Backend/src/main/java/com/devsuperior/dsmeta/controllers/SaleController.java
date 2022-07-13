package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entity.Sale;
import com.devsuperior.dsmeta.services.SaleServices;
import com.devsuperior.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleServices services;

    @Autowired
    private SmsService smsService;
    @GetMapping
    public Page<Sale> findSales(
                                @RequestParam(value = "minDate", defaultValue = "") String minDate,
                                @RequestParam(value = "maxDate", defaultValue = "")String maxDate,
                                Pageable pageable){
       return services.findSales(minDate,maxDate,pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id){
        smsService.sendSms(id);
    }
}
