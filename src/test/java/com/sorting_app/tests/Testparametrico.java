import com.sorting_app.Sorting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class Testparametrico {

    private int[] arregloEntrada;
    private int[] arregloOganizado;

    public Testparametrico(int[] entrada, int[] organizado){
        this.arregloEntrada = entrada;
        this.arregloOganizado = organizado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 } },
                { new int[] { 5, 1, 4, 2, 3 }, new int[] { 1, 2, 3, 4, 5 } },
                // Add more test cases as needed
        });
    }
    @Test
    public void testNoArguments() {
        Sorting sorting = new Sorting(this.arregloEntrada);
        sorting.Organizar();
        assertArrayEquals(this.arregloOganizado,sorting.getArreglo());
   }
}
