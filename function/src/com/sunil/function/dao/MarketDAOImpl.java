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
		
		Iterator<MarketDTO> itr = this.list.iterator();
		MarketDTO dt = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if(search.test(marketDTO)) {
				dt=marketDTO;
				
			}
			
		}
		
		return dt;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> dto = new ArrayList<MarketDTO>();
		Iterator<MarketDTO> it = this.list.iterator();
		while (it.hasNext()) {
			MarketDTO marketDTO = it.next();
			if(search.test(marketDTO)) {
				dto.add(marketDTO);
			}
			
		}
		
		return dto;
	}

}
