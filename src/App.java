import main.materia.controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();
        }
        
            private static void runArbolBinario() {
                ArbolBinario arbolB = new ArbolBinario();
                int[] valores = {40,20,60,10,30,50,70,5,15,55};
                for (int i = 0; i < valores.length; i++) {
                    arbolB.insert(valores[i]);
                }
                arbolB.printTree();
            }
}
