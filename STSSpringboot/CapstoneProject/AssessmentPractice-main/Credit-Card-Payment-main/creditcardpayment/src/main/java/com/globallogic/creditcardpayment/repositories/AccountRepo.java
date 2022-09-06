package com.globallogic.creditcardpayment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.creditcardpayment.entity.Account;


	@Repository
	public interface AccountRepo extends JpaRepository<Account,Long> {

	

}