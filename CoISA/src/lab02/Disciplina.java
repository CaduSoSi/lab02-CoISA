package lab02;

public class Disciplina {
    String nomeDisciplina;
    int horasEstudo;
    Double[] nota = new Double[4];

    public Disciplina(String nomeDisciplina){
        this.nota[0] = 0.0;
        this.nota[1] = 0.0;
        this.nota[2] = 0.0;
        this.nota[3] = 0.0;
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;

    }
    public double calcularMedia(){
        double media = 0;
        for (double nota : nota) {
            media += nota;
        }
        return media/ nota.length;
    }
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valor) {
        this.nota[nota-1] = valor;

    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
    @Override
    public String toString(){
        return this.nomeDisciplina + " " +  this.horasEstudo + " " + calcularMedia() + " " + "[" + nota[0] + " " + nota[1] + " "+ nota[2] + " " + nota[3] + "]";
    }


}
