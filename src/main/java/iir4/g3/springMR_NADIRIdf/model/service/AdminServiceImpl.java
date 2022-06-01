package iir4.g3.springMR_NADIRIdf.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iir4.g3.springMR_NADIRIdf.model.Devloppeur;
import iir4.g3.springMR_NADIRIdf.model.Ticket;
import iir4.g3.springMR_NADIRIdf.repository.DevloppeurRepository;
import iir4.g3.springMR_NADIRIdf.repository.TicketRepository;



@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	DevloppeurRepository devloppeurRepository;
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> getTicketsNonAttribuer() {
		List<Ticket> ticketsNonAttribuer = new ArrayList<Ticket>();
		for(Ticket t:ticketRepository.findAll()) {
			if(t.getStatut() == -1)
				ticketsNonAttribuer.add(t);
		}
		return ticketsNonAttribuer;
	}

	@Override
	public void attribuerTicket(int idDev, int idTicket) {
		Ticket ticket = ticketRepository.getById(idTicket);
		Devloppeur dev = devloppeurRepository.getById(idDev);
		dev.getTicketsDev().add(ticket);
		devloppeurRepository.save(dev);
		ticket.setStatut(0);
		ticketRepository.save(ticket);
	}

}
