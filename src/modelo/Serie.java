package modelo;

public class Serie  extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public void muestraFichaTecnica() {
        System.out.println("\n**** Ficha Técnica ****");
        System.out.println("Titulo: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
        System.out.println("Duración por episodio: " + getDuracionEnMinutosPorEpisodio() + " minutos");
        System.out.println("Tiempo total de la serie: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }

    public void calcularTiempoADedicar(int horasPorDia){
        double diasViendoParaTerminarLaSerie = (getTiempoDeDuracionEnMinutos() / 60) / horasPorDia;
        System.out.println("\n**** Calculadora ****");
        System.out.println("Viendo " + horasPorDia + " horas por dia de la serie " + getNombre() + " tardarias " + diasViendoParaTerminarLaSerie + " días en ver toda la serie.");
    }

}