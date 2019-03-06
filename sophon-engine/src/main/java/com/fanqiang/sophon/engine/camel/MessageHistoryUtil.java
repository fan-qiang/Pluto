package com.fanqiang.sophon.engine.camel;

import org.apache.camel.Exchange;
import org.apache.camel.MessageHistory;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

public class MessageHistoryUtil {

    public static MessageHistory currentNode(Exchange exchange){
        List<MessageHistory> list = getMessageHistory(exchange);
        if(!CollectionUtils.isEmpty(list)){
            return list.get(list.size()-1);
        }
        return null;
    }

    public static List<MessageHistory> getMessageHistory(@NotNull Exchange exchange){
        List<MessageHistory> result = exchange.getProperty(Exchange.MESSAGE_HISTORY, List.class);
        if(result ==  null){
            result = Collections.emptyList();
        }
        return result;
    }
}
