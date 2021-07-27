package com.sunil.function.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sunil.function.dto.HabbaDTO;

public class HabbaDAOImpl implements HabbaDAO{
	
	private List<HabbaDTO> list = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		
		return added;
	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaDTO huduku) {
		list.forEach((a) -> System.out.println(a));
		return huduku;
	}

	@Override
	public Collection<HabbaDTO> yellavannuHuduku(HabbaDTO huduku) {
		list.forEach((b) -> System.out.println(b));
		
		return list;
	}

}
