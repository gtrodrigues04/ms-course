package com.devsuperior.hr_payroll.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("dailyIncome")
    private Double dailyIncome;

    @JsonProperty("days")
    private Integer days;


    public Payment() {

    }

    public Payment(String name, Double dailyIncome, Integer days) {
        super();
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public Double getTotal() {
        return days * dailyIncome;
    }
}
