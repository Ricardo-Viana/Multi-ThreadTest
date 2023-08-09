// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VerificaNumerosPrimos {
    private int numero;
    private int sleepTime = 100;

    public VerificaNumerosPrimos(int numero) {
        this.numero = numero;
    }

    public void run() {
        if(isPrime(this.numero)) {
            System.out.println("O numero " + this.numero + " e primo.");
        }
        else{
            System.out.println("O numero " + this.numero + " nao e primo.");
        }
        try { Thread.sleep(sleepTime); } catch (InterruptedException ie) { }
    }

    private boolean isPrime(int numero) {
        if(numero <= 1){
            return false;
        }
        for(int i = 2; i <= numero/2; i++){
            if(numero % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            new VerificaNumerosPrimos(Integer.parseInt(args[i])).run();
        }
    }
}