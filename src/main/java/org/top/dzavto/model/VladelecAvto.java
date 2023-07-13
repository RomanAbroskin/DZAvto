package org.top.dzavto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vladelec")
public class VladelecAvto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "vladelec")
    @JsonIgnore
    private Set<Avto> avtos;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Avto> getAvtos() {
        return avtos;
    }

    public void setAvtos(Set<Avto> avtos) {
        this.avtos = avtos;
    }
}
