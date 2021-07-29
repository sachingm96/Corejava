package com.sachin.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTester {

	public static void main(String[] args) {
		
		Collection<String> watch = Arrays.asList("Tudor","Rolex", "Omega SA", "Tissot", "TAG heuer", "Tudor","Oris", "Tissot");
		System.out.println("size  "+ watch.size());
		
		Collection<String> brand = watch.stream().filter(n -> n.startsWith("T")).collect(Collectors.toList());
		System.out.println("size  "+ brand.size());
		System.out.println("watch brand");
		brand.forEach(a-> System.out.println(a));
		
		Set<String> listBrand = watch.stream().filter(t -> t.startsWith("T")).collect(Collectors.toSet());
		System.out.println("size = "+ listBrand.size());
		System.out.println("watch brand start with T ");
		listBrand.forEach(b-> System.out.println(b));
		System.out.println("----------------------------------------------");
		
		Collection<String> usn= Arrays.asList("18GACS2001", "18GACS2002", "18GACS2013", "18GAME6002",	"18GAME6001", "18GAEC3001", "18GACV4001");
		System.out.println("size "+usn.size());
		System.out.println("usn all branch ");
		usn.forEach(b-> System.out.println(b));
		
		Collection<String> cs = usn.stream().filter(j -> j.contains("CS")).collect(Collectors.toList());
		System.out.println("size "+cs.size());
		System.out.println("usn cs branch ");
		cs.forEach(b-> System.out.println(b));
		

		System.out.println("----------------------------------------------");
		
		Collection<String> pan = Arrays.asList("ASDF1234", "AFGHJ1223", "FGJKWP044", "TDH4TGRHS","5E7Y","5DREUY675TY6","AS2435676","AUKYIT89787887");
		System.out.println("size "+pan.size());
		System.out.println("all pans ");
		pan.forEach(b-> System.out.println(b));
		
		Collection<String> temp = pan.stream().filter((a) -> a.startsWith("A")).collect(Collectors.toSet());
		System.out.println("size "+temp.size());
		System.out.println("Pans starts with A ");
		temp.forEach(b-> System.out.println(b));	
		
	}

}