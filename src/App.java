import java.util.List;
import main.ejercicio3.ListLevels;
import main.materia.Models.Node;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRE;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runEjercicio3();
        runArbol2();
        }
        
            private static void runArbolBinario() {
                ArbolBinario arbolB = new ArbolBinario();
                int[] valores = {40,20,60,10,30,50,70,5,15,55};
                for (int i = 0; i < valores.length; i++) {
                    arbolB.insert(valores[i]);
                }
                arbolB.printTree();
            }
            private static void runEjercicio3(){
                ArbolBinario arbolB = new ArbolBinario();
                int[] valores = {4, 2, 7, 1, 3, 6, 9};
                for (int valor : valores) {
                arbolB.insert(valor);
                }

                System.out.println("Árbol binario:");
                arbolB.printTree();


                ListLevels levels = new ListLevels();
                List<List<Node>> result = levels.ListLevels(arbolB.getRoot());

                System.out.println("\nNiveles del árbol:");
                for (int i = 0; i < result.size(); i++) {
                List<Node> level = result.get(i);
                System.out.print("Nivel " + i + ": ");
                for (Node node : level) {
                System.out.print(node.getValue() + " ");
                }
                System.out.println();
                }
            }
            public static void runArbol2() {

                ArbolBinario arbolbinario = new ArbolBinario();
                int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
                for (int valor : valores) {
                    arbolbinario.insert(valor);
                }
                arbolbinario.printTree();
                ArbolRE arbolRecorridos = new ArbolRE();
                System.out.println("\nRecorrido en Preorden (Iterativo):");
                arbolRecorridos.preOrderIterativo(arbolbinario.getRoot());  
                System.out.println("\nrecorrido en Preorde (recursivo): ");
                arbolRecorridos.preOrderRecursivo(arbolbinario.getRoot());
                System.out.println("\nrecorrido en Post order (Recursivo)");
                arbolRecorridos.postOrderRecursivo(arbolbinario.getRoot());
                System.out.println("\nrecorrido en in Order (recursivo)");
                arbolRecorridos.inOrderRecursivo(arbolbinario.getRoot());
                
            }
}
