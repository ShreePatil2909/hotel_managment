package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.hotel.Hotel;
import com.prowings.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService service;
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel)); 
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> hotelById(String hotelId){
	  return ResponseEntity.status(HttpStatus.OK).body(service.getById(hotelId)); 
	}
	
	@GetMapping 
	public ResponseEntity<List<Hotel>> getAll(){
		return ResponseEntity.ok(service.getAll());
	}
	
}
