public class Profesor extends Persona {
    private String area;
    private double salarioBase;
    private int horasCatedra;

    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        // Lógica de ejemplo para calcular salario basado en horas cátedra
        return salarioBase + (horasCatedra * 50000); 
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Horas Cátedra: " + horasCatedra);
        System.out.println("Salario Total: " + calcularSalario());
    }

    @Override
    public String getRol() {
        return "Profesor";
    }
}