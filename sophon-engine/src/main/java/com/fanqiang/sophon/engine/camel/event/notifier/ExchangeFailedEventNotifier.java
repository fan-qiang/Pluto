package com.fanqiang.sophon.engine.camel.event.notifier;


import com.fanqiang.sophon.engine.camel.message.history.MessageHistoryService;
import com.fanqiang.sophon.engine.camel.message.history.domain.JpaMessageHistory;
import com.fanqiang.sophon.engine.camel.message.history.repository.JpaMessageHistoryRepository;
import com.fanqiang.sophon.engine.camel.trace.domain.TraceMessageRepo;
import org.apache.camel.Exchange;
import org.apache.camel.MessageHistory;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.management.event.ExchangeFailedEvent;
import org.apache.camel.support.EventNotifierSupport;
import org.apache.camel.util.MessageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EventObject;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExchangeFailedEventNotifier extends EventNotifierSupport {

    private static Logger LOGGER = LoggerFactory.getLogger(ExchangeFailedEventNotifier.class);


    @Autowired
    ProducerTemplate producerTemplate;

    @Autowired
    MessageHistoryService messageHistoryService;

    public void notify(EventObject event) throws Exception {
       ExchangeFailedEvent failedEvent = (ExchangeFailedEvent)event;
       //messageHistoryService.saveMessageHistory(failedEvent.getExchange());
    }

    public boolean isEnabled(EventObject event) {
        return ExchangeFailedEvent.class.isInstance(event);
    }

}
