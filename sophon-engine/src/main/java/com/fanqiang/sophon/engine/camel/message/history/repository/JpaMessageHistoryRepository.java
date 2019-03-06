package com.fanqiang.sophon.engine.camel.message.history.repository;

import com.fanqiang.sophon.engine.camel.message.history.domain.JpaMessageHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageHistoryRepository extends JpaRepository<JpaMessageHistory,Integer> {

}
