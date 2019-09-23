package com.capture.transaction.digibank.controller;

import com.capture.transaction.digibank.model.TransDetails;
import com.capture.transaction.digibank.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/transaction")
public class TransController {

    @Autowired
    private TransService transService;

    @PostMapping(value = "/capture")
    public void captureTransaction() {
       TransDetails transDetails = new TransDetails();
        transDetails.setName("Khutso");
        transDetails.setPassport("123456789");
        transDetails.setDestBank("Digi");
        transDetails.setDestCountry("RSA");
        transDetails.setAccNum(123456789);
        transDetails.setAmount(1000.23);

        transService.captureTransDetails(transDetails);
    }
}
