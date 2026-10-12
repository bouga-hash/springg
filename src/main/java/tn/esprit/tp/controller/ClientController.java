package tn.esprit.tp.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tp.entity.Client;
import tn.esprit.tp.services.interfaces.Iclientserivce;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final Iclientserivce clientService;

    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @DeleteMapping("/remove-client")
    public void removeClient(@RequestParam("clientId") Long clientId) {
        clientService.removeClient(clientId);
    }

    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client client) {
        return clientService.modifyClient(client);
    }
}
