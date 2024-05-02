import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        String nombre;
        int fechaDeLanzamiento, duracionEnMinutos, temporadas, episodiosPorTemporada, duracionEnMinutosPorEpisodio;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 4){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    
                    4) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la película");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento");
                    fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingres el numero de temporadas");
                    temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de episodios por temporada");
                    episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos por episodio");
                    duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombre);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }


        }
    }
}