package HER.POLI.ABS;

public abstract class Veiculo {
    
        private String chassi;

        public String chassi(){
            return chassi;
        }

        public void setChassi(String chassi) {
            this.chassi = chassi;
        }

        public abstract void ligar();
}
