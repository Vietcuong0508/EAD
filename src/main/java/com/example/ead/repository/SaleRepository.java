package com.example.ead.repository;

import com.example.ead.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SaleRepository extends JpaRepository<Sale, String>, JpaSpecificationExecutor<Sale> {

}
