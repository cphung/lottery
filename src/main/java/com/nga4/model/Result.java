package com.nga4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue
    private long     id;

    @ManyToOne
    private Draw draw;
  
  @ManyToOne
  private WinningNumber winningNumber;
  

    protected Result() {

    }
  
  public Result(Draw draw, WinningNumber winningNumber) {
    this.draw = draw;
    this.winningNumber = winningNumber;
  }

    public void setWinningNumber(WinningNumber winningNumber) {
        this.winningNumber = winningNumber;
    }

    public WinningNumber getWinningNumber() {
        return winningNumber;
    }

    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public Draw getDraw() {
        return draw;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


}