package com.sunil.function;

import java.util.Arrays;
import java.util.Collection;
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
		
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto);
		
		
		Optional<RogiDTO> dt = dao.findOne((a) -> a.getName().equals("Pavitra"));
		boolean s = dt.isPresent();
			System.out.println("get : " + s);
			if(dt.isPresent()) {
				RogiDTO rdt = dt.get();
				System.out.println("found : " + rdt);
			}else {
				System.out.println("not found");
			}
		
		Optional<Integer> op = dao.totalSize();
		if(op.isPresent()) {
			Integer it = op.get();
			System.out.println(it);
		}
		
		
		Collection<RogiDTO> all = dao.findAll((m)-> m.getAge()>21);
		for(RogiDTO rogi : all) {
			System.out.println("find all : "+ rogi);
		}
		
		 Optional<RogiDTO> age = dao.findByMaxAge();
		 if(age.isPresent()) {
			 RogiDTO ag = age.get();
			 System.out.println("max age : " + ag);
		 }
		 
		 Optional<RogiDTO> min = dao.findByMinAge();
		 if(min.isPresent()) {
			 RogiDTO mn = min.get();
			 System.out.println("min age : " + mn);
		 }
		
	}

}
