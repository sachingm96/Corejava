package com.sachin.rogi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.sachin.market.dto.MarketDTO;
import com.sachin.rogi.dao.RogiDAO;
import com.sachin.rogi.dao.RogiDAOImpl;
import com.sachin.rogi.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {

		Collection<MarketDTO> collection = new ArrayList<>();

		RogiDTO dto1 = new RogiDTO(1, "ramesh", 30, "corona", false);
		RogiDTO dto2 = new RogiDTO(2, "suresh", 31, "fever", true);
		RogiDTO dto3 = new RogiDTO(3, "ganesh", 32, "cold", true);
		RogiDTO dto4 = new RogiDTO(4, "kamesh", 33, "appendix", false);
		RogiDTO dto5 = new RogiDTO(5, "venesh", 34, "corona", false);

		RogiDAO dao = new RogiDAOImpl();
		dao.save(dto5);
		dao.save(dto4);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto1);

		System.out.println(dao.findAll());

		System.out.println("------------------------------");

		System.out.println(dao.totalSize());

		System.out.println("------------------------------");

		Optional<RogiDTO> dt = dao.findOne((a) -> a.getName().equals("ramesh"));
		if (dt.isPresent()) {
			RogiDTO get = dt.get();
			System.out.println("get : " + get.getName());
		} else {
			System.out.println("Rogi not found ");
		}

		System.out.println("------------------------------");
		Collection<RogiDTO> collection1 = dao.findAll((b) -> b.getName().equals("venesh"));
		for (RogiDTO rogi : collection1) {
			System.out.println(rogi);
		}
			System.out.println("------------------------------");
			
			Collection<RogiDTO> all = dao.findAll();
			for (RogiDTO rogiDTO : all) {
				System.out.println("find all:"+rogiDTO);
			}
	
			System.out.println("------------------------------");
			
			Optional<RogiDTO> age = dao.findByMaxAge();
			if (age.isPresent()) {
				RogiDTO ag = age.get();
				System.out.println("max age:" + ag);
			}
			
			System.out.println("------------------------------");
			Optional<RogiDTO> min = dao.findByMinAge();
			if (min.isPresent()) {
				RogiDTO value = min.get();
				System.out.println("min age:" + value);
			}
	}

}
