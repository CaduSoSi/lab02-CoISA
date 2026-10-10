package br.edu.ufcg.computacao.p2lp2.coisa;
/**
 * Representação de uma ferramenta de controle de uma disciplina cursada pelo estudante.
 * Permite cadastrar notas, horas de estudo daquela disciplina, calcular a média e verificar aprovação.
 *
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Carlos Eduardo Souto Silva - 20260016467
 */
public class Disciplina {
    /**
    * Variável que guarda o nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Variável que registra as horas de estudo.
     */
    private int horasEstudo;
    /**
     * Vetor de notas da disciplina.
     */
    private Double[] notas;
    /**
     * Vetor com os pesos referentes a cada nota.
     */
    private int[] pesos;
    /**
     * Construtor padrão, para disciplinas convencionais com 4 notas. Define
     * o nome da disciplina, todas as 4 notas para 0 e cada um dos pesos das notas
     * para 1, além de definir horas de estudo como 0.
     * @param nomeDisciplina nome da disciplina cursada.
     */
    public Disciplina(String nomeDisciplina){
        notas = new Double[] {0.0, 0.0, 0.0, 0.0};
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = new int[] {1,1,1,1};
    }
    /**
     * Construtor para disciplina com número de notas flexível e com todos os pesos definidos.
     * Define todas as notas como 0, o vetor de pesos como o vetor informado, horas de estudo como
     * 0 e o nome da disciplina que foi informado.
     * @param nomeDisciplina o nome da disciplina cursada.
     * @param notas a quantidade de notas da disciplina.
     * @param pesos os respectivos pesos de cada nota.
     */
    public Disciplina(String nomeDisciplina, int notas, int[] pesos){
        this.notas = new Double[notas];
        for (int i = 0; i < notas; i++) {
            this.notas[i] = 0.0;
        }
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = pesos;
    }
    /**
     * Construtor para disciplina com número de notas flexível e com todos os pesos não definidos.
     * Define todas as notas como 0, o vetor de pesos como 1 para cada nota, horas de estudo como
     * 0 e o nome da disciplina que foi informado.
     * @param nomeDisciplina o nome da disciplina cursada.
     * @param notas a quantidade de notas da disciplina.
     */
    public Disciplina(String nomeDisciplina, int notas){
        this.notas = new Double[notas];
        for (int i = 0; i < notas; i++) {
            this.notas[i] = 0.0;
        }
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = new int[notas];
        for (int i = 0; i < notas; i++){
            this.pesos[i] = 1;
        }
    }
    /**
     * Calcula e retorna a média do aluno. Passa por cada nota e multiplicando-a por seu respectivo peso,
     * que é também somado ao denominador para a divisão ao final.
     *
     * @return o total das notas dividida pela soma de todos os pesos, ou seja, a média.
     */
    public double calcularMedia(){
        double media = 0;
        int denominador = 0;
        for (int i = 0; i<notas.length; i ++) {
            media += (notas[i] * pesos[i]);
            denominador += pesos[i];
        }
        return media/ denominador;
    }
    /**
     * Soma ao total de horas estudadas naquela disciplina o novo valor de horas estudadas.
     *
     * @param horas a quantidade de horas estudada.
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    /**
     * Define uma nota naquela disciplina.
     * @param nota qual das notas vai ser atribuída, ou seja, a posição no vetor de notas a ser modificado.
     * @param valor o real valor daquela nota do aluno na disciplina.
     */
    public void cadastraNota(int nota, double valor) {
        this.notas[nota-1] = valor;

    }
    /**
     * Retorna a situação do aluno na disciplina, se está aprovado ou não.
     *
     * @return a comparação entre a média do aluno, se é maior ou igual a 7, true se estiver aprovado, false se não.
     */
    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
    /**
     * Retorna as informações referentes aquela disciplina,
     * nome, horas de estudo, média do aluno e o vetor de notas.
     *
     * @return as informações da disciplina cursada.
     */
    @Override
    public String toString() {
        String retorno = this.nomeDisciplina + " " +
                this.horasEstudo + " " +
                calcularMedia() + " [";

        for (int i = 0; i < notas.length; i++) {
            if (i > 0) {
                retorno += " ";
            }
            retorno += notas[i];
        }

        return retorno + "]";
    }
}
