# Registro-de-Cartorios
Desafio relacionado a um CRUD sobre registro de cartorios.


## Arquitetura utilizada na contrução

Foi utilizado Spring boot, Spring MVC, Thymeleaf e Spring DATA JPA.


## Importação do projeto

Para a importação do projeto, utilize o wizard da sua IDE preferida e realize o import do projeto através da leitura do arquivo POM.xml. 

## Execução do container
 
Na estrutura da aplicação foi disponibilizada um arquivo "docker-compose.xml"  utilizado para subir um container via Docker.

Tendo o docker instalado , vá até o diretorio do arquivo e execute o seguinte comando :

```
docker-compose up -d --build
```

Após isso , a imagem com o MYSql estara disponivel na porta 3306, com acesso já configurado na aplicação.

