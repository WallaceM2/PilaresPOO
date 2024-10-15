package HER.POLI.ABS;
public class Autodromo {
        public static void main(String[] args) throws Exception {
            Carro jeep = new Carro();
            //jeep.ligar();
            jeep.setChassi("9231289723712");

            Moto z400 = new Moto();
            z400.setChassi("12345347647");
            //z400.ligar();

            Veiculo coringa = jeep;
            coringa.ligar();
        }
    }
