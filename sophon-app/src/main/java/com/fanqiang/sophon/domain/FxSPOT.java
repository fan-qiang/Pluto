package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.Book;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "fxspot")
public class FxSPOT extends Trade {

    private String pors;
    private LocalDate valDate;
	private LocalDate spotDate;
	private String boughtCcy;
	private BigDecimal boughtAmt;
	private String soldCcy;
	private BigDecimal soldAmt;
	private String splitCcy;
	private String splitSpotOrSwap;

    @OneToMany(mappedBy = "fxspot", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<FxSPOT.FxSpotBook> bookList;


	@Data
	@Entity(name = "fxspot_book")
	public static  class FxSpotBook extends Book {

        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String bookId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private FxSPOT fxspot;

    }

}
