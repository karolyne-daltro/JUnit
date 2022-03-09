class Usuario (var login: String, var senha: String){

    val postagem = mutableMapOf<Int, Postagem>()

    //Faz a verificação dos campos, para ver se usuário foi criado da maneira correta
    private fun verificarCadastro(): Boolean{
        return login == "" || senha.isEmpty() || senha.lenght < 8
    }
    //Caso não tenha sido criado corretamente, joga uma exceção
    init {
        if(verificarCadastro()){
            throw Exception("Dados inválidos.")
        }
    }

    //Função que altera o login com dados não vazio
    fun alterarLogin(newLogin: String){
        if(newLogin.isEmpty()){
            println("Valor inválido")
        }else{
            login = newLogin
            println("Login alterado com sucesso.")
        }
    }
    //Função que altera a senha com dados não vazios e maiores que 8
    fun alterarSenha(newSenha: String){
        if(newSenha.isEmpty()){
            println("Valor Inválido")
        }else if(newSenha.lenght < 8){
            println("A senha precisa ter, no mínimo, 8 caracteres.")
        }
        //Função que cria uma nova postagem e armazena no map de postagens
        fun criarPostagem(id: Int, titulo: String, desc: String){
            val post = Postagem(id, titulo, desc)
            postagem[post.id] = post
        }

    }
}