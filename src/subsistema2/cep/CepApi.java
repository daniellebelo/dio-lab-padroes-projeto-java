package subsistema2.cep;

import gof.SingletonEager;

public class CepApi {
    private static subsistema2.cep.CepApi instancia = new subsistema2.cep.CepApi();

    private CepApi () {
        super();
    }
    public static subsistema2.cep.CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}