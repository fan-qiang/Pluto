package com.fanqiang.sophon.engine.camel.trace.domain;

import org.apache.camel.processor.interceptor.jpa.JpaTraceEventMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface TraceMessageRepo extends JpaRepository<JpaTraceEventMessage,Integer> {

}
