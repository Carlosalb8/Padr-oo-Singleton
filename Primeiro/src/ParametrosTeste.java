import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrosTeste {

    @Test
    public void deveRetornarNomeEmpresa() {
        Parametros.getInstance().setNomeEmpresa("Amazon");
        assertEquals("Amazon", Parametros.getInstance().getNomeEscola());
    }

    @Test
    public void deveRetornarFuncionarioLogado() {
        Parametros.getInstance().setFuncionarioLogado("Funcionario 1");
        assertEquals("Funcionario 1", Parametros.getInstance().getFuncionarioLogado());
    }

}
