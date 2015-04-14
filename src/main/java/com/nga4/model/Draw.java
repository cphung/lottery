package com.nga4.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "draw")
public class Draw {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long     id;

    @ManyToOne
    private DrawType drawType;

    @ManyToOne
    private Province province;

    private Date     date;

    protected Draw() {

    }

    public Draw(DrawType drawType, Province province, Date date) {
        this.date = date;
        this.province = province;
        this.drawType = drawType;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setDrawType(DrawType drawType) {
        this.drawType = drawType;
    }

    public DrawType getDrawType() {
        return drawType;
    }


}
