package com.prowings.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.exception.ResourceNotFoundException;
import com.prowings.hotel.Hotel;
import com.prowings.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository repository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		
		String hotelId=UUID.randomUUID().toString();
		 hotel.setId(hotelId); 
		return repository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return repository.findAll();
	}

	@Override
	public Hotel getById(String id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel id not found !!"));
	}

}
