class Cliente {


    class Cliente (val nome: String) {

        private var endereco = ""
        private var telefone = ""
        private val listaDeCompra = mutableListOf<String>()

        constructor(nome: String, endereco: String) : this(nome){
            this.endereco = endereco
        }
        constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco){
            this.telefone = telefone
        }

        init {
            if (nome.isEmpty()){
                throw Exception("A classe cliente não foi instanciada corretamente.")
            }
        }

        fun addCompra(valor: String){
            if(valor.isEmpty()){
                println("Valor inválido.")
            }else{
                listaDeCompra.add(valor)
                println("Item $valor adicionado com sucesso.")
            }
        }
        fun removeCompra(valor: String){
            if (valor.isEmpty()){
                println("Valor inválido.")
            }else if (listaDeCompra.contains(valor)){
                listaDeCompra.remove(valor)
                println("O item $valor foi removido com sucesso.")
            }else{
                println("O item $valor não existe na lista.")
            }
        }
        fun totalItens(): Int{
            return listaDeCompra.size
        }

        fun listarCompras(){
            println("***Compras Cliente: $nome***")

            listaDeCompra.forEach {
                println(it)

            }
        }
    }



}