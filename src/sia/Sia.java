/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sia;

public class Sia {
    // Variables de clase
    public static int nextId = 1;
    public static String schoolName = "Universidad de Ejemplo";

    // Variables de objeto
    public String firstName;
    public String lastName;
    public int id;
    public String program;
    public double tuitionFees;

    // Constructor
    public Sia(String firstName, String lastName, String program, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = nextId++;
        this.program = program;
        this.tuitionFees = tuitionFees;
    }

    // Método para mostrar el registro de estudiante
    public void showStudentRecord() {
        System.out.println("Registro de estudiante:");
        System.out.println("Nombre: " + firstName + " " + lastName);
        System.out.println("ID: " + id);
        System.out.println("Programa: " + program);
        System.out.println("Cuota de matrícula: " + tuitionFees);
        System.out.println("Escuela: " + schoolName);
    }

    // Prueba de la clase Student
    public static void main(String[] args) {
        // Declaración de variables y creación de objetos
        String firstName1 = "Juan";
        String lastName1 = "Pérez";
        String program1 = "Ingeniería de Software";
        double tuitionFees1 = 25000;

        String firstName2 = "María";
        String lastName2 = "García";
        String program2 = "Ciencias de la Computación";
        double tuitionFees2 = 22000;

        // Creación de objetos Student
        Sia student1 = new Sia(firstName1, lastName1, program1, tuitionFees1);
        Sia student2 = new Sia(firstName2, lastName2, program2, tuitionFees2);

        // Mostrar el registro de estudiantes
        student1.showStudentRecord();
        student2.showStudentRecord();
    }
}