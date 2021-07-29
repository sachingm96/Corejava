package com.sachin.rogi.util;

import com.sachin.rogi.dto.RogiDTO;

@FunctionalInterface
public interface RogiSearch {

	boolean find(RogiDTO dto);
}
