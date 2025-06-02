package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoEspecial implements TipoRequisicao {

    private static TipoRequisicaoEspecial tipoRequisicaoEspecial = new TipoRequisicaoEspecial();

    private TipoRequisicaoEspecial() {}

    public static TipoRequisicaoEspecial getTipoRequisicaoEspecial() {
        return tipoRequisicaoEspecial;
    }
}
