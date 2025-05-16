package com.eventwisp.app.service;

import com.eventwisp.app.dto.TicketUpdateDto;
import com.eventwisp.app.dto.response.TicketUpdateResponse;
import com.eventwisp.app.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    List<Ticket> getAllTickets();

    List<TicketUpdateResponse> updateTicket(List<TicketUpdateDto> ticketData);

}
