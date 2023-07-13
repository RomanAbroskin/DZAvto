package org.top.dzavto.repository;

import org.springframework.data.repository.CrudRepository;
import org.top.dzavto.model.Stoimost;
import org.top.dzavto.model.VladelecAvto;

public interface StoimostInterface extends CrudRepository<Stoimost,Integer> {
}
