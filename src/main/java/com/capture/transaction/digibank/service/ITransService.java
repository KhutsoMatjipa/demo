package com.capture.transaction.digibank.service;

import com.capture.transaction.digibank.model.TransDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface ITransService {
    String captureTransDetails(TransDetails transDetails);
}
