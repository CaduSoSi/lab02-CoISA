public class RegistroTempoOnline {
    String nomeDisciplina;
    int tempoOnlineEsperado;
    int tempoInvestido;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoInvestido = 0;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoInvestido = 0;
    }
    public void adicionaTempoOnline(int tempo_dado) {
        tempoInvestido = tempoInvestido + tempo_dado;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoInvestido >= tempoOnlineEsperado;
    }
    @Override
    public String toString(){
        return nomeDisciplina + " " + tempoInvestido + "/" + tempoOnlineEsperado;
    }
}
