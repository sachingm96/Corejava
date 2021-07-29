package com.sachin.rogi.dao;

import java.util.Collection;
import java.util.Optional;

import com.sachin.rogi.dto.RogiDTO;
import com.sachin.rogi.util.RogiSearch;

public interface RogiDAO {

	boolean save(RogiDTO dto);
	
	Optional<RogiDTO> findOne(RogiSearch search);

	Optional<Integer> totalSize();

	Optional<RogiDTO> findByMaxAge();

	Optional<RogiDTO> findByMinAge();

	Collection<RogiDTO> findAll();

	Collection<RogiDTO> findAll(RogiSearch search);

}
