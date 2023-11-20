package Aprendiendo;

/**
 *
 * @author JoePino
 */
public class Appmusica {
//atributos
    private String titulo, autor, favorita, descargada;
    private int duracion;
//constructor
    public Appmusica(String titulo, String autor, String favorita, String descargada, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.favorita = favorita;
        this.descargada = descargada;
        this.duracion = duracion;
    }
    //getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFavorita() {
        return favorita;
    }

    public String getDescargada() {
        return descargada;
    }

    public int getDuracion() {
        return duracion;
    }
    //setter

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFavorita(String favorita) {
        this.favorita = favorita;
    }

    public void setDescargada(String descargada) {
        this.descargada = descargada;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //CUSTOMERS
        //retornoduracion
    public void difDuracion(){
        if (duracion>=500) {
            System.out.println("la duracion es larga.");
        
            
        }
        else{
            System.out.println("la duracion es corta.");
        }
    }
        //adelantar cancion
    public void adelantarCancion(int segundosAdelantar){
    int tiempoActual=getDuracion();
        System.out.println("LA CANCION ESTA EN EL MINUTO:"+tiempoActual);
    tiempoActual=tiempoActual+segundosAdelantar;
        System.out.println("LA CANCION QUEDO EN EL MINUTO: "+tiempoActual);
    }
        //mostrar canciones
    public void mostrarcanciones(){
        System.out.println("titulo: "+getTitulo());
        System.out.println("artista: "+getAutor());
        System.out.println("favorito: "+getFavorita());
        System.out.println("descargada: "+getDescargada());
        System.out.println("duracion: "+getDuracion());
    }
    
    
    //MAIN
    public static void main(String[] args) {
        Appmusica appmusica1 = new Appmusica("chupano","pepe","si","no",90);
        appmusica1.mostrarcanciones();
        appmusica1.difDuracion();
        appmusica1.adelantarCancion(10);
        
        System.out.println("--------------");
        Appmusica appmusica2 = new Appmusica("daffd","fulani","no","si",620);
        appmusica2.mostrarcanciones();
        appmusica2.difDuracion();
        appmusica2.adelantarCancion(30);
    }
    
}