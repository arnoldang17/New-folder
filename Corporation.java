/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ic
 */
public class Corporation {

    int Gross_pay(int hours, int ratephr) {

        return hours * ratephr;
    }

    double SSDeduction(int amount1) {

        if (amount1 <= 15999 && amount1 >= 10000) {
            return amount1 * .02;
        } else if (amount1 <= 20999 && amount1 >= 16000) {
            return amount1 * .03;
        } else if (amount1 <= 25999 && amount1 >= 21000) {
            return amount1 * .04;
        } else if (amount1 <= 30999 && amount1 >= 26000) {
            return amount1 * .05;
        } else if (amount1 <= 35999 && amount1 >= 31000) {
            return amount1 * .06;
        } else if (amount1 <= 45999 && amount1 >= 36000) {
            return amount1 * .07;
        } else if (amount1 <= 50999 && amount1 >= 46000) {
            return amount1 * .08;
        } else {
            return amount1 * .1;
        }

    }

    double Pagibig(int amount2) {
        if (amount2 <= 15999 && amount2 >= 10000) {
            return amount2 * .01;
        } else if (amount2 <= 20999 && amount2 >= 16000) {
            return amount2 * .02;
        } else if (amount2 <= 25999 && amount2 >= 21000) {
            return amount2 * .03;
        } else if (amount2 <= 30999 && amount2 >= 26000) {
            return amount2 * .04;
        } else if (amount2 <= 35999 && amount2 >= 31000) {
            return amount2 * .05;
        } else if (amount2 <= 45999 && amount2 >= 36000) {
            return amount2 * .06;
        } else if (amount2 <= 50999 && amount2 >= 46000) {
            return amount2 * .07;
        } else {
            return amount2 * .09;
        }
    }

    double Tax(int amount3) {
        if (amount3 <= 15999 && amount3 >= 10000) {
            return amount3 * .0;
        } else if (amount3 <= 20999 && amount3 >= 16000) {
            return amount3 * .01;
        } else if (amount3 <= 25999 && amount3 >= 21000) {
            return amount3 * .02;
        } else if (amount3 <= 30999 && amount3 >= 26000) {
            return amount3 * .03;
        } else if (amount3 <= 35999 && amount3 >= 31000) {
            return amount3 * .04;
        } else if (amount3 <= 45999 && amount3 >= 36000) {
            return amount3 * .05;
        } else if (amount3 <= 50999 && amount3 >= 46000) {
            return amount3 * .06;
        } else {
            return amount3 * .08;
        }
    }
    
    }
    class qwe {

        String name;

    }
