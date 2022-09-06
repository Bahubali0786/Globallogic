package com.globallogic.creditcardpayment.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.creditcardpayment.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}