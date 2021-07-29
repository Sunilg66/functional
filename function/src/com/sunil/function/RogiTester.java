package com.sunil.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import com.sunil.function.dao.RogiDAO;
import com.sunil.function.dao.RogiDAOImpl;
import com.sunil.function.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {
		
		RogiDTO dto = new RogiDTO(1,"Pavitra",22,"Yavaglu malgo roga",true);
		RogiDTO dto1 = new RogiDTO(2,"Mridula",22,"Yavaglu confussion",true);
		RogiDTO dto2 = new RogiDTO(3,"Sunita",21,"Yavaglu silent",true);
		RogiDTO dto3 = new RogiDTO(4,"Darshan",24,"Yavaglu Tinnodu",true);
		RogiDTO dto4 = new RogiDTO(5,"Sachin",25,"Yedeyalli kallu iddorige roga antala",true);
		
		Collection<RogiDTO> coll = Arrays.asList(dto,dto1,dto2,dto3,dto4);
		
		RogiDAO dao = new RogiDAOImpl();
		
		Collection<RogiDTO> list = new ArrayList<RogiDTO>();
		
		
		Optional<RogiDTO> dt = dao.findOne((a) -> a.getName().equals("Pavitra"));
		if(dt.isPresent()) {
			RogiDTO get = dt.get();
			System.out.println("get : " + get.getName());
		}else {
			System.out.println("Rogi not found ");
		}
		
		System.out.println(dao.totalSize());
		
		Collection<RogiDTO> collection = dao.findAll();
		for(RogiDTO temp :  collection) {
			System.out.println(temp);
			}
		
		 list.forEach((m)-> {
			 if(m.getKayile().equals("Yavaglu confussion")){
				 System.out.println("kayile found");
				 list.add(m);
				 }else {
					 System.out.println("kayile not found");
				 }
		 });
		
		
	}

}
