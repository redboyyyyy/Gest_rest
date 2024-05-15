package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Client;
import org.example.gestion_restaurant.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client) ;}

    @Override
    public Client updateClient(Client client) {
        return  clientRepository.save(client) ;
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);    }

    @Override
    public void deleteAllClients() {
clientRepository.deleteAll();
    }

    @Override
    public Optional<Client> getClientById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAllClients() {return clientRepository.findAll();
    }
}
