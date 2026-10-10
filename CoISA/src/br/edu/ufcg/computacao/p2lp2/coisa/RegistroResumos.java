package br.edu.ufcg.computacao.p2lp2.coisa;
/**
 * Importação da Classe Array.
 */
import java.util.Arrays;

/**
 * Representação de uma ferramenta de controle para o registro de resumos.
 * Permite adicionar resumos, pegá-los, imprimi-los, contá-los, verificar se existem
 * resumos de determinados temas e buscar por resumos através de palavras-chave.
 *
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Carlos Eduardo Souto Silva - 20260016467
 */
public class RegistroResumos {
    /**
     * Limite máximo de resumos.
     */
    private int limite;
    /**
     * Vetor que guarda os resumos.
     */
    private Resumo[] resumos;
    /**
     * Variável utilizada para escrever os resumos nos locais certos do vetor.
     */
    private int iterador;
    /**
     * Constrói um registo de resumos, definindo o vetor como um vetor vazio de tamanho informado por limite.
     * Define o iterador como 0, a primeira posição do vetor a receber um resumo.
     * @param limite o limite de quantos resumos podem ser guardados.
     */
    public RegistroResumos(int limite){
        this.resumos = new Resumo[limite];
        this.limite = limite;
        this.iterador = 0;
    }
    /**
     * Adiciona um novo resumo ao vetor. Primeiro verifica se o vetor já está cheio, nesse caso, começa
     * a sobrescrever a partir do primeiro. Caso contrário, procura por outro resumo com o mesmo tema, e caso
     * não o ache, adiciona na próxima posição um novo resumo com o tema e conteudo dados. No final adiciona mais
     * 1 ao iterador, representando a posição para o próximo resumo.
     * @param tema o tema do novo resumo.
     * @param conteudo o conteudo respectivo ao tema.
     */
    public void adiciona(String tema, String conteudo) {
        if (iterador == limite) {
            iterador = 0;
        }
        boolean procede = false;
        for (int i = 0; i < this.resumos.length; i++){
            if (this.resumos[i] != null && this.resumos[i].getTema().equals(tema)) {
                procede = true;
            }
        }
        if (!procede){
            this.resumos[iterador] = new Resumo(tema, conteudo);
            iterador += 1;
        }
    }
    /**
     * Passa de resumo em resumo, os adicionando ao retorno.
     * @return Vetor com todos os resumos já registrados.
     */
    public String[] pegaResumos() {
        String[] retorno;
        int count = 0;
        for (int i = 0; i<this.limite; i++){
            if (this.resumos[i] != null){
                count += 1;
            } else {
                break;
            }
        }
        retorno = new String[count];
        for (int i = 0; i<count; i++){
            retorno[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }
        return retorno;
    }
    /**
     * Passa por todo o vetor de resumos, e a cada resumo cadastrado, adiciona mais um a contagem.
     * @return o número de resumos cadastrados.
     */
    public int conta() {
        int count = 0;
        for (int i = 0; i < this.limite; i++) {
            if (this.resumos[i] != null) {
                count += 1;
            } else {
                break;
            }
        }
        return count;
    }
    /**
     * Passa por todo vetor verificando se existe algum resumo com o tema informado.
     * @param tema o tema a ser buscado.
     * @return se aquele tema está vinculado a algum resumo, true, ou não, false.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.limite; i++) {
            if (this.resumos[i] != null && this.resumos[i].getTema().equals(tema)) {
                return true;
            }
        }

        return false;
    }
    /**
     * Retorna a quantidade de resumos cadastrados e todos os temas.
     * @return a quantidade de resumos cadastrados e os seus temas.
     */
    public String imprimeResumos() {

        int count = this.conta();
        String retorno = "- " + count + " resumo(s) cadastrado(s)" + "\n" + "- ";
        for (int i = 0; i < this.conta(); i++){
            if (i >= 1){
                retorno += "| ";
            }
            retorno += resumos[i].getTema() + " ";
        }
        return retorno;
    }
    /**
     * Passa por todo vetor de resumos buscando a chave de busca no conteúdo do resumo. Caso encontre,
     * adiciona o seu tema ao vetor de retorno. No final o ordena por ordem alfabética.
     * @param chaveDeBusca a palavra ou trecho a ser buscado.
     * @return o vetor com todos os temas cujos conteúdos contém a chave de busca.
     */
    public String[] busca(String chaveDeBusca) {
        chaveDeBusca = chaveDeBusca.toLowerCase();
        int cont = 0;
        for (int i = 0; i < this.conta(); i++) {
            String c = resumos[i].getConteudo().toLowerCase();
            if (c.contains(chaveDeBusca)) {
                cont += 1;
            }

        }
        String[] retorno = new String[cont];
        int itera = 0;
        for (int i = 0; i < this.conta(); i++) {
            String c = resumos[i].getConteudo().toLowerCase();
            if (c.contains(chaveDeBusca)) {
                retorno[itera] = resumos[i].getTema();
                itera++;
            }
        }
        Arrays.sort(retorno);
        return retorno;
    }
}
