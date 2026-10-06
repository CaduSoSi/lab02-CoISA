public class Disciplina {
    String nomeDisciplina;
    int horasEstudo;
    Double[] notas = new Double[4];

    public Disciplina(String nomeDisciplina){
        this.notas[0] = 0.0;
        this.notas[1] = 0.0;
        this.notas[2] = 0.0;
        this.notas[3] = 0.0;
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;

    }
    public double calcularMedia(){
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        return media/ notas.length;
    }
    public void cadastraHoras(int horas) {
    }

    public void cadastraNota(int nota, double valor) {
    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
    @Override
    public String toString(){
        return "";
    }


}
