package com.fanqiang.sophon.engine.camel.message.history;

import com.fanqiang.sophon.engine.camel.message.history.domain.JpaMessageHistory;
import com.fanqiang.sophon.engine.camel.message.history.repository.JpaMessageHistoryRepository;
import org.apache.camel.Exchange;
import org.apache.camel.MessageHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageHistoryService {

    final JpaMessageHistoryRepository messageHistoryRepository;

    @Autowired
    public MessageHistoryService(JpaMessageHistoryRepository messageHistoryRepository) {
        this.messageHistoryRepository = messageHistoryRepository;
    }

    @Transactional
    public void saveMessageHistory(Exchange exchange){
        List<MessageHistory> list = exchange.getProperty(Exchange.MESSAGE_HISTORY, List.class);
        List<JpaMessageHistory> jpaMessageHistories = list.stream().
                map(messageHistory ->
                        JpaMessageHistory.from(exchange.getExchangeId(), messageHistory))
                .collect(Collectors.toList());

        messageHistoryRepository.saveAll(jpaMessageHistories);
    }
}
