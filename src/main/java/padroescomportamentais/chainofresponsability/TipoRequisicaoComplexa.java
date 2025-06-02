package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoComplexa implements TipoRequisicao {

    private static TipoRequisicaoComplexa tipoRequisicaoComplexa = new TipoRequisicaoComplexa();

    private TipoRequisicaoComplexa() {}

    public static TipoRequisicaoComplexa getTipoRequisicaoComplexa() {
        return tipoRequisicaoComplexa;
    }
}
