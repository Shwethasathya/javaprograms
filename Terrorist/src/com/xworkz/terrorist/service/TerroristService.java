package com.xworkz.terrorist.service;

import com.xworkz.terrorist.dto.TerroristDto;

public interface TerroristService {

	boolean validateAndSave(TerroristDto dto);
}
