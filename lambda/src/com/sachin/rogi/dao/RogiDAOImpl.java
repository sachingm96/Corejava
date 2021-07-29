package com.sachin.rogi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		Iterator<RogiDTO> iterator=this.list.iterator();
		Optional<RogiDTO> optional=Optional.empty();
		while (iterator.hasNext()) {
			RogiDTO rogiDTO =  iterator.next();
			if(search.find(rogiDTO))
			{
				optional=Optional.of(rogiDTO);
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
		Optional<RogiDTO> opt=Optional.empty();
		opt=Optional.of(Collections.max(list));
		return opt;
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {
		Optional<RogiDTO> opt=Optional.empty();
		opt=Optional.of(Collections.min(list));
		return opt;
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
