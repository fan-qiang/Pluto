package com.fanqiang.sophon.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Trade implements Serializable {

    @Id
    private String msgId;

    @Column
    private String externalId;
    @Column
    private String type;
    @Column
    private String version;
    @Column
    private String action;
    @Column
    private String timestamp;
    @Column
    private String targetSystem;
    @Column
    private String sourceSystem;
    @Column
    private String tradeType;
    @Column
    private LocalDate tradeDate;
    @Column
    private String trader;
    @Column
    private String cust;
    @Column
    private String company;
    @Column
    private String desk;
    @Column
    private String book;
    @Column
    private String comment1;
    @Column
    private String comment2;
    @Column
    private String extSystem;
    @Column
    private String extTradeId;

}
