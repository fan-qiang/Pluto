package com.fanqiang.sophon.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity(name = "Bond")
public class Bond extends Trade implements Serializable {

    @Column
    private String sec;
    @Column
    private String pors;
    @Column
    private BigDecimal notional;
    @Column
    private String ccy;
    @Column
    private LocalDate valueDate;
    @Column
    private LocalDate settleDate;
    @Column
    private BigDecimal settlement;
    @Column
    private BigDecimal price;
    @Column
    private BigDecimal accrual;
    @Column
    private BigDecimal yield;
}
