package com.sachin.rogi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.sachin.rogi.dto.RogiDTO;
import com.sachin.rogi.util.RogiSearch;

public class RogiDAOImpl implements RogiDAO {

	private List<RogiDTO> list = new ArrayList<RogiDTO>();

	@Override
	public boolean save(RogiDTO dto) {
		return list.add(dto);
	}

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		List<RogiDTO> list1 = new ArrayList<RogiDTO>();

		Iterator<RogiDTO> itr = list1.iterator();
		Optional<RogiDTO> optional = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO rogiDTO = itr.next();
			if (search.find(rogiDTO)) {
				optional = Optional.of(rogiDTO);
			}
		}
		return optional;
	}

	@Override
	public Optional<Integer> totalSize() {
		Optional<Integer> size = Optional.of(list.size());
		return size;
	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {

		return null;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		return null;
	}

	@Override
	public Collection<RogiDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Iterator<RogiDTO> itr = this.list.iterator();
		Collection<RogiDTO> temp = new ArrayList<RogiDTO>();
		while (itr.hasNext()) {
			RogiDTO rogiDTO = itr.next();
			if (search.find(rogiDTO)) {
				temp.add(rogiDTO);
			}
		}
		return temp;
	}

}
