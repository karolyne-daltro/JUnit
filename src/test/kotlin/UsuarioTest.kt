import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UsuarioTest{

    val usuario = Usuario("", "")

    @Test
    fun verificandoCadastro() {
        assertTrue(usuario.verificarCadastro())
    }
    @Test
    fun alterarLogin(){
        val novoLogin = "Henrique"
        usuario.alterarLogin(novoLogin)
        assertEquals(novoLogin, usuario.login)
    }

    @Test
    fun criarPostagemTest(){
        usuario.criarPostagem(id:0, titulo:"Viagem", desc:"Viagem Top")
        assertEquals(Postagem(id:0, titulo:"Viagem", descricao: "Viagem Top"),
        usuario.postagem[0]
        )

    }
}