package com.project.seller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.seller.bean.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{
    Seller findBysUserName(String sUserName);
   
	//List<Seller> findBysEmailIdAndsPassword(String sEmailId, String sPassword);
}
