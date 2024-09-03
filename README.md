<h1 align="center"> Análise de Vendas 2</h1>

Você deve ler um arquivo .csv contendo uma base de dados de registros
de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto ao lado **(Atenção: não use tipos primitivos int e double
nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto)**.
Favor baixar a base de dados .csv daqui:
https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379

Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo
(a ordem em que os vendedores são mostrados não importa).

**Atenção:** seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.

**Atenção:** caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma
mensagem conforme exemplo.

<h2 align="center"> Dicas:</h2>

1) Para resolver este problema, você deve primeiro varrer toda a lista gerando os nomes únicos de cada
vendedor. Para fazer isso de forma eficiente, use a coleção Set ou Map, pois estas não admitem repetição.
2) Uma vez que você tenha uma coleção com os nomes únicos de cada vendedor, use métodos Stream +
lambda para extrair o total vendido por cada um.

<h2 align="center"> Modelo Conceitual </h2>

<p align="center">
  <img src="https://github.com/user-attachments/assets/0c2c7cef-9ea4-45f2-a63e-f14825f4a2ba" alt="diagrama-uml">
</p>

<h2 align="center"> Exemplo</h2>

![Captura de tela de 2024-09-03 16-59-18](https://github.com/user-attachments/assets/d7ee0685-5713-44bc-9575-2159f95954f6)


## CRITÉRIOS DE AVALIAÇÃO (TODOS DEVEM ESTAR CORRETOS):
1) Leitura correta do arquivo.
2) Uso das coleções Set e/ou Map de forma coerente.
3) Uso das funções Stream + lambda de maneira coerente.
4) Tratamento de exceção correto.
5) Resultados com valores corretos.

## Realização

[DevSuperior - Escola de programação](https://devsuperior.com.br/)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) ![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)




