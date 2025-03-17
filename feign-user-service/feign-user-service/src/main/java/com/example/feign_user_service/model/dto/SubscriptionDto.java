package com.example.feign_user_service.model.dto;

public class SubscriptionDto {

    private Integer id;
    private String startDate;
    private String endDate;
    private Integer userId;

    public SubscriptionDto(Integer id, String startDate, String endDate, Integer userId) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
