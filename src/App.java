import java.util.List;
import main.Ejercicio_01_insert.InsertBTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_Depth.Depth;
import main.Ejercicio_03_listLevels.ListLevels;
import main.materia.Models.Node;
import main.materia.controllers.ArbolAVL;
import main.materia.controllers.ArbolBinario;
import main.materia.controllers.ArbolRE;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runArbol2();
        //runArbolAvl();
        //runEjercicio1();
        //runEjercicio2();
        //runEjercicio3();
        runEjercicio4();
       
        }
        private static void runEjercicio4(){
            Depth tree = new  Depth();
            tree.insert(4);
            tree.insert(2);
            tree.insert(7);
            tree.printTree();
            int var = tree.calculateDepth();
            System.out.println(" Profundidad: " + var);
            
        }
        private static void runEjercicio2(){
            InvertBinaryTree invert = new InvertBinaryTree();
            invert.insert(4);
            invert.insert(2);
            invert.insert(7);
            invert.insert(1);
            invert.insert(3);
            invert.insert(6);
            invert.insert(9);
            System.out.println("Arbol : ");
            invert.printTree();
            invert.invertTree();
            System.out.println("Arbol Invertido: ");
            invert.printTree();
        }
            private static void runEjercicio1(){
                InsertBTTest insertarA = new InsertBTTest();
                insertarA.insert(5);
                insertarA.insert(3);
                insertarA.insert(7);
                insertarA.insert(2);
                insertarA.insert(4);
                insertarA.insert(6);
                insertarA.insert(8);
                insertarA.printTree();
                
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
                private static void runArbolAvl() {
                int [] values = {10,20,15,24,9,8,21,23,50,25};   
                ArbolAVL arbolavl = new ArbolAVL();
                for(int num : values){
                    arbolavl.insert(num);
                }
                     arbolavl.printTree();

    }
}
