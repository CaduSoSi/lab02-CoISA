package lab02;
import java.util.Arrays;

public class RegistroResumos {
    private int limite;
    private Resumo[] resumos;
    private int iterador;

    public RegistroResumos(int limite){
        this.resumos = new Resumo[limite];
        this.limite = limite;
        this.iterador = 0;

    }

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

    public boolean temResumo(String tema) {
        boolean tem = false;
        for (int i = 0; i < this.limite; i++) {
            if (this.resumos[i].getTema().equals(tema)) {
                tem = true;
            } else {
                break;
            }
        }
        return tem;
    }

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
    public String[] busca(String chaveDeBusca){
        chaveDeBusca = chaveDeBusca.toLowerCase();
        for (int i = 0; i < this.conta(); i++){
            if resumos[i].contains();

        }
    }

}
