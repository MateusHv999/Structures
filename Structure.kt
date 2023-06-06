package com.example.variaveis

class Structure {
}

/*fun main() {
  var array = IntArray(40)
    for(o in array.indices){
        array[o] = o
        println(array[o])
        // retorna valor de 1..39
    }

}*/

fun main(){
    var soma = 0
    for (i in 0..98){
        soma += i
        println(soma)
        println("O resultado da soma de todos números é de $soma")
        //retorna o valor total da soma
    }
}