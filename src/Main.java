public class Main {
    public static void main(String[] args) {
        Servidor servidor1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor servidor2 = new Servidor("BaseDeDatos", "192.168.1.21");
        Servidor servidor3 = new Servidor("Backup", "192.168.1.22");

        servidor1.mostrarInformacion();
        
        servidor1.activar();
        servidor1.activar();
        servidor2.activar();

        System.out.println("Total de servidores registrados: " + Servidor.getTotalServidores());
        System.out.println("Servidores actualmente activos: " + Servidor.getServidoresActivos());

        servidor1.desactivar();
        System.out.println("Servidores activos despues de apagar uno: " + Servidor.getServidoresActivos());
    }
}