package iir4.g3.springMR_NADIRIdf.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iir4.g3.springMR_NADIRIdf.model.Client;
import iir4.g3.springMR_NADIRIdf.model.Ticket;
import iir4.g3.springMR_NADIRIdf.repository.ClientRepository;
import iir4.g3.springMR_NADIRIdf.repository.TicketRepository;
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public List<Ticket> getTickets(int idClient) {
		Client client = clientRepository.getById(idClient);
		return client.getTicketsClt();
	}

	@Override
	public void ajoutTicket(Ticket ticket, int idClient) {
		ticketRepository.save(ticket);
		Client client = clientRepository.getById(idClient);
		client.getTicketsClt().add(ticket);
		clientRepository.save(client);
	}

}
