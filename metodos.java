import java.util.Scanner;
import java.util.Stack;

public class metodos{

     public int ValidarEentero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un número");
            sc.next();
        }
        return sc.nextInt();
    }

    public Stack<ObjLibro> RegistrarLibro(Scanner sc, Stack<ObjLibro> libro) {
        
        boolean continuar = true;

        while (continuar) {
        ObjLibro o = new ObjLibro();
        System.out.println("Ingrese el ISBN del libro");
        o.setIsbn(ValidarEentero(sc));
        System.out.println("Ingrese el título del libro");
        o.setTitulo(sc.next());
        System.out.println("Ingrese el autor del libro");
        o.setAutor(sc.next());
        System.out.println("Ingrese el año de publicación del libro");
        o.setAnioPublicacion(sc.next());
        libro.push(o);
        System.out.println("Desea registar otro libro 1)Si 2)No");
        int opt = ValidarEentero(sc);
        if (opt == 2) {
            continuar = false;
        }
        }
        return libro;
    }

    public Stack<ObjLibro> RetirarUltimoLibro(Stack<ObjLibro> libro) {
        if (!libro.isEmpty()) {
            libro.pop();
            System.out.println("Se ha retirado el último libro registrado: ");
        } else {
            System.out.println("No hay libros registrados para retirar.");
        }
        return libro;
    }

    public void ConsultarUltimoLibro(Stack<ObjLibro> libro) {
        if (!libro.isEmpty()) {
            ObjLibro ultimoLibro = libro.peek();
            System.out.println("Último libro registrado:");
            System.out.println("ISBN: " + ultimoLibro.getIsbn());
            System.out.println("Título: " + ultimoLibro.getTitulo());
            System.out.println("Autor: " + ultimoLibro.getAutor());
            System.out.println("Año de publicación: " + ultimoLibro.getAnioPublicacion());
        } else {
            System.out.println("No hay libros registrados para consultar.");
        }
    }

    public void MostrarTodosLosLibros(Stack<ObjLibro> libro) {
        if (!libro.isEmpty()) {
            for (ObjLibro l : libro) {
                System.out.println("ISBN: " + l.getIsbn());
                System.out.println("Título: " + l.getTitulo());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Año de publicación: " + l.getAnioPublicacion());
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("No hay libros registrados para mostrar.");
        }
    }
}