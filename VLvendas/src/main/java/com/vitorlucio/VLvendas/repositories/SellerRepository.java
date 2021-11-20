package com.vitorlucio.VLvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitorlucio.VLvendas.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long > {

}
