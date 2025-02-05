package com.ivson.ws.emailnotification.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessedEventRepository extends JpaRepository<ProcessEventEntity, Long> {

    ProcessEventEntity findByMessageId(String messageId);

}
