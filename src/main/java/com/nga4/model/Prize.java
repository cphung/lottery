package com.nga4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prize")
public class Prize {
    @Id
    @GeneratedValue
    private int      id;

    private String   name;
    private long     prize;

    @ManyToOne
    private Province province;

    public Prize() {

    }

    public void setPrize(long prize) {
        this.prize = prize;
    }

    public long getPrize() {
        return prize;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }

}
