package org.top.dzavto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "avto")
public class Avto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String marcaAvto;
    @Column
    private Integer god;
    @Column
    private String color;

    @Column
    private String nameAvto;

    @ManyToOne
    @JoinColumn(name = "vladelec_id")
    private VladelecAvto vladelec;

    @ManyToOne
    @JoinColumn(name = "stoimost_id")
    private Stoimost stoimost;

    public Strana getStrana() {
        return strana;
    }

    public void setStrana(Strana strana) {
        this.strana = strana;
    }

    @ManyToOne
    @JoinColumn(name = "strana_id")
    private Strana strana;

    public Stoimost getStoimost() {
        return stoimost;
    }

    public void setStoimost(Stoimost stoimost) {
        this.stoimost = stoimost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarcaAvto() {
        return marcaAvto;
    }

    public void setMarcaAvto(String marcaAvto) {
        this.marcaAvto = marcaAvto;
    }

    public Integer getGod() {
        return god;
    }

    public void setGod(Integer god) {
        this.god = god;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameAvto() {
        return nameAvto;
    }

    public void setNameAvto(String nameAvto) {
        this.nameAvto = nameAvto;
    }

    public VladelecAvto getVladelec() {
        return vladelec;
    }

    public void setVladelec(VladelecAvto vladelec) {
        this.vladelec = vladelec;
    }
}
