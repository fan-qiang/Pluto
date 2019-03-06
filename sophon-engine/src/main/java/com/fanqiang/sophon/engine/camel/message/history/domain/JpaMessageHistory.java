package com.fanqiang.sophon.engine.camel.message.history.domain;

import lombok.Data;
import org.apache.camel.MessageHistory;
import org.apache.camel.NamedNode;

import javax.persistence.*;

@Data
@Entity
@Table(name="CAMEL_MESSAGE_HISTORY")
public class JpaMessageHistory {
    @Id
    @GeneratedValue
    private  Long id;
    private  String exchangeId;
    private  String routeId;

    @OneToOne(cascade=CascadeType.ALL)
    private  JpaNameNode node;
    private  String nodeId;
    private  long timestamp;
    private long elapsed;

    public static JpaMessageHistory from(String exchangeId, MessageHistory messageHistory){
        JpaMessageHistory jpaMessageHistory = new JpaMessageHistory();
        jpaMessageHistory.setExchangeId(exchangeId);
        jpaMessageHistory.setElapsed(messageHistory.getElapsed());
        jpaMessageHistory.setNode(JpaNameNode.of(messageHistory.getNode()));
        jpaMessageHistory.setNodeId(messageHistory.getNode().getId());
        jpaMessageHistory.setRouteId(messageHistory.getRouteId());
        jpaMessageHistory.setTimestamp(messageHistory.getTime());
        return jpaMessageHistory;

    }
    @Data
    @Entity
    @Table(name="CAMEL_MESSAGE_HISTORY_NAMENODE")
    public static class  JpaNameNode implements NamedNode{
        @Id
        @GeneratedValue
        private Long historyId;
        private String id;
        private String shortName;
        private String label;
        private String descriptionText;

        public static JpaNameNode of(NamedNode namedNode){
            JpaNameNode jpaNameNode = new JpaNameNode();
            jpaNameNode.setDescriptionText(namedNode.getDescriptionText());
            jpaNameNode.setLabel(namedNode.getLabel());
            jpaNameNode.setShortName(namedNode.getShortName());
            jpaNameNode.setId(namedNode.getId());
            return jpaNameNode;
        }
    }
}
