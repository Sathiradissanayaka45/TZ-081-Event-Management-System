package com.eventwisp.app.service;

import com.eventwisp.app.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    List<Ticket> getAllTickets();

}
