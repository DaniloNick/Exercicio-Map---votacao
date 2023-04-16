# Aplicação de Leitura e Contagem de Votos

Esta aplicação Java tem como objetivo ler um arquivo de texto contendo votos de uma eleição, armazenar em uma estrutura de dados e exibir o resultado da contagem de votos e o candidato mais votado.

## Como Utilizar

Ao executar a aplicação, o usuário será solicitado a informar o caminho do arquivo que contém os votos. Após informar o caminho, a aplicação irá processar o arquivo e exibir o resultado da contagem de votos e o candidato mais votado.


## Funcionamento

A aplicação utiliza um objeto **Scanner** para obter o caminho do arquivo informado pelo usuário. Em seguida, utiliza um objeto **BufferedReader** para ler as linhas do arquivo. A cada linha lida, a aplicação separa os valores com base na vírgula e armazena o nome do candidato e o número de votos em um objeto **LinkedHashMap**.

A aplicação avalia se a chave já existe na coleção. Se a chave existir, a quantidade de votos é somada à quantidade já existente na chave. Caso contrário, o nome do candidato é adicionado como chave e a quantidade de votos é atribuída como valor.

Após processar todo o arquivo, a aplicação exibe o resultado da contagem de votos e identifica o candidato mais votado, utilizando um **loop for** e o método **entrySet()** da coleção de votos. O candidato mais votado e a quantidade de votos recebidos são exibidos no console.

## Dependências

Não há dependências externas para a execução desta aplicação.

## Desenvolvedor
***Danilo Nascimento de Andrade***
