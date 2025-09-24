algoritmo cpf
    literal cpf
    real preco, total
    inicio 
       total = 0
       preco = 1
       escreva("digite o seu cpf: ")
       leia(cpf)

       enquanto(preco ! = 0){
        escreva("digite o preco do produto: ")
        leia(preco)
        total += preco
        
       }
       escreva("cliente: " + cpf)
       escreva("total a pagar. R$ " + total)
       fim