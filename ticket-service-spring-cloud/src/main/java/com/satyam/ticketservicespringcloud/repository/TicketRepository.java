package com.satyam.ticketservicespringcloud.repository;

import com.satyam.ticketservicespringcloud.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
