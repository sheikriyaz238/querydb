package com.hotelagency.querydb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Tariff {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer tariff_id;

  private String room_type;

  private String amount;

  public Integer getTariff_id() {
    return tariff_id;
  }

  public void setTariff_id(Integer tariff_id) {
    this.tariff_id = tariff_id;
  }

  public String getRoom_type() {
    return room_type;
  }

  public void setRoom_type(String room_type) {
    this.room_type = room_type;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }
}