import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //Объявление переменных payed - заплачено; сhek - сумма расчета бонуса; balance - текущий баланс; bonus - начисляемый бонус
        System.out.println("Введите суммы пополнения:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = reader.readLine();
        int payed = Integer.parseInt(tmp);
        int chek = 100;
        int balance = 5000;
        int bonus = 0;

        //Расчет бонуса и вывод итоговой суммы пополнения баланса
        if (payed > 1000) {
            bonus = payed / chek;
        }
        System.out.println("Итоговый баланс: " + (balance + payed + bonus));
    }
}