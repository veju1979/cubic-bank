package com.rab3tech.customer.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rab3tech.dao.entity.CustomerTransaction;

/**
 * 
 * @author nagendra
 * comment
 * 
 * Spring Data JPA repository
 *
 */
public interface CustomerTransactionRepository extends JpaRepository<CustomerTransaction, Integer> {
	
}

