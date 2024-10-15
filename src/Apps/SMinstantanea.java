package Apps;

public abstract class SMinstantanea {

                public abstract void enviarMensagem();
                public abstract void receberMensagem();

                //somente os filhos conhecem este metodo

                protected void  validarConectadoInternet() {
                            System.out.println("Validando se está conectado a internet...");
                }
}
