package Monitores;

public class Conta implements Runnable{
    private float saldo;
    private int ID;
    private String nome;
    private int agencia;

    public Conta(int ID, String nome, int agencia){
        this.ID = ID;
        this.nome = nome;
        this.agencia = agencia;
    }

    public synchronized boolean depositar(int quantia){
        if (quantia <= 0) return false;
        this.saldo += quantia;
        for (int i = 3; i > 0 ; i--) {
            System.out.println("Depositando em " + i);
        }
        return true;
    }

    public synchronized boolean retirar(int quantia){
        if (quantia <= 0 || this.saldo < quantia) return false;
        this.saldo -= quantia;
        for (int i = 3; i > 0 ; i--) {
            System.out.println("Retirando em " + i);
        }
        return true;
    }

    @Override
    public void run() {
        depositar(500);
        retirar(200);
    }
}
