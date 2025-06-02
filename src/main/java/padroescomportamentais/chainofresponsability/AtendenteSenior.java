package padroescomportamentais.chainofresponsability;

public class AtendenteSenior extends Atendente {

    public AtendenteSenior(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoComplexa.getTipoRequisicaoComplexa());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente Sênior";
    }
}
