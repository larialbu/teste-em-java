package larissa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class CalculadoraTest {
    
    @Test
    public void somaTest(){
        Calculadora calc = new Calculadora();
        double soma = calc.somar(4, 5);
        assertEquals(9, soma);
    }

    @Test
    public void subtraiTest(){
        Calculadora calc = new Calculadora();
        double subitrai = calc.subtrair(4, 5);
        assertEquals(-1, subitrai);
    }

    @Test
    public void multiplicaTest(){
        Calculadora calc = new Calculadora();
        double multiplica = calc.multiplicar(4, 5);
        assertEquals(20, multiplica);
    }

    @Test
    public void dividiTest(){
        Calculadora calc = new Calculadora();
        double dividi = calc.dividir(5, 5);
        assertEquals(1, dividi);
    }

}
