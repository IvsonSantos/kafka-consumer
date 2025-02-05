package com.ivson.ws.emailnotification.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "processed-events")
@Getter
@Setter
@NoArgsConstructor
public class ProcessEventEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String messageId;

    @Column(nullable = false)
    private String productId;

    public ProcessEventEntity(String messageId, String productId) {
        this.messageId = messageId;
        this.productId = productId;
    }
}
