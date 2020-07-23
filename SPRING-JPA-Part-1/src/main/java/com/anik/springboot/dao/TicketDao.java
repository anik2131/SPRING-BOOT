package com.anik.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.anik.springboot.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
