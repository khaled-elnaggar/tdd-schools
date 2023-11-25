package org.arithmetic.model;

public class Calculator implements ICalculator {

  @Override
  public int sum(int n1, int n2) {
    return n1 + n2;
  }
}
