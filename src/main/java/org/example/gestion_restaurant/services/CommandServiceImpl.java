package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Command;
import org.example.gestion_restaurant.repositories.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommandServiceImpl implements CommandService{

    @Autowired
    private CommandRepository commandRepository;
    @Override
    public Command saveCommand(Command command) {
        return commandRepository.save(command);
    }

    @Override
    public Command updateCommand(Command command) {
        return commandRepository.save(command);
    }

    @Override
    public void deleteCommandById(Long id) {
        commandRepository.deleteById(id);
    }

    @Override
    public void deleteAllCommands() {
        commandRepository.deleteAll();
    }

    @Override
    public Optional<Command> getCommandById(Long id) {
        return commandRepository.findById(id);
    }

    @Override
    public List<Command> getAllCommands() {
        return commandRepository.findAll();
    }

}
