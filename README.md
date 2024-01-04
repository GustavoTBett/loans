# Loans

<!-- SOBRE O PROJETO -->
## SOBRE O PROJETO

Programa que retorna os tipos de empréstimos possíveis utilizando Java e Spring Boot para aprendizado. 

Desafio proposto por: https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md

```
    Exemplo:
    {
        "age": 23,
        "cpf": "xxx.xxx.xxx-xx",
        "name": "Gustavo Taufembach Bett",
        "income": 5000,
        "location": "SC"
    }
  
    Retorno:
    {
        "customer": "Gustavo Taufembach Bett",
        "loans": [
            {
                "type": "CONSIGNMENT",
                "interestRate": 2
            }
        ]
    }
```

Tecnologias utilizadas:
* Java
* Lombok
* Junit

<!-- GETTING STARTED -->
## Instalação

### Pré requisitos

* Insomnia/Postman/Google Chrome ( Para testar os endpoints ) 

* Alguma IDE que rode Java como Eclipse, Netbeans, Intellij... 

* Postgresql


### Instalação

1. Pegue o link do repositório https://github.com/GustavoTBett/loans.git
2. Clone o repo
   ```sh
   git clone https://github.com/GustavoTBett/loans.git
   ```
3. Abra o projeto em sua IDE de prefêrencia

4. Na IDE execute o arquivo LoansApplication

5. No insomnia teste os endpoins no localhost:8080

```
    Exemplo de JSON :
    {
        "age": 23,
        "cpf": "xxx.xxx.xxx-xx",
        "name": "Gustavo Taufembach Bett",
        "income": 5000,
        "location": "SC"
    }
 ```
