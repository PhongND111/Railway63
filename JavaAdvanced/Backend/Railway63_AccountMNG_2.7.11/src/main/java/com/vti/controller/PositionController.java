package com.vti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.DepartmentDto;
import com.vti.dto.PositionDto;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.service.IPositionService;

@RestController //
@RequestMapping(value = "api/v1/positions")
//http://localhost:8080/api/v1/positions
@CrossOrigin("*")
public class PositionController {
	@Autowired
	private IPositionService positionService;
	
	//http://localhost:8080/api/v1/positions/getAllPositions
	@GetMapping()
	public ResponseEntity<?> getAllPositions() {
		List<Position> listPositions = positionService.getAllPositions();
		
		
		List<PositionDto> listPositionDtos = new ArrayList<PositionDto>();
		
		for (Position position : listPositions) {
			PositionDto positionDto = new PositionDto();
			positionDto.setId(position.getId());
			positionDto.setName(position.getName().toString());
			
			listPositionDtos.add(positionDto);
			
		}
		return new ResponseEntity<>(listPositionDtos, HttpStatus.OK);
	}
	
}
