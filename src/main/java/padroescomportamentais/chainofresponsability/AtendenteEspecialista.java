package padroescomportamentais.chainofresponsability;

public class AtendenteEspecialista extends Atendente {

    public AtendenteEspecialista(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoEspecial.getTipoRequisicaoEspecial());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente Especialista";
    }
}
