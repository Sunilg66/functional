package com.sunil.function.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sunil.function.comparator.QuantityComparator;
import com.sunil.function.dto.GroceryDTO;
import com.sunil.function.search.GrocerySearch;

public class GroceryDAOImpl implements GroceryDAO {

	private Collection<GroceryDTO> list = new ArrayList<GroceryDTO>();

	QuantityComparator comp = new QuantityComparator();

	@Override
	public boolean create(GroceryDTO dto) {

		return this.list.add(dto);
	}

	@Override
	public Optional<GroceryDTO> findOne(GrocerySearch search) {

		return this.list.stream().filter(a -> search.test(a)).findFirst();
	}

	@Override
	public Optional<GroceryDTO> findByManufacturedDate(Date date) {

		return this.list.stream().filter(d -> d.getManufacturedDate().equals(date)).findFirst();
	}

	@Override
	public Collection<GroceryDTO> findAll(GrocerySearch search) {

		return this.list.stream().filter(a -> search.test(a)).collect(Collectors.toList());
	}

	@Override
	public Optional<GroceryDTO> findByMaxQuantity() {

		return this.list.stream().max(comp);
	}

	/*
	 * @Override public Collection<GroceryDTO> findByExpiredDate() {
	 * 
	 * return null; }
	 */

}
