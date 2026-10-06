package lab02;

//definição método lab02.Descanso
public class Descanso{
    private int horasdescansadas;
    private int semanasdescansadas;

    //Construtor
    public Descanso(){
        this.horasdescansadas = 0;
        this.semanasdescansadas = 0;
    }

    //métodos sets
    public void defineHorasDescanso(int horasdescansadas) {
        this.horasdescansadas = horasdescansadas;
    }
    public void defineNumeroSemanas(int semanasdescansadas) {
        this.semanasdescansadas = semanasdescansadas;
    }

    //metodo de verificar status
    public String getStatusGeral(){
            if ((semanasdescansadas > 0) && (horasdescansadas / semanasdescansadas >= 26)) {
                return "descansado";
            } else {
                return "cansado";
            }
        }
}