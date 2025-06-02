package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoSimples implements TipoRequisicao {

    private static TipoRequisicaoSimples tipoRequisicaoSimples = new TipoRequisicaoSimples();

    private TipoRequisicaoSimples() {}

    public static TipoRequisicaoSimples getTipoRequisicaoSimples() {
        return tipoRequisicaoSimples;
    }
}
