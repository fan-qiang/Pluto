package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.Asset;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity(name = "swap")
public class Swap extends Trade implements Serializable {


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "swap")
    private List<SwapAsset> assets;

    @Data
    @Entity(name = "SwapAsset")
    public static class SwapAsset extends Asset {
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String assetId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private Swap swap;
    }
}
