package com.prowings.service;

import java.util.List;

import com.prowings.hotel.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);
	
	public List<Hotel> getAll();
	
	public Hotel getById(String id);
}
