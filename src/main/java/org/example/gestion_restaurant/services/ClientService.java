package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientService{
    Client saveClient(Client client);

    Client updateClient(Client client);

    void deleteClientById(Long id);

    void deleteAllClients();

    Optional<Client> getClientById(Long id);

    List<Client> getAllClients();


}
