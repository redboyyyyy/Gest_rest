package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Client;
import org.example.gestion_restaurant.entities.Command;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CommandService {
    Command saveCommand(Command command);

    Command updateCommand(Command command);

    void deleteCommandById(Long id);

    void deleteAllCommands();

    Optional<Command> getCommandById(Long id);

    List<Command> getAllCommands();
}
