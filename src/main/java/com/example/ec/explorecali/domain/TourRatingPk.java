package com.example.ec.explorecali.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TourRatingPk implements Serializable {

    @ManyToOne
    private Tour tour;

    @Column(insertable = false,updatable = false,nullable = false)
    private Integer customerId;

    public TourRatingPk(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Column(nullable = false)
    private Integer score;

    public TourRatingPk(Tour tour, Integer customerId, Integer score, String comment) {
        this.tour = tour;
        this.customerId = customerId;
        this.score = score;
        this.comment = comment;
    }

    @Column

    private String comment;

    public TourRatingPk() {}

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Tour getTour() {
        return tour;
    }

    public TourRatingPk(Tour tour, Integer customerId,Integer score) {
        this.tour = tour;
        this.customerId = customerId;
        this.score = score;
    }

    public TourRatingPk(Tour tour, Integer customerId) {
        this.tour = tour;
        this.customerId = customerId;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourRatingPk that = (TourRatingPk) o;
        return Objects.equals(tour, that.tour) &&
                Objects.equals(customerId, that.customerId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tour, customerId);
    }
}
