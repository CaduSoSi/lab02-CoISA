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
}
