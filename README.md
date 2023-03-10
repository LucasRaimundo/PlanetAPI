
#  The Planets

Esse é um projeto para praticar conceitos de CRUD em uma API Rest.

## Appendix

O projeto tem como objetivo a criação de uma API simples que realize o cadastro de planetas. Sendo possível realizar a consulta de varios planetas que estajem inseridos no banco, podendo também atualizar e deletar seus dados. Abaixo, haverá informações que o auxiliarão no utilizamento da API.
## Authors

- [@lucasraimundo](https://www.github.com/LucasRaimundo)


## How to use?

1. Primeiro clone o repositório em sua maquina.

2. Em seguida, rode o projeto Spring Boot App.

3. O projeto nãi inicia com uma instancia de banco então, você terá de executar a seguinte requisição para adicionar o primeiro planeta à base: 

- localhost:8080/planets

OBS: Utilize o método POST

- {
    "nome": "Marte",

    "eixo": 142.1,

    "distanciaSol": 148.2,

    "periodoSideral": 366.256,

    "velOrbital": 28.79,

    "excentricidade": 0.0267,

    "inclinacaoOrbita": 1.86

}



4. Para atualizar as informações do planeta, é necessário saber o seu perspectivo Id, utilize a requisição e texto JSON que estão abaixo como exemplo:
 
 - localhost:8080/planets/1 

 - {

     "nome": "Terra",

     
 }

 OBS: Utilize o método PUT

 5. Para realizar a deleção, também é necessário saber o respectivo Id, utilize a requisição abaixo: 
  
  - localhost:8080/planets/1

  OBS: Utilize o método DELETE.

  6. Para visualizar os planetas que estão na base, utilize a requisição abaixo: 
  
  - localhost:8080/planets

  OBS: Utilize o método GET.
## Used stack

**Back-end:** Java, Spring Boot, Spring Web, H2, Maven e Git.



