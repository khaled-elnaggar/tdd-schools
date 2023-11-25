package org.arithmetic;

import org.arithmetic.helper.InMemoryRepository;
import org.arithmetic.model.Calculator;
import org.arithmetic.model.ICalculator;
import org.arithmetic.model.IRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticChicagoTest {
  ICalculator calculator = new Calculator();
  IRepository fakeRepository = new InMemoryRepository();

  @Test
  void chicagoSchool() {
    //Arrange
    int id = 5;
    int input1 = 1;
    int input2 = 2;

    //Act
    ArithmeticApp arithmeticApp = new ArithmeticApp(calculator, fakeRepository);
    int actualSum = arithmeticApp.addAndSave(id, input1, input2);

    //Assert
    int expectedSum = 3;
    assertEquals(expectedSum, actualSum);
    assertEquals(expectedSum, fakeRepository.findById(id));
  }
}
