public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenamiento Seleccion");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        int[] arreglo = {5, 7, 30, 12, 9};
        int[] arregloOrdenado = mO.sortBySeleccion(arreglo);
        mO.printArreglo(arregloOrdenado);

        int[] arregloDes = {5, 7 ,30, 12, 9};
        int[] arregloOrdenadoDes = mO.sortBySeleccionDes(arregloDes);
        mO.printArregloDes(arregloOrdenadoDes);
    }
}
