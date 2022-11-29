package com.cinematicketsys.purchaseapi.dao;

import com.cinematicketsys.purchaseapi.model.Ticket;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TicketDao {
    int insertTicket(UUID id, Ticket ticket);

    default int insertTicket(Ticket ticket){
        UUID id = UUID.randomUUID();
        return insertTicket(id, ticket);
    }

    List<Ticket> selectAllTicket();

    Optional<Ticket> selectTicketById(UUID id);

    int deleteTicketById(UUID id);

    int updateTicketById(UUID id);
}
