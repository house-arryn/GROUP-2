package com.oopclass.breadapp.repository;


import com.oopclass.breadapp.models.MTDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface MTDeliveryRepository extends JpaRepository<MTDelivery, Long> {

	//User findByEmail(String email);
}
