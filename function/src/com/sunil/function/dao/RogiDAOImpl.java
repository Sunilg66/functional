package com.sunil.function.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.sunil.function.dto.RogiDTO;
import com.sunil.function.search.RogiSearch;

public class RogiDAOImpl implements RogiDAO{
	
	private List<RogiDTO> list = new ArrayList<RogiDTO>();

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		
		Iterator<RogiDTO> itr = this.list.iterator();
		Optional<RogiDTO> op = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO rogiDTO = itr.next();
			if(search.huduku(rogiDTO)) {
				op=Optional.of(rogiDTO);
			}
			
		}
		return op;
	}

	@Override
	public Optional<Integer> totalSize() {
		
		int size = list.size();
		
		return Optional.of(size);
	}

	@Override
	public Collection<RogiDTO> findAll() {
		
		return this.list;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Collection<RogiDTO> dt = new ArrayList<RogiDTO>();
		
		list.forEach((s -> {
			if(search.huduku(s)) {
				list.add(s);
			}
		}));
		
	
		return dt;
	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {
		
		Optional<RogiDTO> dt = Optional.of(Collections.max(list));
		return dt;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		
		Optional<RogiDTO> dto = Optional.of(Collections.min(list));
		return dto;
	}
	
	
	
    
	
	

}
