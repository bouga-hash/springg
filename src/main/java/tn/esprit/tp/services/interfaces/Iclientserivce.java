package tn.esprit.tp.services.interfaces;

import java.util.List;
import tn.esprit.tp.entity.Client;

public interface Iclientserivce {
    List<Client> retrieveAllClients();
    Client retrieveClient(Long id);
    Client addClient(Client client);
    void removeClient(Long id);
    Client modifyClient(Client client);
}
