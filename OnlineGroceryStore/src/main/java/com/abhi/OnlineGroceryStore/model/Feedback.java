package com.abhi.OnlineGroceryStore.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private Date feedbackDate;

    @ManyToOne
    private User customer;

    @ManyToOne
    private Order order;

    public Feedback() {}

    public Feedback(String content, Date feedbackDate, User customer, Order order) {
        this.content = content;
        this.feedbackDate = feedbackDate;
        this.customer = customer;
        this.order = order;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getFeedbackDate() { return feedbackDate; }
    public void setFeedbackDate(Date feedbackDate) { this.feedbackDate = feedbackDate; }

    public User getCustomer() { return customer; }
    public void setCustomer(User customer) { this.customer = customer; }

    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}
