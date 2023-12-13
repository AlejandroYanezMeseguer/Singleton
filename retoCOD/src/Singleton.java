public class Singleton {

    public Singleton() {
    }

    /**
     * es el numero generado aleatoriamente que tiene que adivinar el usuario
     */
    private int numeroAdivinar;

    /**
     * es el numero que introduce el usuario
     */
    private int numeroIntroducido;

    /**
     * es el numero de intentos maximos
     */
    private int intentosMax;

    /**
     * numero de aciertos en una partida
     */
    private int puntuacion;

    /**
     * el alias (nombre) del jugador
     */
    private String alias;

    /**
     * record
     */
    Singleton record = new Singleton();
    record.alias();
    record.puntuacion();

    /**
     * intentos que lleva el usuario
     */
    private int contIntentos;

    /**
     * rondas en cada partida
     */
    private int numeroRondas;

    /**
     * la ronda en la que se encuentra el jugador
     */
    private int rondaActual;

    /**
     * numero de fallos que lleva el jugador
     */
    private int fallos;


    private static Singleton instance = null;

    private Singleton(int numeroAdivinar, int numeroIntroducido, int intentosMax, int puntuacion, String alias, Singleton record, int contIntentos, int numeroRondas, int rondaActual, int fallos) {
        this.numeroAdivinar = numeroAdivinar;
        this.numeroIntroducido = numeroIntroducido;
        this.intentosMax = intentosMax;
        this.puntuacion = puntuacion;
        this.alias = alias;
        this.record = record;
        this.contIntentos = contIntentos;
        this.numeroRondas = numeroRondas;
        this.rondaActual = rondaActual;
        this.fallos = fallos;
    }


    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public void setNumeroAdivinar(int numeroAdivinar) {
        this.numeroAdivinar = numeroAdivinar;
    }

    public int getNumeroIntroducido() {
        return numeroIntroducido;
    }

    public void setNumeroIntroducido(int numeroIntroducido) {
        this.numeroIntroducido = numeroIntroducido;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Singleton getRecord() {
        return record;
    }

    public void setRecord(Singleton record) {
        this.record = record;
    }

    public int getContIntentos() {
        return contIntentos;
    }

    public void setContIntentos(int contIntentos) {
        this.contIntentos = contIntentos;
    }

    public int getNumeroRondas() {
        return numeroRondas;
    }

    public void setNumeroRondas(int numeroRondas) {
        this.numeroRondas = numeroRondas;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
