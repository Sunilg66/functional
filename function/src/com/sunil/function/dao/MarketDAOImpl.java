package com.sunil.function.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sunil.function.dto.MarketDTO;
import com.sunil.function.search.MarketSearch;

public class MarketDAOImpl implements MarketDAO{
	
	private List<MarketDTO> list = new ArrayList<MarketDTO>();
	
	@Override
	public boolean save(MarketDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		
		return added;
	}
	
	@Override
	public MarketDTO find(MarketSearch search) {
		
		List<MarketDTO> temp = new ArrayList<MarketDTO>();
		list.forEach((a-> {
			if(search.test(a)) {
				temp.add(a);
			}
		}));
		return temp.get(0);
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> dto = new ArrayList<MarketDTO>();
		
	list.forEach((b -> {
		if(search.test(b)) {
			list.add(b);
		}
	}));
		
		return dto;
	}

}
