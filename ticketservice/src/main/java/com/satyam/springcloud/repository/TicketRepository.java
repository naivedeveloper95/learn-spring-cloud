package com.satyam.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.springcloud.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
