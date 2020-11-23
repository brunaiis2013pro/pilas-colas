public class Cola {
    Nodo primero;

    public Cola(){
        primero = null;
    }

    public boolean estaVacia(){
        return primero == null;
    }

    public void insertar(Object dato){
        if(estaVacia()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        }else{
            Nodo ultimo = primero;
            while(ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }

            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }

    public void eliminar(){
        if(!estaVacia()){
            primero = primero.getSiguiente();
        }
    }

    public void mostrar(){
        Nodo tmp = primero;
        while (tmp != null){
            System.out.print(tmp.getDato() + "   ");
            tmp = tmp.getSiguiente();
        }

    }
}
