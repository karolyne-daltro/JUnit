class Calculadora {

    /*companion object{
    fun soma(num1: Double, num2: Double): Double{
        return num1 + num2
    }
        fun subtracao(num1: Double, num2: Double): Double{
            return num1 - num2
        }

    }*/
    /*data class Calculadora (val num1: Double, val num2: Double)

    println("***Digite dois valores para fazermos a conta***\n")
    print("Valor: ")
    val num1 = readLine()!!.toDouble()
    print("Valor 2:")
    val num2 = readLine()!!. toDouble()

    var operacao = ""

    do{
        println("\nDigite a operação matemática, entre soma (+)," +
                "subtração (-), divisão (/) e multiplicação(*)")
        operacao = readLine()!!

        if (operacao == "+" || operacao == "-" || operacao == "*" || operacao == "/"){
            println("Sucesso!")
        }else{
            println("Operação inválida!")
        }
    }while (!(operacao != "+" || operacao != "-" || operacao != "*"))

    when(operacao){
        /*//Funções sem retorno
    "+" -> somaSem(num1, num2)
    "-" -> subtracaoSem(num1, num2)
    "/" -> divSem(num1, num2)
    "*" -> multSem(num1, num2)*/

        //Funções com retorno
        "+" -> println("A soma dos números é ${somaSem(num1, num2)}")
        "-" -> println("A subtração dos números é ${subtracaoSem(num1, num2)}")
        "/" -> println("A divisão dos números é ${divSem(num1, num2)}")
        "*" -> println("A multiplicação dos números é ${multSem(num1, num2)}")

    }

}
//Fuções sem retorno
fun somaSem (n1: Double, n2: Double){
    println("A soma entre os números é: ${n1 + n2}")
}

fun subtracaoSem (n1: Double, n2: Double){
    println("A soma entre os números é: ${n1 - n2}")
}
fun multSem (n1: Double, n2: Double){
    println("A soma entre os números é: ${n1 * n2}")
}
fun divSem (n1: Double, n2: Double){
    println("A divisão entre os números é: ${n1 / n2}")
}

//Funções com retorno

fun somaCom (n1: Double, n2: Double): Double{
    return n1 + n2
}

fun subtracaoCom (n1: Double, n2: Double): Double {
    return n1 - n2
}

fun diviCom (n1: Double, n2: Double): Double {
    return n1 / n2
}

fun multCom (n1: Double, n2: Double): Double{
    return n1 * n2
}*/

    companion object {
        fun soma(num1: Double, num2: Double): Double {
            return num1 + num2
        }

        fun subtracao(num1: Double, num2: Double): Double {
            return num1 - num2
        }

        fun divisao(num1: Double, num2: Double): Double {
            return num1 / num2
        }

        fun multiplicacao(num1: Double, num2: Double): Double {
            return num1 * num2
        }

    }
}