package com.prowings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.hotel.Hotel;

public interface HotelRepository extends JpaRepository<Hotel , String> {

}
