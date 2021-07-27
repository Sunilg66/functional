package com.sunil.function;

import java.util.Arrays;
import java.util.Collection;

import com.sunil.function.constants.Religion;
import com.sunil.function.dao.HabbaDAO;
import com.sunil.function.dao.HabbaDAOImpl;
import com.sunil.function.dto.HabbaDTO;

public class HabbaTester {

	public static void main(String[] args) {
		
		HabbaDTO dto = new HabbaDTO("Dasara",3,Religion.HINDU,"Holige",true,true,"KARNATAKA");
		HabbaDTO dto1 = new HabbaDTO("Christmas",1,Religion.CHRISTIAN,"FruitCake",true,true,"ALL OVER THE WORLD");
		HabbaDTO dto2 = new HabbaDTO("Ramzan",1,Religion.MUSLIM,"Kheer and Biriyani",true,true,"ALL OVER THE WORLD");
		HabbaDTO dto3 = new HabbaDTO("Kambala",2,Religion.HINDU,"chow chow bath",true,true,"DAKSHINA KANNADA AND UTTARA KANNADA");
		HabbaDTO dto4 = new HabbaDTO("Sankranthi",3,Religion.HINDU,"Pongal",true,true,"KARNATAKA");
		
		HabbaDAO dao = new HabbaDAOImpl();
		boolean jodisu = dao.ulisu(dto);
		dao.ulisu(dto1);
		dao.ulisu(dto2);
		dao.ulisu(dto3);
		dao.ulisu(dto4);
		System.out.println("ulisbitte : " + jodisu );
		
		Collection<HabbaDTO> collection = Arrays.asList(dto,dto1,dto2,dto3,dto4);
		
		collection.forEach((festival) -> System.out.println(festival.getName().toUpperCase()));
		
		collection.forEach((habba) -> System.out.println(habba.getRegion().toLowerCase()));
		
		collection.forEach((fest) -> {
			if(fest.getNoOfDays()>2) {
				System.out.println(fest.getSpecialFood().charAt(2));
			}else {
				System.out.println(fest.getSpecialFood());
			}
		});
		
	}

}
