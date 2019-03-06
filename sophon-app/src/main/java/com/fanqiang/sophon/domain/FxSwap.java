package com.fanqiang.sophon.domain;


import com.fanqiang.sophon.domain.sub.Book;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "FxSwap")
public class FxSwap extends Trade {

    private String pors;
    private LocalDate shortValDate;
    private LocalDate valdate;
    private LocalDate spotDate;
    private BigDecimal spotRate;
    private BigDecimal shortXRate;
    @Column(scale = 6)
    private BigDecimal xRate;
    private String boughtCcy;
    private String soldCcy;
    private BigDecimal boughtAmt;
    private BigDecimal soldAmt;
    private BigDecimal fwdBoughtAmt;
    private BigDecimal fwdSoldAmt;
    private String splitCcy;
    private String splitSpotOrSwap;
    private LocalDate  cTimeOptStartDate;
    private LocalDate  cTimeOptEndDate;

    @OneToMany(mappedBy="fxSwap", cascade = CascadeType.ALL)
    private List<FxSwapBook> bookList;

    @Data
    @Entity(name = "fxSwapBook")
    public static class FxSwapBook extends Book {
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String bookId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private FxSwap fxSwap;
    }
}
