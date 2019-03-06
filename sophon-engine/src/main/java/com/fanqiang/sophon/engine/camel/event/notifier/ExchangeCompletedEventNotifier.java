package com.fanqiang.sophon.engine.camel.event.notifier;

import com.fanqiang.sophon.engine.camel.message.history.repository.JpaMessageHistoryRepository;
import org.apache.camel.management.event.ExchangeCompletedEvent;
import org.apache.camel.support.EventNotifierSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EventObject;

@Component
public class ExchangeCompletedEventNotifier extends EventNotifierSupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExchangeCompletedEventNotifier.class);

    private final
    JpaMessageHistoryRepository messageHistoryRepository;

    @Autowired
    public ExchangeCompletedEventNotifier(JpaMessageHistoryRepository messageHistoryRepository) {
        this.messageHistoryRepository = messageHistoryRepository;
    }

    @Override
    public void notify(EventObject event) throws Exception {
        ExchangeCompletedEvent exchangeCompletedEvent = (ExchangeCompletedEvent) event;
        //LOGGER.info("message process completed !..." + exchangeCompletedEvent.toString());
    }

    @Override
    public boolean isEnabled(EventObject event) {
        return ExchangeCompletedEvent.class.isInstance(event);
    }
}
