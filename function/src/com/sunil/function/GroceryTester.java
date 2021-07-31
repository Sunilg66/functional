package com.sunil.function;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.sunil.function.constants.GroceryType;
import com.sunil.function.dao.GroceryDAO;
import com.sunil.function.dao.GroceryDAOImpl;
import com.sunil.function.dto.GroceryDTO;

public class GroceryTester {

	public static void main(String[] args) {

		Date date = new Date();

		Calendar cal1 = Calendar.getInstance();
		cal1.set(2022, 12, 26);

		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 05, 04);

		Calendar cal3 = Calendar.getInstance();
		cal3.set(2023, 05, 04);

		Calendar cal4 = Calendar.getInstance();
		cal4.set(2022, 01, 12);

		Calendar cal5 = Calendar.getInstance();
		cal5.set(2022, 10, 06);

		GroceryDTO dto = new GroceryDTO("Sakkre", 42.00d, GroceryType.FOOD, 2.5f, true, "itc", cal1.getTime(), date,
				true, 24589255365l);

		GroceryDTO dto1 = new GroceryDTO("TogariBele", 180.00d, GroceryType.FOOD, 1.5f, true, "Royal", cal2.getTime(),
				date, true, 894525565l);

		GroceryDTO dto2 = new GroceryDTO("Refined Oil", 2300.00d, GroceryType.FOOD, 5.5f, true, "Sunflower",
				cal3.getTime(), date, true, 6559255365l);

		GroceryDTO dto3 = new GroceryDTO("HesaruBele", 150.00d, GroceryType.PULSES, 1.0f, true, "IndiaMart",
				cal4.getTime(), date, true, 36589255365l);

		GroceryDAO dao = new GroceryDAOImpl();
		dao.create(dto);
		dao.create(dto1);
		dao.create(dto2);
		dao.create(dto3);

		Optional<GroceryDTO> findone = dao.findOne(f -> f.getName().equals("HesaruBele"));
		if (findone.isPresent()) {
			GroceryDTO dt = findone.get();
			System.out.println("found : " + dt);
		} else {
			System.out.println("dto not found");
		}

		Optional<GroceryDTO> manfdate = dao.findByManufacturedDate(date);
		if (manfdate.isPresent()) {
			GroceryDTO gr = manfdate.get();
			System.out.println("manufactured date found : " + gr);
		} else {
			System.out.println("manufactured date not found");
		}

		Collection<GroceryDTO> findall = dao.findAll(a -> a.getQuantity() > 1.5f);
		findall.forEach(m -> System.out.println(m));

		Optional<GroceryDTO> maxQuantity = dao.findByMaxQuantity();
		if (maxQuantity.isPresent()) {
			GroceryDTO grc = maxQuantity.get();
			System.out.println("found max quantity : " + grc);
		} else {
			System.out.println("max quantity not found");
		}
	}

}
