/**
 *
 * @author Usersone
 */
public class Test {
    public static void main(String []args){
     Lista<Integer> miLista=new Lista<Integer>();
       Lista<Integer> miLista2=new Lista<Integer>();
        System.out.println("_____________________________________________\nAgregar el inicio de la lista");
     miLista.AgregarInicio(1);
     System.out.println(miLista);
      System.out.println("_____________________________________________\nInsertar al final de la lista");
     miLista.InsertarFinal(30);
     System.out.println(miLista);
      System.out.println("_____________________________________________\nAgregar antes de");
     miLista2.AgregarInicio(300);
    miLista.AgregarAntesDE(30);
    miLista.InsertarAntesDe(10, 20);
     System.out.println(miLista);
      System.out.println("_____________________________________________\nInsertaun dato despues de");
     miLista.InsertarDespuesDe(2, 1);
     System.out.println(miLista);
      System.out.println("_____________________________________________\nelimina el primer dato");
     miLista.EliminaPrimero();
     System.out.println(miLista);
      System.out.println("_____________________________________________\nElimina el ultimo dato");
     miLista.EliminaUltimo();
     System.out.println(miLista);
      System.out.println("_____________________________________________\nInserta un dato anytes de");
     miLista.InsertarAntesDe(10,1);
     System.out.println(miLista);
     System.out.println("_____________________________________________\nBuscar un dato");
     
     miLista.buscar(1);
     System.out.println(miLista);
     System.out.println("_____________________________________________\nRrecorrer la lista de forma iterativa");
     miLista.Recorrei();
     System.out.println(miLista);
      System.out.println("_____________________________________________\nRrecorrer la lista pasandole un nodo como parametro");
     miLista.Recorrer_R(miLista.getInicio());
   
    }
    
}
