fun main() {

 println("Digite um valor: ")
 val x = readLine()!!.toInt()
 println("Digite o segundo valor:")
 val y = readLine()!!.toInt()

 println("Escolha a operacao: ")
 println("1 -- Soma:            $x + $y")
 println("2 -- subtracao:       $x - $y")
 println("3 -- multiplicacao:   $x * $y")
 println("4 -- divisao:         $x / $y")

  when (readLine()!!.toInt()) {
   1 -> print("Adicao. \n\nO resultado da adicao eh ${x + y} \n")
   2 -> print("subtracao. \n\nO resultado da subtracao eh ${x - y} \n")
   3 -> print("multiplicacao. \n\nO resultado da multiplicacao eh ${x * y} \n")
   4 -> print("divisao. \n\nO resultado da divisao eh ${x / y}\n")
   else -> println("Digite uma opcao valida: ")

  }
 }
