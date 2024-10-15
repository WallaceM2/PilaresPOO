package UML_MSN;

import Apps.FacebookMSN;
import Apps.MSNMessenger;
import Apps.SMinstantanea;
import Apps.Telegram;

public class ComputadorWallace {
    public static void main(String[] args) {


             SMinstantanea smi = null;
                /*
                 * NAO SE SABE QUAL APP
                 *  MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM;
                 */
                String appEscolhido = "msn";

                    if (appEscolhido.equals("Msn")) 
                            smi = new MSNMessenger();
                    else if (appEscolhido.equals("FBM"))
                        smi = new FacebookMSN();
                    else if(appEscolhido.equals("Tlg"))
                        smi = new Telegram();

                        smi.enviarMensagem();
                        smi.receberMensagem();

        
                        /*System.out.println("MSN");
                    MSNMessenger msn = new MSNMessenger();
                    msn.enviarMensagem();
                    msn.receberMensagem();

                        System.out.println("FACEBOOK");
                    FacebookMSN fcb = new FacebookMSN();
                    fcb.enviarMensagem();
                    fcb.receberMensagem();

                        System.out.println("TELEGRAM");
                    Telegram tlg = new Telegram();
                    tlg.enviarMensagem();
                    tlg.receberMensagem();*/

    }
}
