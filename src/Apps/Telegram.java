package Apps;

public class Telegram extends SMinstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegram...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem no telegram...");
    }

                
}
