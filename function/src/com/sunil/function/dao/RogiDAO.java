package com.sunil.function.dao;

import java.util.Collection;
import java.util.Optional;

import com.sunil.function.dto.RogiDTO;
import com.sunil.function.search.RogiSearch;

public interface RogiDAO {
	
	boolean save(RogiDTO dto);
	
	Optional<RogiDTO> findOne(RogiSearch search);
	Optional<Integer> totalSize();
	Collection<RogiDTO> findAll();
	Collection<RogiDTO> findAll(RogiSearch search);
	Optional<RogiDTO> findByMaxAge();
	Optional<RogiDTO> findByMinAge();
	
	

}
