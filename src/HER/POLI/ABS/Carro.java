package HER.POLI.ABS;

public class Carro extends Veiculo {
           
            public void ligar() {
                    confereCombustivel();
                    conferindoCambio();
                    System.out.println("Carro ligado.");
            }

            private void confereCombustivel() {
                    System.out.println("Conferindo combustivel");
            }

            private void conferindoCambio() {
                    System.out.println("Conferindo câmbio em P");
            }

}
