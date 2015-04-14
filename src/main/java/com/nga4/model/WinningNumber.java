package com.nga4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "winning_number")
public class WinningNumber {
    @Id
    @GeneratedValue
    private long     id;

    @ManyToOne
    private Prize prize;
  
private int number;

    protected WinningNumber() {

    }
  
  public WinningNumber(Prize prize, int number) {
    this.prize = prize;
    this.number = number;
  }

    public void setNumber(int number) {
      this.number = number;
    }
    public int getNumber() {
      return number;
    }
  
    public void setPrize(Prize prize) {
        this.prize = prize;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


}