public class Main {
    public static void main(String[] args){
        Cola cola = new Cola();


        System.out.println(cola.estaVacia());
        System.out.println();

        //Rellenamos de elementos nuestra cola
        for (int i = 2; i <=30 ; i+=2) {
            cola.insertar(i);
        }

        System.out.print("Numeros Pares: ");
        cola.mostrar();

        System.out.println();
        System.out.print("Eliminando los 5 primeros numeros pares: ");
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
    }
}
