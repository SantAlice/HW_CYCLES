package ru.netology.javaqa.javaqamvn.services;
public class VacationCalc {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int countOfMonths = 0;
        int savings = 0;

        for (int month = 0; month <= 12; month++) {
            if (savings >= threshold) {
                countOfMonths++;
                savings = savings - expenses;
                savings = savings - expenses * 3;
            } else {
                savings = savings + income;
                savings = savings - expenses;
            }
        }

        return countOfMonths;
    }
}

