package org.top.dzavto.controller;

import org.springframework.web.bind.annotation.*;
import org.top.dzavto.model.Avto;
import org.top.dzavto.model.AvtoInterface;

import java.util.Optional;

@RestController
public class Controller {

    public Controller(AvtoInterface avtoInterface) {
        this.avtoInterface = avtoInterface;
    }

    @GetMapping("/ping")
    private String pong(){
        return "pong";}

    private final AvtoInterface avtoInterface;

    @GetMapping("/avto")
    public Iterable<Avto> all(){
        return avtoInterface.findAll();}

    @GetMapping("/avto/{id}")
    public Optional<Avto> get(@PathVariable Integer id){
        return  avtoInterface.findById(id);
    }

    @PostMapping("/avto")
    public Avto add(@RequestBody Avto avto){
        return avtoInterface.save(avto);
    }

    @DeleteMapping("/avto/{id}")
    public String delete(@PathVariable Integer id){
         avtoInterface.deleteById(id);
         return "Килл-удался";
    }

    @PatchMapping("/avto/{id}")
    public Optional<Avto> update(@RequestBody Avto avto) {
        if (avto.getId() == null) {
            return Optional.empty();
        }
        Optional<Avto> updated = avtoInterface.findById(avto.getId());
        if (updated.isPresent()) {
            avtoInterface.save(avto);
            return Optional.of(avto);
        }
        return Optional.empty();
    }

}
