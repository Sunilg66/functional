package com.sunil.function.dao;

import java.util.Collection;

import com.sunil.function.dto.HabbaDTO;
import com.sunil.function.search.HabbaSearch;

public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);
	
	HabbaDTO huduku(HabbaSearch search);
	
	Collection<HabbaDTO> yellaHuduku(HabbaSearch search);
	
	

}
