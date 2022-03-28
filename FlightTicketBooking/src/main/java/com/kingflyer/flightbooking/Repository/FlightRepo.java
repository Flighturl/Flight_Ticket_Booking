package com.kingflyer.flightbooking.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingflyer.flightbooking.Model.Flight;


@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {

	

	List<Flight> findByDepartureLocationAndArrivalLocation(String departureLocation, String arrivalLocation);

	

	
	
	
	
	//@Query(value = "SELECT * FROM Flight f WHERE f.departure_Id=?1 AND f.arrival_Id=?2 AND f.travel_Date=?3", nativeQuery = true)
	//public List<Flight> searchFlight(Optional<String> departure, Optional<String> arrival, LocalDate date);

	//@Query(value = "SELECT * FROM FLIGHT WHERE id=?1", nativeQuery = true)
	//public Flight findFlightById(int flightId);

}
