package tn.esprit.tp.services.imp;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tp.Repository.clientrepository;
import tn.esprit.tp.entity.Client;
import tn.esprit.tp.services.interfaces.Iclientserivce;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements Iclientserivce {
    private final clientrepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client introuvable : " + id));
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void removeClient(Long id) {
        retrieveClient(id);
        clientRepository.deleteById(id);
    }

    @Override
    public Client modifyClient(Client client) {
        retrieveClient(client.getIdClient());
        return clientRepository.save(client);
    }
}
