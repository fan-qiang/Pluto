package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.Book;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "ForexFWD")
@ToString(callSuper = true)
public  class ForexFWD extends Trade implements Serializable {


    @Column
    private String pors;
    private LocalDate valDate;
    private LocalDate spotDate;
    private String boughtCcy;
    private BigDecimal boughtAmt;
    private String soldCcy;
    private BigDecimal soldAmt;
    private BigDecimal spotRate;
    private BigDecimal xRate;
    private String splitCcy;
    private String splitSpotOrSwap;
    private LocalDate cTimeOptStartDate;
    private LocalDate cTimeOptEndDate;

    @OneToMany(mappedBy = "forexFWD", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ForeFWDBook> bookList;

    @Data
    @Entity(name = "ForeFWD_Book")
    public static  class  ForeFWDBook extends Book {
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String bookId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private ForexFWD forexFWD;
    }
}
