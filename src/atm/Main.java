package atm;

public class Main {
    public static void main(String[] args) {
        Bank aval = new Bank("Аваль", 0);
        ATM firstBankATM = new ATM(aval);
        User Valera = new User(500, 0);
        System.out.println(firstBankATM.getCurrentMoney());
        firstBankATM.depositBanknote(Banknotes.FIVEHUNDRED, Valera);
        System.out.println(firstBankATM.getCurrentMoney());
    }
}