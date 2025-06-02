package padroescomportamentais.chainofresponsability;

public class AtendenteJunior extends Atendente {

    public AtendenteJunior(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoSimples.getTipoRequisicaoSimples());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente Júnior";
    }
}
