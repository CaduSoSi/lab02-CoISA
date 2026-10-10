package br.edu.ufcg.computacao.p2lp2.coisa;
/**
 * Representação de uma ferramenta de controle de tempo online estudando para uma disciplina.
 * Permite contabilizar o tempo online estudando e verificar se está de acordo com
 * o tempo mínimo esperado.
 *
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Carlos Eduardo Souto Silva - 20260016467
 */
public class RegistroTempoOnline {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Tempo mínimo esperado.
     */
    private int tempoOnlineEsperado;
    /**
     * Tempo investindo online estudando.
     */
    private int tempoInvestido;

    /**
     * Constrói a ferramenta, definindo o nome da disciplina como o nome informado.
     * Define o tempo esperado para 120 (valor padrão) e o tempo investido para 0.
     * @param nomeDisciplina nome da disciplina a ser estudada.
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoInvestido = 0;
    }
    /**
     * Constrói a ferramenta, definindo o nome da disciplina como o nome informado.
     * Define o tempo esperado para o valor informado e o tempo investido para 0.
     * @param nomeDisciplina nome da disciplina a ser estudada.
     * @param tempoOnlineEsperado tempo mínimo esperado para aquela disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoInvestido = 0;
    }
    /**
     * Adiciona uma nova quantidade de tempo ao tempo investido.
     * @param tempo_dado quantidade de horas estudando.
     */
    public void adicionaTempoOnline(int tempo_dado) {
        tempoInvestido = tempoInvestido + tempo_dado;
    }
    /**
     * Verifica se o tempo investido do estudante é maior ou igual ao tempo mínimo requerido, ou seja,
     * se ele atingiu a meta de tempo online da disciplina.
     * @return se o estudante atingiu a meta, true, caso contrário, false.
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoInvestido >= tempoOnlineEsperado;
    }
    /**
     * Imprime as informações respectivas ao controle de tempo,
     * o nome da disciplina, o tempo investido do estudante e o tempo esperado.
     * @return as informações do controle de tempo online.
     */
    @Override
    public String toString(){
        return nomeDisciplina + " " + tempoInvestido + "/" + tempoOnlineEsperado;
    }
}
