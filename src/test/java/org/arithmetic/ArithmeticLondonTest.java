package org.arithmetic;

import org.arithmetic.model.ICalculator;
import org.arithmetic.model.IRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ArithmeticLondonTest {
  @Mock
  private ICalculator mockedCalculator;
  @Mock
  private IRepository mockedRepository;
  @Test
  void londonSchool() {
    //Arrange
    int id = 5;
    int input1 = 1;
    int input2 = 2;

    int expectedSum = 3;
    when(mockedCalculator.sum(1, 2)).thenReturn(expectedSum);

    //Act
    ArithmeticApp arithmeticApp = new ArithmeticApp(mockedCalculator,
            mockedRepository);
    int actualSum = arithmeticApp.addAndSave(id, input1, input2);

    //Assert
    verify(mockedCalculator, times(1)).sum(1, 2);
    verify(mockedRepository, times(1)).upsert(5, expectedSum);
    assertEquals(expectedSum, actualSum);
  }
}




