package org.top.dzavto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "stoimost")
public class Stoimost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer chena;

    @OneToMany(mappedBy = "stoimost")
    @JsonIgnore
    private Set<Avto> avtoss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChena() {
        return chena;
    }

    public void setChena(Integer chena) {
        this.chena = chena;
    }

    public Set<Avto> getAvtoss() {
        return avtoss;
    }

    public void setAvtoss(Set<Avto> avtoss) {
        this.avtoss = avtoss;
    }
}
