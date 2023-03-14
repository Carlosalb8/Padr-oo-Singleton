public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String funcionarioLogado;

    public String getNomeEscola() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setFuncionarioLogado(String funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }
}