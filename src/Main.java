public class Main {
    public static void main(String[] args) {
        // ex1
        byte a = 100;
        short b = 1000;
        int c = 65;
        long d = 988L;
        float e = 78.8f;
        double f = 9.8;
        char g = 7;
        boolean h = true;
        System.out.println("ex1 " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + " " + g + " " + h);
        // ex2
        double weightB1 = 78.2;
        double weightB2 = 82.7;
        double sumWeight = weightB1 + weightB2;
        double diffWeight = weightB2 - weightB1;
        System.out.println("sum=" + sumWeight + " diff=" + diffWeight);
        // ex3
        int weightBananas = 5*80;
        int weightMilk = 2*105;
        int weightIce = 2*100;
        int weightEgg = 4*70;
        int sum1 = weightEgg+weightIce+weightMilk+weightBananas;
        double sum2 = sum1/1000;
        System.out.println("sum1(gram)="+sum1+" sum2(kg)="+sum2);
        // ex4
        int weight =7*1000;
        double day1 = 7000/250;
        double day2 =7000/500;
        System.out.println("day1="+day1+" day2="+day2);
        // ex5
        double moneyMasha =67760;
        double moneyDenis =83690;
        double moneyKris =76230;
        double newmoneyMasha =moneyMasha*1.1;
        double newmoneyDenis =moneyDenis*1.1;
        double newmoneyKris =moneyKris*1.1;
        double sumMoneymasha =12*(newmoneyMasha-moneyMasha);
        double sumMoneymdenis =12*(newmoneyDenis-moneyDenis);
        double sumMoneykris =12*(newmoneyKris-moneyKris);
        System.out.println("Masha now="+newmoneyMasha+" grow="+sumMoneymasha);
        System.out.println("Denis now="+newmoneyDenis+" grow="+sumMoneymdenis);
        System.out.println("Kris now="+newmoneyKris+" grow="+sumMoneykris);

    }

}