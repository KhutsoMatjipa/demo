package com.capture.transaction.digibank.repository;

import com.capture.transaction.digibank.model.TransDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TransactionRepo extends JpaRepository<TransDetails, Integer> {
}
