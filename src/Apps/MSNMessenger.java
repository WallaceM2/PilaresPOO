package Apps;

/*
 * Capsular e somente esconder, os metodos eles existirão
 * 
 */

public class MSNMessenger extends SMinstantanea {

                    public void enviarMensagem() {
                        validarConectadoInternet();
                        System.out.println("Enviando mensagem pelo MSN Messeger.");
                    }

                    public void receberMensagem() {
                        System.out.println("Recebendo mensagem pelo MSN Messeger.");
                    }
        
}



