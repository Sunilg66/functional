package com.sunil.function.dao;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.sunil.function.dto.GroceryDTO;
import com.sunil.function.search.GrocerySearch;

public interface GroceryDAO {

	boolean create(GroceryDTO dto);

	Optional<GroceryDTO> findOne(GrocerySearch search);

	Optional<GroceryDTO> findByManufacturedDate(Date date);

	Collection<GroceryDTO> findAll(GrocerySearch serach);

	Optional<GroceryDTO> findByMaxQuantity();

	//Collection<GroceryDTO> findByExpiredDate();

}
