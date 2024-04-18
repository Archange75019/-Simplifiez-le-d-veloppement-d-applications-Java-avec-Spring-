package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory {

    private ProjetManager projetManager;




    public ProjetManager getProjetManager() {
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }
    private TicketManager ticketManager;

    public TicketManager getTicketManager() {
        return this.ticketManager;
    }

    public void setTicketManager(TicketManager pTicketManager) {
        this.ticketManager = pTicketManager;
    }
}
