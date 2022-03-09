import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ClienteTest {

    val cliente = Cliente("Soul", "Rua Eater")
    val cliente2 = Cliente("Dragon", "Rua Slayer")

    @BeforeEach
    fun start(){
        cliente2.addCompra("Water")
        cliente2.addCompra("TV")
        cliente2.addCompra("PS5")
        cliente2.addCompra("Bottle")
    }

    @Test
    fun totalItensTest(){
        assertEquals(0, cliente.totalItens())
    }

    @Test
    fun addCompraTest(){
        cliente.addCompra("Book")
        assertEquals(1, cliente.totalItens())
    }

    @Test
    fun removeCompraTest(){
       /* cliente.addCompra("Book")
        cliente.addCompra("Pen")

        cliente.removeCompra("Book")
        assertEquals(1, cliente.totalItens())*/

        cliente2.addCompra("TV")
        assertEquals(3,cliente2.totalItens())
    }
}