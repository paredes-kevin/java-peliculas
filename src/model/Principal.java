package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    List<Movie> movies = new ArrayList<>();
    List<Serie> series = new ArrayList<>();

    Serie serie = new Serie();
    Movie movie = new Movie();

    public void showsMenu(){

        int option = 0;
        Scanner sc = new Scanner(System.in);
        while (option != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Registrar nueva película
                    2) Registrar nueva serie
                    3) Calculadora de tiempo


                    9) Salir
                    """;
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();


            switch (option){
                case 1:
                    System.out.println("Ingrese el nombre de la película: ");
                    String name = sc.nextLine();
                    System.out.println("Ingrese el año de lanzamiento: ");
                    int launchDate  = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película: ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    movie.setName(name);
                    movie.setLaunchDate(launchDate);
                    movie.setDurationTimeInMinutes(duration);
                    movies.add(movie);
                    movie.sampleTechnicalSheet();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie: ");
                    String nameSerie = sc.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int launchDateSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Por favor ingresa el número de temporadas para esta serie");
                    int season = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Por favor ingrese la cantidad de episodios por cada temporada");
                    int episodePerSeason = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutePerEpisode = sc.nextInt();
                    sc.nextLine();

                    serie.setName(nameSerie);
                    serie.setLaunchDate(launchDateSerie);
                    serie.setSeason(season);
                    serie.setEpisodesPerSeason(episodePerSeason);
                    serie.setDurationInMinutesPerEpisode(minutePerEpisode);
                    series.add(serie);
                    serie.sampleTechnicalSheet();
                    break;
                case 3:
                    int totalTime = 0;
                    for (Movie movie : movies) {
                        totalTime += movie.getDurationTimeInMinutes();
                    }
                    for (Serie serie : series) {
                        totalTime += serie.getDurationInMinutesPerEpisode() * serie.getSeason() * serie.getEpisodesPerSeason();
                    }
                    System.out.println("Tiempo que necesitas para maratonar tus títulos favoritos: " + totalTime + " minutos");
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
