package org.top.dzavto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "strana")
public class Strana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String contry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public Set<Avto> getAvtosss() {
        return avtosss;
    }

    public void setAvtosss(Set<Avto> avtosss) {
        this.avtosss = avtosss;
    }

    @OneToMany(mappedBy = "strana")
    @JsonIgnore
    private Set<Avto> avtosss;
}
