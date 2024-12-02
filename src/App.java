public class App {
    public static void main(String[] args) {

        MiLista<Integer> listaEnteros = new MiLista<>();

        listaEnteros.agregar(5);
        listaEnteros.agregar(17);
        listaEnteros.agregar(50);
        listaEnteros.agregar(11);

        System.out.print("Lista de enteros: ");
        listaEnteros.mostrar();

        MiLista<String> listaCadenas = new MiLista<>();
        
        listaCadenas.agregar("Hola");
        listaCadenas.agregar("Mundo");
        listaCadenas.agregar("Bienvenidos");

        System.out.print("Lista de cadenas: ");
        listaCadenas.mostrar();

        System.out.println("Primer elemento de la lista de cadenas: " + listaCadenas.obtener(0));
    }
}

