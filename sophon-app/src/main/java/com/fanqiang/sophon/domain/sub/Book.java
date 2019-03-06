package com.fanqiang.sophon.domain.sub;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@Data
@MappedSuperclass
public abstract class Book {

    @Column
    private String book;
    @Column
    private String desk;
    @Column
    private String ccy1;
    @Column
    private String ccy2;
    @Column
    private BigDecimal rate;
    @Column
    private BigDecimal nearRate;
    @Column
    private BigDecimal trueSpotRate;
    @Column
    private BigDecimal farRate;
    @Column
    private String splitRateFormat;
    @Column
    private String bookType;
}
