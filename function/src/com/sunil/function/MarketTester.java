package com.sunil.function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sunil.function.constants.MarketType;
import com.sunil.function.dao.MarketDAO;
import com.sunil.function.dao.MarketDAOImpl;
import com.sunil.function.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDTO dto = new MarketDTO("National Market","Bangalore",46,MarketType.COMMERCIAL);
		MarketDTO dto1 = new MarketDTO("Brigade Road","Bangalore",32,MarketType.COMMERCIAL);
		MarketDTO dto2 = new MarketDTO("Devaraj Market","Mysore",39,MarketType.AGRICULTUREMARKET);
		MarketDTO dto3 = new MarketDTO("Cauvery Arts","Mysore",42,MarketType.CRAFTS);
		MarketDTO dto4 = new MarketDTO("Silk Market","Ramanagara",26,MarketType.SILKMARKET);
		
		MarketDAO dao = new MarketDAOImpl();
		boolean added = dao.save(dto);
	    dao.save(dto4);
	    dao.save(dto3);
	    dao.save(dto2);
	    dao.save(dto1);
	    System.out.println("saved : " + added);
	    
		MarketDTO dt = dao.find((i)-> i.getName().equals("Devaraj Market"));
		System.out.println(dt);
		
		dt = dao.find((a) -> a.getLocation().equals("Mysore"));
		System.out.println(dt);
		
	    dt = dao.find((j)-> j.getType().equals(MarketType.CRAFTS));
        System.out.println(dt);
        
        Collection<MarketDTO> dt2 = dao.findAll((k)-> k.getLocation().equals("Mysore"));
        for (MarketDTO marketDTO : dt2) {
        	System.out.println(marketDTO);
			
		}
			
		}
	
	}

