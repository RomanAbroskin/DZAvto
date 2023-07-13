package org.top.dzavto.controller;

import org.springframework.web.bind.annotation.*;
import org.top.dzavto.model.Avto;
import org.top.dzavto.model.Strana;
import org.top.dzavto.repository.StranaInterface;

import java.util.Optional;

@RestController
public class ControllerStrana {

    private final StranaInterface stranaInterface;

    public ControllerStrana(StranaInterface stranaInterface) {
        this.stranaInterface = stranaInterface;
    }

    @GetMapping("/strana")
    public Iterable<Strana> all(){
        return stranaInterface.findAll();}

    @GetMapping("/strana/{id}")
    public Optional<Strana> get(@PathVariable Integer id){
        return  stranaInterface.findById(id);
    }

    @PostMapping("/strana")
    public Strana add(@RequestBody Strana strana){
        return stranaInterface.save(strana);
    }

    @DeleteMapping("/strana/{id}")
    public String delete(@PathVariable Integer id){
        stranaInterface.deleteById(id);
        return "Килл-удался";
    }

    @PatchMapping("/strana/{id}")
    public Optional<Strana> update(@RequestBody Strana strana) {
        if (strana.getId() == null) {
            return Optional.empty();
        }
        Optional<Strana> updated = stranaInterface.findById(strana.getId());
        if (updated.isPresent()) {
            stranaInterface.save(strana);
            return Optional.of(strana);
        }
        return Optional.empty();
    }
}
