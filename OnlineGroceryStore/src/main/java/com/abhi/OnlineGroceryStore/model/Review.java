package com.abhi.OnlineGroceryStore.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private Integer rating;
    private Date reviewDate;

    @ManyToOne
    private User customer;

    @ManyToOne
    private Product product;

    public Review() {}

    public Review(String content, Integer rating, Date reviewDate, User customer, Product product) {
        this.content = content;
        this.rating = rating;
        this.reviewDate = reviewDate;
        this.customer = customer;
        this.product = product;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }

    public Date getReviewDate() { return reviewDate; }
    public void setReviewDate(Date reviewDate) { this.reviewDate = reviewDate; }

    public User getCustomer() { return customer; }
    public void setCustomer(User customer) { this.customer = customer; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}
