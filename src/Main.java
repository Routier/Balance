

public class Main {
    public static void main(String[] args) {

        int payed = 1027; // уплаченная сумма
        int chek = 100; //сумма расчета бонуса
        int balance = 5000; //текущий баланс
        int bonus = 0; //начисляемый бонус

        //Расчет бонуса и вывод итоговой суммы пополнения баланса
        if (payed > 1000) {
            bonus = payed / chek;
        }
        System.out.println("Итоговый баланс: " + (balance + payed + bonus));
    }
}