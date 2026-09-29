public class Descanso{
    private int horasdescansadas = 0;
    private int semanasdescansadas = 0;

    //métodos gets
    public int getHorasdescansadas() {
        return horasdescansadas;
    }
    public int getSemanasdescansadas() {
        return semanasdescansadas;
    }
    //métodos sets
    public void defineHorasdescansadas(int horasdescansadas) {
        this.horasdescansadas = horasdescansadas;
    }

    public void setSemanasdescansadas(int semanasdescansadas) {
        this.semanasdescansadas = semanasdescansadas;
    }
}