package org.top.dzavto.repository;

import org.springframework.data.repository.CrudRepository;
import org.top.dzavto.model.Avto;

public interface AvtoInterface extends CrudRepository<Avto,Integer> {
}
