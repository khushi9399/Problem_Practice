package com.info.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.info.entity.Booking;

public class BookingRepository {

	private List<Booking> bookings = new ArrayList<>();

	public void save(Booking booking) {
		bookings.add(booking);
	}

	public List<Booking> findAll() {
		return bookings;
	}

	public List<Booking> findByDate(LocalDate date) {
		List<Booking> result = new ArrayList<>();

		for (Booking b : bookings) {
			if (b.getBookingDate().equals(date)) {
				result.add(b);
			}
		}
		return result;
	}

	public List<Booking> findByRoom(String room) {
		List<Booking> result = new ArrayList<>();

		for (Booking b : bookings) {
			if (b.getRoomNumber().equalsIgnoreCase(room)) {
				result.add(b);
			}
		}
		return result;
	}

	public Booking findById(int id) {
		for (Booking b : bookings) {
			if (b.getBookingId() == id) {
				return b;
			}
		}
		return null;
	}

	public void delete(Booking booking) {
		bookings.remove(booking);
	}
}