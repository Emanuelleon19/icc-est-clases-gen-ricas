import java.util.ArrayList;

public class MiLista<T> {
    private ArrayList<T> elementos;

    public MiLista() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    public void mostrar() {
        System.out.println(elementos);
    }
}
