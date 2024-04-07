import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args){
        if (args.length <10){
            System.out.println("No son suficientes numeros enteros");
            return;
        }

        int[] numeros = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();

        Sorting claseorganiza = new Sorting(numeros);
        claseorganiza.Organizar();




    }
}
