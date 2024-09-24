public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        //1º valida se tem conexão com internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        
        //salva histórico de mensagem
        salvarHistoricoMensagem();
    
        }
        public void receberMensagem() {
            System.out.println("Recebendo mensagem");
        }

        //métodos privados, visíveis somente na classe
        private void validarConectadoInternet() {
            System.out.println("Validando se está conectado à internet");
        }

        private void salvarHistoricoMensagem() {
            System.out.println("Validando se está conectado à internet");
        }
    }

