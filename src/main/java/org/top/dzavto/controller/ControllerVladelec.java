package org.top.dzavto.controller;

import org.springframework.web.bind.annotation.*;
import org.top.dzavto.model.VladelecAvto;
import org.top.dzavto.repository.VladelecInterface;

import java.util.Optional;


@RestController
public class ControllerVladelec {

    private final VladelecInterface vladelecInterface;

    public ControllerVladelec(VladelecInterface vladelecInterface) {
        this.vladelecInterface = vladelecInterface;
    }

    @GetMapping("/vladelec")
    public Iterable<VladelecAvto> all(){
        return vladelecInterface.findAll();}

    @GetMapping("/vladelec/{id}")
    public Optional<VladelecAvto> get(@PathVariable Integer id){
        return  vladelecInterface.findById(id);
    }

    @PostMapping("/vladelec")
    public VladelecAvto add(@RequestBody VladelecAvto vladelecAvto){
        return vladelecInterface.save(vladelecAvto);
    }

    @DeleteMapping("/vladelec/{id}")
    public String delete(@PathVariable Integer id){
        vladelecInterface.deleteById(id);
        return "Килл-удался";
    }

    @PatchMapping("/vladelec/{id}")
    public Optional<VladelecAvto> update(@RequestBody VladelecAvto vladelecAvto) {
        if (vladelecAvto.getId() == null) {
            return Optional.empty();
        }
        Optional<VladelecAvto> updated = vladelecInterface.findById(vladelecAvto.getId());
        if (updated.isPresent()) {
            vladelecInterface.save(vladelecAvto);
            return Optional.of(vladelecAvto);
        }
        return Optional.empty();
    }
}
