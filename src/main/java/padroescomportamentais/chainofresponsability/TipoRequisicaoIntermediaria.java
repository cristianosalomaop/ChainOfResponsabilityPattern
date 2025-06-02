package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoIntermediaria implements TipoRequisicao {

    private static TipoRequisicaoIntermediaria tipoRequisicaoIntermediaria = new TipoRequisicaoIntermediaria();

    private TipoRequisicaoIntermediaria() {}

    public static TipoRequisicaoIntermediaria getTipoRequisicaoIntermediaria() {
        return tipoRequisicaoIntermediaria;
    }
}
