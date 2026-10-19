public class Main {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Ana Gómez", 20, "12345678", "Ingeniería de Sistemas", 4.5);
        Profesor prof = new Profesor("Carlos Pérez", 45, "87654321", "Matemáticas", 2000000, 10);

        System.out.println("--- Información del Estudiante ---");
        est.mostrarInfo();
        System.out.println("Rol: " + est.getRol());

        System.out.println("\n--- Información del Profesor ---");
        prof.mostrarInfo();
        System.out.println("Rol: " + prof.getRol());
    }
}
