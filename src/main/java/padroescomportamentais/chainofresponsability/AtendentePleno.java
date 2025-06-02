package padroescomportamentais.chainofresponsability;

public class AtendentePleno extends Atendente {

    public AtendentePleno(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoIntermediaria.getTipoRequisicaoIntermediaria());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente Pleno";
    }
}
