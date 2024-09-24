import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUser {
    public static void main(String[] args) {
       ServicoMensagemInstantanea smi = null;
       /*
        Não se sabe qual app será escolhido ainda, porém, todos devem fazer essa função de enviar e receber
        */

       String appEscolhido = "fbm";
       
       if (appEscolhido.equals("msn")) 
       smi = new MSNMessenger();
       else if (appEscolhido.equals("fbm")) 
       smi = new FacebookMessenger();
       else if (appEscolhido.equals("tlg")) 
       smi = new Telegram();

       smi.enviarMensagem();
       smi.receberMensagem();
    }
}
