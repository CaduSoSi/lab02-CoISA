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
this.tema[iterador] = tema;
this.conteudo[iterador] = conteudo;


        }
    }

    public String[] pegaResumos() {
    }

    public int conta() {
    }

    public boolean imprimeResumos() {
    }

    public boolean temResumo(String classes) {
    }
}
