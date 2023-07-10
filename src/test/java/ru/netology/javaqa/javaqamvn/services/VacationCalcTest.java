package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.javaqamvn.services.VacationCalc;

public class VacationCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/VacationCalc.csv")
   public void shouldTestVacation(int income, int expenses, int threshold, int expected) {

        VacationCalc service = new VacationCalc();

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
