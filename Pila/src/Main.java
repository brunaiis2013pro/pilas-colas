public class Main {
    public static void main(String[] args){
        Pila cola = new Pila();


        System.out.println(cola.estaVacia());
        System.out.println();

        //Rellenamos de elementos nuestra cola
        for (int i = 1; i <=20 ; i+=2) {
            cola.insertar(i);
        }

        System.out.print("Numeros Impares: ");
        cola.mostrar();

        System.out.println();
        System.out.print("Eliminando los 5 ultimos numeros impares: ");
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
    }
}

