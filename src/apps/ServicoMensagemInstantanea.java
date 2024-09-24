package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente as classes filhas reconhecem esse método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }
}
       
        