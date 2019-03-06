package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.Asset;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "mm")
public class MM extends Trade{


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "mm")
    private List<MMAsset> assets;

    @Data
    @Entity(name = "mm_asset")
    public static class MMAsset extends Asset {

        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String id;
        private String mmType;
        private String Deliverable;
        private String interestIntrateType;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private MM mm;
    }
}
