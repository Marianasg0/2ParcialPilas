import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Stack<ObjLibro> libro = new Stack<>();
        metodos m = new metodos();
        ObjLibro o = new ObjLibro();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("Seleccione una opción:");
            System.out.println("1) Registrar libro");
            System.out.println("2) Retirar ultimo libro registrado");
            System.out.println("3) Consultar ultimo libro registrado");
            System.out.println("4) Mostrar todos los libros registrados");
            System.out.println("5) Salir");

            int opt = m.ValidarEentero(sc); // Limpiar el buffer

            switch (opt) {
                case 1:
                    libro = m.RegistrarLibro(sc, libro);
                    break;

                case 2:
                   libro= m.RetirarUltimoLibro(libro);
                    break;

                case 3:
                   m.ConsultarUltimoLibro(libro);
                    break;
                
                case 4:
                    m.MostrarTodosLosLibros(libro);
                    break;

                case 5:
                     System.out.println("Gracias por visitarnos.");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("No existe esa opcion");
            }
        }
    }
}
