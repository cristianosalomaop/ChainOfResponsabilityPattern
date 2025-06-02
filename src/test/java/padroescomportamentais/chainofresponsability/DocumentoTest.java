package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequisicaoTest {

    AtendenteEspecialista especialista;
    AtendenteSenior senior;
    AtendentePleno pleno;
    AtendenteJunior junior;

    @BeforeEach
    void setUp() {
        especialista = new AtendenteEspecialista(null);
        senior = new AtendenteSenior(especialista);
        pleno = new AtendentePleno(senior);
        junior = new AtendenteJunior(pleno);
    }

    @Test
    void deveRetornarAtendenteJuniorParaRequisicaoSimples() {
        assertEquals("Atendente Júnior", junior.resolverRequisicao(new Requisicao(TipoRequisicaoSimples.getTipoRequisicaoSimples())));
    }

    @Test
    void deveRetornarAtendentePlenoParaRequisicaoIntermediaria() {
        assertEquals("Atendente Pleno", junior.resolverRequisicao(new Requisicao(TipoRequisicaoIntermediaria.getTipoRequisicaoIntermediaria())));
    }

    @Test
    void deveRetornarAtendenteSeniorParaRequisicaoComplexa() {
        assertEquals("Atendente Sênior", junior.resolverRequisicao(new Requisicao(TipoRequisicaoComplexa.getTipoRequisicaoComplexa())));
    }

    @Test
    void deveRetornarAtendenteEspecialistaParaRequisicaoEspecial() {
        assertEquals("Atendente Especialista", junior.resolverRequisicao(new Requisicao(TipoRequisicaoEspecial.getTipoRequisicaoEspecial())));
    }

    @Test
    void deveRetornarSemAtendimentoParaRequisicaoNaoCadastrada() {
        assertEquals("Sem atendimento", junior.resolverRequisicao(new Requisicao(new TipoRequisicao() {})));
    }
}
