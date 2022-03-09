import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {
   /*
   @Test - Indica que a função que vamos declarar vai servir para testar alguma coisa

    */
   /* @Test
    fun somaTest(){
        /*
        asserts - Validar dados de qualquer tipo

        assertEquals(Resultado Esperado, Valor que vou testar)
         */

        assertEquals(3.0, Calculadora.soma(1.0, 2.0))
    }
    @Test
    fun subtracaoTest(){
        assertEquals(3.0, Calculadora.subtracao(4.0, 1.0))
    }*/
   @Test
   fun somaTest(){
       assertEquals(10.0, Calculadora.soma(5.0, 5.0))
   }

    @Test
    fun subtracaoTest(){
        assertEquals(50.0, Calculadora.soma(100.0, 50.0))
    }

    @Test
    fun divisaoTest(){
        assertEquals(6.0, Calculadora.subtracao(3.0, 2.0))
    }

    @Test
    fun multiplicacaoTest(){
        assertEquals(6.0, Calculadora.subtracao(3.0, 2.0))
    }




}