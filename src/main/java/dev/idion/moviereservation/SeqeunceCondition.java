package dev.idion.moviereservation;

public class SeqeunceCondition implements DiscountCondition {

  private int sequence;

  public SeqeunceCondition(int sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.isSequence(sequence);
  }
}
