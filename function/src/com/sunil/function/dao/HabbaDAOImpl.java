package com.sunil.function.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sunil.function.dto.HabbaDTO;
import com.sunil.function.search.HabbaSearch;

public  class HabbaDAOImpl implements HabbaDAO{
	
	private List<HabbaDTO> list = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		
		return added;
	}

	@Override
	public HabbaDTO huduku(HabbaSearch search) {
		
		List<HabbaDTO> dt = new ArrayList<HabbaDTO>();
		list.forEach((m -> {
			if(search.huduku(m)) {
				dt.add(m);
			}
		}));
		
		return dt.get(0);
	}

	@Override
	public Collection<HabbaDTO> yellaHuduku(HabbaSearch search) {
		
		Collection<HabbaDTO> dto = new ArrayList<HabbaDTO>();
		
		list.forEach((s -> {
			if(search.huduku(s)) {
				list.add(s);
			}
		}));
		
		return dto;
	}


}
