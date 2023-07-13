package org.top.dzavto.controller;

import org.springframework.web.bind.annotation.*;
import org.top.dzavto.model.Avto;
import org.top.dzavto.model.Stoimost;
import org.top.dzavto.repository.StoimostInterface;

import java.util.Optional;

@RestController
public class ControllerStoimost {
    private final StoimostInterface stoimostInterface;

    public ControllerStoimost(StoimostInterface stoimostInterface) {
        this.stoimostInterface = stoimostInterface;
    }

    @GetMapping("/stoimost")
    public Iterable<Stoimost> all(){
        return stoimostInterface.findAll();}

    @GetMapping("/stoimost/{id}")
    public Optional<Stoimost> get(@PathVariable Integer id){
        return  stoimostInterface.findById(id);
    }

    @PostMapping("/stoimost")
    public Stoimost add(@RequestBody Stoimost stoimost){
        return stoimostInterface.save(stoimost);
    }

    @DeleteMapping("/stoimost/{id}")
    public String delete(@PathVariable Integer id){
        stoimostInterface.deleteById(id);
        return "Килл-удался";
    }

    @PatchMapping("/stoimost/{id}")
    public Optional<Stoimost> update(@RequestBody Stoimost stoimost) {
        if (stoimost.getId() == null) {
            return Optional.empty();
        }
        Optional<Stoimost> updated = stoimostInterface.findById(stoimost.getId());
        if (updated.isPresent()) {
            stoimostInterface.save(stoimost);
            return Optional.of(stoimost);
        }
        return Optional.empty();
    }
}
