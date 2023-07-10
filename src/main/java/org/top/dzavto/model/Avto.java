package org.top.dzavto.model;

import jakarta.persistence.*;

@Entity
@Table
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


}
