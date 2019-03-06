package com.fanqiang.sophon.domain;

import com.fanqiang.sophon.domain.sub.Asset;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity(name = "Repo")
public class Repo extends Trade{


    private String repType;
    private String repoMktType;
    private String passThru;
    private String matPassThru;
    private Integer numCollateral;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "repo",orphanRemoval = true)
    private List<RepoColl> collList;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "repo",orphanRemoval = true)
    private List<RepoAsset> assets;

    @Data
    @Entity(name = "repo_coll")
    public static class RepoColl implements Serializable {

        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String collId;

        private String sec;
        private BigDecimal quantity;
        private String marginExp;
        private BigDecimal margin;
        private BigDecimal startDirtyPrice;
        @Column(scale = 20)
        private BigDecimal endDirtyPrice;
        private String type;
        private String ccy;
        private String CollType;

        @ManyToOne
        @JoinColumn(name = "msg_id")
        private Repo repo;

    }

    @Data
    @Entity(name = "RepoAsset")
    public static class RepoAsset extends Asset{
        @Id
        @GeneratedValue(generator="system-uuid")
        @GenericGenerator(name="system-uuid", strategy = "uuid")
        private String assetId;

        @ManyToOne
        @JoinColumn(name = "msgId")
        private Repo repo;


    }

}
