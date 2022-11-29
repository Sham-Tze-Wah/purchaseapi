package com.cinematicketsys.purchaseapi.dao;

import com.cinematicketsys.purchaseapi.model.Ticket;
import com.cinematicketsys.purchaseapi.model.Venue;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VenueDao {
    int insertVenue(UUID id, Venue venue);

    default int insertVenue(Venue venue){
        UUID id = UUID.randomUUID();
        return insertVenue(id, venue);
    }

    List<Venue> selectAllVenue();

    Optional<Venue> selectVenueById(UUID id);

    int deleteVenueById(UUID id);

    int updateVenueById(UUID id);

}
