package com.anik.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anik.springboot.model.Ticket;


@Service
public class TicketService {

	public Ticket selectById(int tid , List<Ticket> tickets)
	{
		for(Ticket ticket : tickets)
		{
			if(ticket.getTicketid() == tid)
			{
				return ticket;
			}
		}
		return null;
	}
	
}
