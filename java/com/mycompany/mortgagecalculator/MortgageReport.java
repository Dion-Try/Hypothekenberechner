/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mortgagecalculator;

import java.text.NumberFormat;

/**
 *
 * @author diond
 */
public class MortgageReport {

  private final NumberFormat currency;
  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
      System.out.println();
      System.out.println("PAYMENT SCHEDULE");
      System.out.println("----------------");
      for (double balance : calculator.getRemainingBalances())
        System.out.println(currency.format(balance));
  }

  public void printMortgage() {
      double mortgage = calculator.calculateMortgage();
      String mortgageFormatted = currency.format(mortgage);
      System.out.println();
      System.out.println("MORTGAGE");
      System.out.println("--------");
      System.out.println("Monthly Payments: " + mortgageFormatted);
  }
}

