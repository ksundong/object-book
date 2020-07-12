package dev.idion.moviereservation;

public interface DiscountCondition {

  boolean isSatisfiedBy(Screening screening);
}
