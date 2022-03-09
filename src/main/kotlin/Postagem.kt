class Postagem {

    data class Postagem (val id: Int, var titulo: String, var descricao: String)

    //Faz a verificação dos campos, para ver se a postagem foi criada da maneira correta
    fun validarCampos(): Boolean{
        return titulo == "" || descricao == ""
    }

    //Caso não tenha sido criada corretamente, joga uma exceção
    init {
        if (validarCampos()){
            throw Exception("Postagem errada.")
        }
        //Função que altera o titulo com dados não vazioz
        fun editarTitulo(newTitulo: String){
            
        }
    }
}