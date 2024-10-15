package Apps;

public class FacebookMSN extends SMinstantanea {
    
                        public void enviarMensagem() {
                            validarConectadoInternet();
                            System.out.println("Enviando mensagem pelo Facebook Messeger");
                        }

                        public void receberMensagem() {
                            System.out.println("Recebendo mensagem pelo facebook Messeger");
                        }

}
