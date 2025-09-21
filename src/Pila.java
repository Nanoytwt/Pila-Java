public class Pila {
		class Nodo {
		int info;
		Nodo sig;
		}
		private Nodo raiz;
		public Pila () {
		raiz=null;
		}
		public void apilar(int x) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = x;
		if (raiz==null)
		{
		nuevo.sig = null;
		raiz = nuevo;
		}
		else
		{
		nuevo.sig = raiz;
		raiz = nuevo;
		}
		}
		public int desapilar() {
		    if (raiz == null) {
		        System.out.println("La pila está vacía");
		        return -1; // Devuelve un valor indicando que la pila está vacía
		    } else {
		        int valor = raiz.info; // Guarda el valor del nodo a desapilar
		        raiz = raiz.sig; // Mueve la raíz al siguiente nodo
		        return valor; // Devuelve el valor desapilado
		    }
		}
		public void vercontenido() {
		    if (raiz == null) {
		        System.out.println("La pila está vacía");
		    } else {
		        Nodo aux = raiz;
		        while (aux != null) {
		            System.out.print(aux.info + " -> ");
		            aux = aux.sig;
		        }
		        System.out.println("null"); // Imprime null al final para indicar el final de la pila
		    }
		}
}