# Objetivo

Imprementar um algoritmo para o [n-queens problem](https://en.wikipedia.org/wiki/Eight_queens_puzzle), tendo como objetivo buscar uma solução válida  para um determinando valor de n e realizar rotinas de teste para mensurar o tempo necessário para encontrar tal solução. 

# ToDo

### Back-End

* Modelar o comportamento do tabuleiro e da dama
* Definir o algoritmo que será utilizado para resolver o n-queens problem
* Imprementar o algoritmo para encontrar uma solução utilizando n = 8 por ser o exemplo clássico do problema
* Incrementar o algoritmo para encontrar uma solução para qualquer valor de n
* Definir a rotina de teste, tendo inicialmente como foco encontrar um número máximo para n
* Dividir valores de n para 100 instâncias como teste inicial, procurando mensurar o tempo que o algoritmo levou para encontrar a solução
* Armazenar os valores encontrados no teste
* Encontrar a distribuição adequada para os valores encontrados no teste
* Através da fórmula da distribuição, encontrar o tempo esperado para os valores de n utilizados
* Realizar mais 100 instâncias de testes com o algoritmo
* Verificar através da correlação de Pearson se o tempo esperado convergiu com os tempos mensurados no teste

### Front-End

* Definir esboço inicial da tela de interface
* Modelar a interface do tabuleiro e da dama para n = 8
* Preparar a interface para exibir o tabuleiro dinâmicamente conforme o tamanho de n aumente
* Fazer a solução do algoritmo exibir no tela 
* Fazer a solução do algoritmo executar conforme uma animação passo-a-passo na tela
* Plotar gráfico no próprio programa (Opcional) ou utilizando outra ferramenta com os valores obtidos do teste 
