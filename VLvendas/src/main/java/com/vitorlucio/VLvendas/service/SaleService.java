package com.vitorlucio.VLvendas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.vitorlucio.VLvendas.dto.SaleDTO;
import com.vitorlucio.VLvendas.dto.SaleSumDTO;
import com.vitorlucio.VLvendas.entities.Sale;
import com.vitorlucio.VLvendas.repositories.SaleRepository;
import com.vitorlucio.VLvendas.repositories.SellerRepository;



@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	

}