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
	
	private Collection<RogiDTO> coll = new ArrayList<RogiDTO>();
	
	@Override
	public boolean save(RogiDTO dto) {
		boolean added = coll.add(dto);
		System.out.println(dto);
		System.out.println("dto was added : " + added);
		return added;
	}

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		
		Iterator<RogiDTO> itr = this.coll.iterator();
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
		Optional<Integer> optional = Optional.empty();
		int size = coll.size();
		System.out.println("size : " + size);
		optional = Optional.of(size);
		
		return optional;
	}

	@Override
	public Collection<RogiDTO> findAll() {
		
		return this.coll;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Collection<RogiDTO> dt = new ArrayList<RogiDTO>();
		
		this.coll.forEach((s -> {
			if(search.huduku(s)) {
				coll.add(s);
			}
		}));
		
	
		return dt;
	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {
		
		Optional<RogiDTO> dt = Optional.empty();
		dt= Optional.of(Collections.max(coll));
		return dt;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		
		Optional<RogiDTO> dto = Optional.empty();
		dto=Optional.of(Collections.max(coll));
		return dto;
	}
   	

}
