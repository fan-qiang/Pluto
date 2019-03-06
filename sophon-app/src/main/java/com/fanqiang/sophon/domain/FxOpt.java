package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.FxOption;
import com.fanqiang.sophon.jaxb.fxOpt.SUMMIT;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "fxopt")
public class FxOpt  extends Trade{


    private  String pors;
    private  String porc;
    private  String style;

    @Column(scale = 6)
    private BigDecimal strike;
    private LocalDate expDate;
    private LocalDate settleDataStlDate;
    private String settledataStlmode;
    private String premdataCcy;
    private String premdataMode;
    private LocalDate premdataDate;
    private BigDecimal premdataPremium;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "fxOpt")
    private List<FxoptOption> optionList;

    @Data
    @Entity(name = "Fxopt_Option")
    public static  class  FxoptOption extends FxOption {
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String optionId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private FxOpt fxOpt;

    }
}
