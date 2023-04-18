package Monitores;

public class Main {
    public static void main(String[] args) {
        Conta myAccount = new Conta(10567, "Robson", 9023);
        Thread a = new Thread(myAccount);
        Thread b = new Thread(myAccount);

        a.start();
        b.start();
    }
}
