package com.sunil.function.dao;

import java.util.Collection;

import com.sunil.function.dto.MarketDTO;
import com.sunil.function.search.MarketSearch;

public interface MarketDAO {

	boolean save(MarketDTO dto);
	
	MarketDTO find(MarketSearch search);
	
	Collection<MarketDTO> findAll(MarketSearch search);

}
