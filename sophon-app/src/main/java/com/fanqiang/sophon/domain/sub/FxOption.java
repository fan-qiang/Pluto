package com.fanqiang.sophon.domain.sub;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class FxOption {

    @Column
    private String source;
    @Column
    private LocalDate valDate;
    @Column
    private String mainCcy;
    @Column
    private BigDecimal mainAmount;
    @Column
    private String moneyCcy;
    @Column
    private BigDecimal moneyAmount;
}
