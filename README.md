# 🚨 AVISO!  
Este foi meu primeiro contato com o framework de desenvolvimento, e, por isso, enfrentei algumas dificuldades. A proposta do desafio era criar um CRUD completo, mas, até o momento, consegui implementar apenas as funções de **leitura (read)** e **leitura específica por ID (read by ID)**.  

---

# 📌 INSTRUÇÕES  

O projeto é composto por dois servidores:  
1. **Back-end** (junto com o banco de dados)  
2. **Front-end**  

## FRONT-END  
- Desenvolvido utilizando **Node.js** para criar um servidor local.  
- Utiliza **HTML e CSS** para a estilização do portal.  
- O portal permite visualizar as propostas.  
- As funções de **criação (create)** e **exclusão (delete)** estavam previstas, mas enfrentei dificuldades na implementação. Portanto, podem ocorrer erros ao tentar executá-las.  

### Como iniciar o servidor do front-end  
Execute um dos seguintes comandos no terminal:  
```sh
npm start
# ou
node server.js
```



## BACK-END  
- Desenvolvido com o framework **Quarkus**, proporcionando uma integração rápida para as operações CRUD.  
- Implementado com **Java**, utilizando **JAX-RS** para a criação da **REST API**.  
- Atualmente, as operações disponíveis são **read all** e **read by ID**.  

### Como iniciar o servidor do back-end  
1. Acesse o diretório onde o projeto Quarkus está localizado:  
   ```sh
   cd /caminho/do/projeto
   ```
2. Execute o seguinte comando para rodar o servidor:  
   ```sh
   ./mvnw quarkus:dev
   ```
   O servidor será iniciado e estará disponível em:  
   ```
   http://localhost:8080/propostas
   ```

## 💡 Conclusão  
Apesar das dificuldades, esta foi uma ótima oportunidade para aprender mais sobre **Quarkus, Node.js e bancos de dados SQL**. Pretendo continuar aprimorando o projeto e implementar as funcionalidades que ficaram pendentes.  
