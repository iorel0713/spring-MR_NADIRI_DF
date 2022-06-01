package iir4.g3.springMR_NADIRIdf.model.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iir4.g3.springMR_NADIRIdf.model.Devloppeur;
import iir4.g3.springMR_NADIRIdf.model.Ticket;
import iir4.g3.springMR_NADIRIdf.repository.DevloppeurRepository;
import iir4.g3.springMR_NADIRIdf.repository.TicketRepository;



@Service
public class DevServiceImpl implements DevService {

	@Autowired
	DevloppeurRepository devloppeurRepository;
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> getTickets(int idDev) {
		Devloppeur dev = devloppeurRepository.getById(idDev);
		return dev.getTicketsDev();
	}

	@Override
	public void editStatus(Ticket ticket, int idTicket) {
		Ticket t = ticketRepository.getById(idTicket);
		t.setStatut(ticket.getStatut());
		ticketRepository.save(t);
	}

}
