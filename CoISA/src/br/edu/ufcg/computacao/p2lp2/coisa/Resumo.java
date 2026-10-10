package br.edu.ufcg.computacao.p2lp2.coisa;
/**
 * Representação de um resumo. Cada resumo contém tema e conteúdo.
 * Os conteúdos e os temas podem ser acessados.
 *
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Carlos Eduardo Souto Silva - 20260016467
 */
public class Resumo {
    /**
     * Tema do resumo.
     */
    private String tema;
    /**
     * Conteúdo do resumo.
     */
    private String conteudo;
    /**
     * Constrói um resumo com o tema e conteúdo passados.
     * @param tema o tema do resumo.
     * @param conteudo o conteúdo do resumo.
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }
    /**
     * Retorna o tema do resumo.
     * @return o tema do resumo.
     */
    public String getTema() {
        return tema;
    }
    /**
     * Retorna o conteúdo do resumo.
     * @return o conteúdo do resumo.
     */
    public String getConteudo() {
        return conteudo;
    }
}
