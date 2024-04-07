import java.util.Arrays;

public class Sorting {
    int[] arreglo;

    public Sorting(int[] arreglo) {
        Arrays.sort(arreglo);
        this.arreglo = arreglo;
    }

    public void Organizar(){
        for (int numero:arreglo){
            System.out.println(numero);
        }
    }

    public int[] getArreglo() {
        return this.arreglo;
    }
}
