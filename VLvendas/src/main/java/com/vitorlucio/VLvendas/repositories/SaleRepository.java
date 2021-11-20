package com.vitorlucio.VLvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vitorlucio.VLvendas.dto.SaleSumDTO;
import com.vitorlucio.VLvendas.entities.Sale;



public interface SaleRepository extends JpaRepository <Sale, Long > {

	@Query("SELECT new com.vitorlucio.VLvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.vitorlucio.VLvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> sucessGroupedBySeller();
}
