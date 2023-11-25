package org.arithmetic;

import org.arithmetic.model.ICalculator;
import org.arithmetic.model.IRepository;

public class ArithmeticApp {
  private final ICalculator calculator;
  private final IRepository repository;

  public ArithmeticApp(ICalculator calculator, IRepository repository) {
    this.calculator = calculator;
    this.repository = repository;
  }

  public int addAndSave(int id, int x, int y) {
    int sum = calculator.sum(x, y);
    repository.upsert(id, sum);
    return sum;
  }
}

