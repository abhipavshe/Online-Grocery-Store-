package com.abhi.OnlineGroceryStore.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private Date notificationDate;
    private String status;

    @ManyToOne
    private User recipient;

    public Notification() {}

    public Notification(String message, Date notificationDate, String status, User recipient) {
        this.message = message;
        this.notificationDate = notificationDate;
        this.status = status;
        this.recipient = recipient;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Date getNotificationDate() { return notificationDate; }
    public void setNotificationDate(Date notificationDate) { this.notificationDate = notificationDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public User getRecipient() { return recipient; }
    public void setRecipient(User recipient) { this.recipient = recipient; }
}

