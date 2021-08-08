package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double baseSalary = 10_000;
        double taxPercent = .02;
        double incentivePerHour = 50;
        double bonusHours = 10;

        double taxes = baseSalary * taxPercent;
        double incentive = bonusHours * incentivePerHour;

        double netSalary = baseSalary-taxes+incentive;
        String salaryDetails =
                "Salary details :" +
                        "\n-----------------" +
                        "\nyour base salary : " + baseSalary +
                        "\ntaxes : " +taxes +
                        "\nsalary after taxes : "+ (baseSalary - taxes) +
                        "\nincetive : "+incentive +
                        "\n------------------"+
                        "\nnet salary : "+ (int)netSalary;


        System.out.println(salaryDetails);
    }
}