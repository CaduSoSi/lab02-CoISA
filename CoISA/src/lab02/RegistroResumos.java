package lab02;

public class RegistroResumos {
    private int limite;
    private String[] tema;
    private String[] conteudo;
    private int iterador = 0;

    public RegistroResumos(int limite){
        this.tema = new String[limite];
        this.conteudo = new String[limite];
        this.limite = limite;

    }

    public void adiciona(String tema, String conteudo) {
        if (iterador == limite) {
            iterador = 0;
        }
        boolean procede = false;
        for (int i = 0; i < this.tema.length; i++){
            if (this.tema[i] != null && this.tema[i].equals(tema)) {
                procede = true;
            }
        }
        if (!procede){
            this.tema[iterador] = tema;
            this.conteudo[iterador] = conteudo;
            iterador += 1;
        }
    }

    public String[] pegaResumos() {
        String[] retorno;
        int count = 0;
        for (int i = 0; i<this.limite; i++){
            if (this.tema[i] != null){
                count += 1;
            } else {
                break;
            }
        }
        retorno = new String[count];
        for (int i = 0; i<count; i++){
            retorno[i] = this.tema[i] + ": " + this.conteudo[i];
        }
        return retorno;
    }

    public int conta() {
        int count = 0;
        for (int i = 0; i < this.limite; i++) {
            if (this.tema[i] != null) {
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
            if (this.tema[i].equals(tema)) {
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
            retorno += tema[i] + " ";
        }
        return retorno;
    }
}
