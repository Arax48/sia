/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Sia {
    // Variables de clase
    public static String correoadministrativo;
    public static double papa_inicial = 5.0 ;
    public static String nombreUniversidad = "Universidad Nacional de Colombia";

    // Variables de objeto
    public String nombre;
    public String programaCurricular;
    public String asignaturasInscritas;
    public double puntajeMatricula;
    public double valorMatricula;

    // Constructor
    public Sia(String nombre, String programaCurricular, String asignaturasInscritas, double puntajeMatricula, double valorMatricula) {
        this.nombre = nombre;
        this.programaCurricular = programaCurricular;
        this.asignaturasInscritas = asignaturasInscritas;
        this.puntajeMatricula = puntajeMatricula;
        this.valorMatricula = valorMatricula;
    }

    // Método para mostrar el registro de estudiante
    public void mostrarRegistro() {
        System.out.println("\nRegistro de estudiante:");

        System.out.println(nombreUniversidad);

        System.out.println("Nombre: " + nombre);
        System.out.println("Programa Curricular: " + programaCurricular);
        System.out.println("Asignaturas inscritas: " + asignaturasInscritas);
        System.out.println("Puntaje de matrícula: " + puntajeMatricula );
        System.out.println("Cuota de matrícula: " + valorMatricula );
        
    }

    // Prueba de la clase Student
    public static void main(String[] args) {
        // Declaración de variables y creación de objetos
        String nombre1 = "Alejandro Rodríguez";
        String programa1 = "Ingeniería de Sistemas";
        String asignaturasInscritas1 = "POO, Cálculo, Álgebra, Física"; 
        double puntajeMatricula1 = 35.6;
        double valorMatricula1 = 2_500_000;

        String nombre2 = "Maria Alfaro";
        String programa2 = "Artes";
        String asignaturasInscritas2 = "Dibujo, Animación, Perspectiva, Anatomía"; 
        double puntajeMatricula2 = 82.4;
        double valorMatricula2 = 9_100_000.65;

        // Creación de objetos 
        Sia estudiante1 = new Sia(nombre1, programa1, asignaturasInscritas1, puntajeMatricula1, valorMatricula1);
        Sia estudiante2 = new Sia(nombre2, programa2, asignaturasInscritas2, puntajeMatricula2, valorMatricula2);

        // Mostrar el registro de estudiantes
        estudiante1.mostrarRegistro();
        estudiante2.mostrarRegistro();
    }
}
