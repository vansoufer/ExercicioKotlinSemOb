fun main(){
    println("Hello World")
    println(meuNome("Vanessa ", "Souto"))


    var lista = arrayListOf<String>()
    lista.add("primeiroItem")
    println(lista.get(0)) // ou lista[0]

    println("Exercício 1: "+ exercicio1(5, 7, 1))
    println("Exercício 2: "+ exercicio2("Matheus", "faffds"))
    println("Exercício 3: "+ exercicio3(3))
    println("Exercício 4: ")
    exercicio4()
    println("Exercício 5: " + exercicio5(4, 0, 1, 2))
    println("Exercício 6: ")
    exercicio6()

}

fun meuNome( nome: String, sobrenome: String) :String {
    return nome + sobrenome
}

//Exercicio 1
fun exercicio1(num1: Int, num2: Int, num3: Int): Int{
    var maior = num1;

    if (num1 <= num2){
        maior = num2;
    }
    if(maior <= num3){
        maior = num3;
    }

    return maior;
}

//Exercicio 2
fun exercicio2(str1: String, str2: String): Boolean{
    return (str1 != str2);
}

//Exercicio 3
fun exercicio3(num: Int): Boolean{
    return (num % 2 == 0);
}

fun exercicio4(){
    var aux = 0
    var i = 1
    while(aux < 100){
        if(i%2!=0){
            println(i)
            aux++
        }
        i++
    }
}

fun exercicio5(numA: Int, numB: Int, numC: Int, numD: Int) :Boolean{
    return((numA > numC && numA > numD) || (numB > numC && numB > numD))
}

fun exercicio6(){
    for (i in 1..100){
        println(i)
    }
}