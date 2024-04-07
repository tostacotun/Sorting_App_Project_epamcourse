import com.sorting_app.SortingApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsinArgumentos {
    @Test
    public void testNoArguments() {
        // Redirect System.out to a StringWriter to capture output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call the main method with no arguments
        SortingApp.main(new String[]{});

        // Verify the output
        assertEquals("No son suficientes numeros enteros" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testLessArguments() {
        // Redirect System.out to a StringWriter to capture output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call the main method with no arguments
        SortingApp.main(new String[]{"2", "1"});

        // Verify the output
        assertEquals("No son suficientes numeros enteros" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testWrongArguments() {
        // Redirect System.out to a StringWriter to capture output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call the main method with no arguments
        SortingApp.main(new String[]{"A", "r", "i", "g", "u", "m", "e", "n", "t", "o"});

        // Verify the output
        assertEquals("Error de formato ¿son numeros?" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testMoreArguments() {
        // Redirect System.out to a StringWriter to capture output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call the main method with no arguments
        SortingApp.main(new String[]{"11", "10", "9", "8", "7", "6", "5", "4", "3", "2","1"});

        // Verify the output
        assertEquals("Mas argumentos de los requeridos"+System.lineSeparator(),out.toString());
    }

//    @Test
//    public void testDuplicateArguments() {
//        // Redirect System.out to a StringWriter to capture output
//        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
//        System.setOut(new java.io.PrintStream(out));
//
//        // Call the main method with no arguments
//        SortingApp.main(new String[]{"10", "10", "9", "8", "7", "6", "5", "4", "3", "2"});
//
//        // Verify the output
//        assertEquals("Mas argumentos de los requeridos"+System.lineSeparator(),out.toString());
//    }

}
