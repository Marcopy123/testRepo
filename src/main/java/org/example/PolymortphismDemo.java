package org.example;

class CentralBank {
    double mortgageRate() {
        return 3;
    }
}

class RBC extends CentralBank {

    double mortgageRate() {
        return 5;
    }
}

class BMO extends CentralBank {

    double mortgageRate() {
        return 5.5;
    }
}

public class PolymortphismDemo {
    public static void main(String[] args) {
        CentralBank bank = new RBC(); // compile time
        bank = new BMO(); // run time
        System.out.println(bank.mortgageRate());
    }
}
