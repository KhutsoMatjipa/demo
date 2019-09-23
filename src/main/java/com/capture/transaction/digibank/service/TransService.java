package com.capture.transaction.digibank.service;

import com.capture.transaction.digibank.model.TransDetails;
import com.capture.transaction.digibank.repository.TransactionRepo;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.Transaction;

@Service
public class TransService implements ITransService {

    private TransactionRepo transRepo;

    /*@Override
    public void captureTransDetails(TransDetails transDetails) {
        System.out.print("Doing nothing");
      //  TransDetails response = transRepo.save(transDetails);
        //return response;
    }*/

    public TransService(TransactionRepo transRepo) {
        this.transRepo = transRepo;
    }

    @Transactional
    public String captureTransDetails(TransDetails transDetails) {
        try
        {
            final TransDetails response = transRepo.save(transDetails);

            return  response.getName();
            //return "Success";
        }
        catch (Exception e) {
            System.out.print(e);
        }
        return "Error";
    }
}
