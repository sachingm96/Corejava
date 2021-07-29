package com.sachin.festival;

import java.util.Arrays;
import java.util.Collection;

import com.sachin.festival.constant.ReligionType;
import com.sachin.festival.dao.FestivalDAO;
import com.sachin.festival.dao.FestivalDAOImpl;
import com.sachin.festival.dto.FestivalDTO;

public class FestivalTester {

	public static void main(String[] args) {

		FestivalDTO dto1 = new FestivalDTO("Ganesh Chaturthi", "India", 1, ReligionType.HINDUS, "modaka", true, true);
		FestivalDTO dto2 = new FestivalDTO("Christmas", "ALL", 1, ReligionType.CHRISTIANS, "cake", true, true);
		FestivalDTO dto3 = new FestivalDTO("Diwali", "India", 1, ReligionType.HINDUS, "Holige", true, true);
		FestivalDTO dto4 = new FestivalDTO("Eid ", "India", 1, ReligionType.MUSLIMS, "biriyani", true, true);
		FestivalDTO dto5 = new FestivalDTO("Holi", "India", 1, ReligionType.HINDUS, "food", false, false);

		FestivalDAO dao = new FestivalDAOImpl();
		dao.save(dto5);
		dao.save(dto4);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto1);

		Collection<FestivalDTO> festivalCollection = Arrays.asList(dto1, dto2, dto3, dto4, dto5);

		System.out.println("-------------------------------");
		festivalCollection.forEach((element) -> System.out.println(element.getName().toUpperCase()));
		System.out.println("-------------------------------");

		festivalCollection.forEach((element) -> System.out.println(element.getSpecialFood()));
		System.out.println("-------------------------------");
		
		festivalCollection.forEach((element) ->{
			if(element.getName().equals("Ganesh Chaturthi"))
			{
				System.out.println(element);
			}
		});
		
		System.out.println("-------------------------------");
		
		festivalCollection.forEach((element) ->{
			if(element.getType().equals(ReligionType.HINDUS))
			{
				System.out.println(element);
				
			}
		
		});
	}

}
