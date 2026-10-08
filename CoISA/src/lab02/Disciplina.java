package lab02;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private Double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina){
        notas = new Double[] {0.0, 0.0, 0.0, 0.0};
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = new int[] {1,1,1,1};

    }
    public Disciplina(String nomeDisciplina, int notas, int[] pesos){
        this.notas = new Double[notas];
        for (int i = 0; i < notas; i++) {
            this.notas[i] = 0.0;
        }
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.pesos = pesos;
    }
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

    public double calcularMedia(){
        double media = 0;
        int denominador = 0;
        for (int i = 0; i<notas.length; i ++) {
            media += (notas[i] * pesos[i]);
            denominador += pesos[i];
        }
        return media/ denominador;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valor) {
        this.notas[nota-1] = valor;

    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
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
