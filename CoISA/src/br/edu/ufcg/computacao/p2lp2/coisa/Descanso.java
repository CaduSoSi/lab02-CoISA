package br.edu.ufcg.computacao.p2lp2.coisa;
/**
 * Representação da ferramenta de controle de descanso.
 * A classe consiste num contador de horas de descanso e semanas descansadas.
 * Esses contadores podem ser atualizados.
 * A classe tem um método que calcula a relação entre as horas de descanso e o número de semanas consideradas.
 * (26 horas por semana).
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Carlos Eduardo Souto Silva - 20260016467
 */

public class Descanso{
    /**
     * Horas descansadas pelo estudante.
     */
    private int horasdescansadas;
    /**
     * Semanas descansadas pelo estudante.
     */
    private int semanasdescansadas;

    /**
     * Constrói uma ferramenta de descanso.
     * Toda ferramenta começa com horas e semanas zeradas.
     */

    public Descanso(){
        this.horasdescansadas = 0;
        this.semanasdescansadas = 0;
    }
    /**
     * Define o atributo de horas descansadas como o parametro informado.
     *
     * @param horasdescansadas quantas horas o aluno descansou ao todo.
     */
    public void defineHorasDescanso(int horasdescansadas) {
        this.horasdescansadas = horasdescansadas;
    }
    /**
     * Define o atributo de semanas descansadas como o parametro informado.
     *
     * @param semanasdescansadas quantas semanas o aluno descansou ao todo.
     */
    public void defineNumeroSemanas(int semanasdescansadas) {
        this.semanasdescansadas = semanasdescansadas;
    }
    /**
     * Retorna o status de descanso do estudante,
     * descansado caso ele tenha pelo menos 26 horas para cada semana
     * ou cansado caso a condição não seja satisfeita.
     *
     * @return o status de descanso do estudante.
     */

    public String getStatusGeral(){
            if ((semanasdescansadas > 0) && (horasdescansadas / semanasdescansadas >= 26)) {
                return "descansado";
            } else {
                return "cansado";
            }
        }
}