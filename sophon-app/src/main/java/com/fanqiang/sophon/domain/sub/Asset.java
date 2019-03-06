package com.fanqiang.sophon.domain.sub;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Data
@MappedSuperclass
public abstract class  Asset implements Serializable {

    @Column
    private String pors;
    @Column
    private String ccy;
    @Column
    private BigDecimal notional;
    @Column
    private LocalDate effDate;
    @Column
    private LocalDate matDate;
    @Column
    private BigDecimal interestRate;
    @Column
    private String interestBasis;
    @Column
    private String interestDmindex;
    @Column
    private String interestTerm;
    @Column
    private String interestCcy;
    @Column
    private BigDecimal interestSpread;
    @Column
    private String schedPayIntRule;
    @Column
    private String schedPayRule;
    @Column
    private String schedPayFreq;
    @Column
    private Integer schedPayAnnday;

}
