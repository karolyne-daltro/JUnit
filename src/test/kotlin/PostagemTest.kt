import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PostagemTest {

    val postagem1 = Postagem(id: 0, titulo:"Viagem", descricao: "Viagem Top")
            val postagem2 = Postagem(id: 0, titulo"", descricao "Viagem Top")
            @Test
            fun validarCampos(){
                assertFalse(postagem1.validarCampos())
                assertTrue(postagem2.validarCampos())
            }
    @Test
    fun editarTituloTest(){
        postagem1.editarTitulo(newTitulo: "Santos")

        assertEquals("Santos", postagem1.titulo)
    }
}