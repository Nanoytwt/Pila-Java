public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        System.out.println("Contenido de la pila:");
        pila.vercontenido();

        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Contenido de la pila después de desapilar:");
        pila.vercontenido();
    }
}
