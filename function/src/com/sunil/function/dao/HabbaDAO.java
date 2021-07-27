package com.sunil.function.dao;

import java.util.Collection;

import com.sunil.function.dto.HabbaDTO;

public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);
	
	HabbaDTO ondunaHuduku(HabbaDTO huduku);
	
	Collection<HabbaDTO> yellavannuHuduku(HabbaDTO huduku);

}
