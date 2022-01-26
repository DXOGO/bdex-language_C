## Group members
&nbsp;

| NMec | Name | email | Contribution (%) | Detailed contribution [1]
|:-:|:--|:--|:-:|:--|
| 98470 | Artur Correia Romão | artur.romao@ua.pt | 50 50 16.6 16.6 |primary-grammar; primary-semantic-analysis; examples; testing |
| 98595 | Diogo Pereira Henriques da Cruz | diogophc@ua.pt | 20 80 16.6 16.6 | code-generation; secondary-code-generation; examples, testing |
| 98679 | João Bernardo Tavares Farias | joaobernardo0@ua.pt | 70 30 16.6 16.6 |secondary-grammar; secondary-semantic-analysis; examples; testing |
| 97631 | Nuno Santos Fahla | nunofahla@ua.pt | 30 70 16.6 16.6 | secondary-grammar; secondary-semantic-analysis; examples; testing |
| 97673 | Pedro Daniel Lopes Duarte | pedro.dld@ua.pt | 50 50 16.6 16.6 | primary-grammar; primary-semantic-analysis; examples; testing |
| 97636 | Vasco Jorge Regal Sousa | vascoregal24@ua.pt | 80 20 16.6 16.6 | code-generation; secondary-code-generation; examples; testing |

[1] Topics:<br>
   primary-grammar (%)<br>primary-semantic-analysis (%)<br>code-generation (%)<br>secondary-grammar (%)<br>secondary-semantic-analysis (%)<br>secondary-interpretation/secondary-code-generation (%)<br>examples (%)<br>testing (%)<br>other (%) (explain)

- Beware that within the group the sum for each topic must be 100% (obviously).

## Material to be evaluated

- Beware that **only** the code in the **master** branch will be considered for evaluation.

## Compilation & Run

- É fornecido um script *build-jar.sh* que instala a package de Python para ter acesso a todas as classes e funções, corre o antlr-4-build e cria o ficheiro *Compiler.jar* que vai ser usado para compilar um programa na nossa linguagem. A compilação de um exemplo pode ser feita na pasta "/examples/LingPrimaria" correndo o comando "../../src/Compiler.jar < *ficheiro_exemplo* > *ficheiro_output*" e o output pode ser corrido como um script normal de Python.

## Introdução
Foi escolhido para este projeto a linguagem BDex que permite a criação, leitura e formatação de tabelas. Neste trabalho encontra-se a possibilidade de declaração de variáveis nos cabeçalhos e operações para editar linhas e colunas de tabelas (ações de adição, remoção, merge, etc). Também com isto vem a possibilidade de dar import a tabelas externas e fazer a sua leitura, assim como dar export de tabelas também. 
De seguida iremos dar mais informação sobre a linguagem criada, explicação da gramática, da linguagem primária e secundária e dos exemplos criados para mostrar o funcionamento da mesma.

## 1. Linguagem principal
#### Definição em ANTLR4
Foi definido no ficheiro Primaria.g4 a gramática principal. Esta define-se como uma sequência de zero ou mais *command*, sendo que cada *command* pode gerar cinco diferentes símbolos sintáticos.
    
    program: command*;
    command:
    	expr ';'		# SingleCommand
    	| ifcommand		# IfCommand
    	| whilecommand	# WhileCommand
    	| forcommand	# ForCommand
    	| defcommand	# FuncCommand;

A explicação destes símbolos sintáticos está nos tópicos seguintes.

#### Tipos de dados
- Números **inteiros** e **reais** (como 2 e 2.0 respetivamente)
- **Strings** (qualquer sequência de caracteres entre aspas)
- **Boolean** (‘***true***’, ‘***false***’ ou comparações de valores)
- **Tuple** exemplo: **(1, “Exemplo”)**
- **Dicionário** exemplo: **(“Nome”: “Alfredo”, “Idade”: 10)**
- **Tabela** exemplo **{“Nome”: String, “Idade”: Int, “ProxIdade”: [“Idade”] + 1}**
- **Linha** (nunca criado diretamente pelo utilizador)

#### Operações com dados
É possível fazer operações entre dados com o esquema:
```*dado1* *operador* * dado2*```
estando disponível os seguintes operadores:
- Comparação: ‘==’, ‘!=’, ‘<’, ‘>’, ‘<=’, ‘>=’
- Cálculo: ‘+’, ‘-’, ‘*’, ‘/’, ‘%’.

No contexto de tabelas, estão ainda disponíveis três operadores:
 - Para fazer **join**: '*' e '^''
 - Para adicionar colunas: '+'

#### Operações com tabelas
- Adicionar linha: **add** (tuple | dicionario)
- Eliminar linha: **del** (tuple | dicionário) 
- Adicionar coluna: **add_col** (dicionário)
- Selecionar linha:  **tabela[...]**
- Selecionar campo de linha:  **linha<campo>**
- Ordenar tabelas por colunas: **sort** *tabela* by “coluna”
- ***Join***, ***merge*** e ***clone*** de 2 tabelas
- Retornar uma tabela com as *n* primeiras linhas: **pop** *n* from tabela

#### Controlo de fluxo
- **for <nome> in <estrutura>**: itera todos os elementos presentes em ***estrutura***.
- **while condição {código}**: define um ciclo em que *código* vai ser executado um número variável de vezes (até *condição* ser avaliada como verdadeira). 
- **IF condição {código}**: o código só vai ser executado se a condição for avaliada como verdadeira.

#### Definição de funções
- **def <nomefuncao> (argumentos)**: define uma função que pode ser chamada a qualquer momento, sendo os argumentos em número variável (0,1,...,n).

#### Utilização de comentários
Foram definidas nesta linguagem duas alternativas para fazer comentários:
```// isto é um comentário *inline*```
```/* isto é um comentário multilinha```
Em ambos os casos, o texto vai ser sintaticamente irrelevante e consequentemente irá ser ignorado
#### Expressões
Uma expressão, pode tomar a forma de um dos seguintes casos:
- Uma variável (a primeira letra na definição de uma variável tem obrigatoriamente de ser minúscula);
- Um tipo de dados (Int, String, Float);
- Valores booleanos (true, false);
- *break* e *return*;
- operações entre expressões (== != < > <= >= ^ * / % + -);
- um (ou mais) KeyValue (Uma String seguida de uma expressão);
- uma ou várias expressões consecutivas, com ou sem precedência (a precedência é definida através do uso de parêntesis);
- Operações sobre tabelas: 
        1. obter a primeira linha da tabela, 
        2. ordenar as tabelas por colunas (de forma ascendente ou descendente), 
        3. adicionar valores à tabela, 
        4. apagar valores da tabela,
        5. obter uma tabela com as primeiras *x* linhas
        6. criar condições para uma linha poder ser inserida

#### Análise semântica
De maneira a fazermos a verificação semântica, foi criado o ficheiro ***Compiler.java***, que verifica algumas situações que achamos oportunas, mantendo assim a integridade da linguagem. Apresentamos a seguir a lista de regras:
- Não é permitido utilizar a instrução *break* fora de um loop (***for*** ou ***while***);
- A instrução *return* não pode ser utilizada fora do contexto de função;
- O ficheiro *.csv* tem que obedecer a um conjunto de regras definidas na gramática secundária;
- Ao chamar uma função que não está definida, o programa devolve um erro;
- Se se chamar uma variável em contexto de função o programa também devolve erro, por exemplo, se for definida a variável ```teste=5``` e de seguida executamos a instrução ```print(teste())```, o programa também devolve um erro;
- As variáveis, quando chamadas, tem de estar definidas;
- Uma operação não pode ser executada quando essa operação não está definida no ficheiro ***TypeControl***. Este ficheiro contempla os casos possíveis(por exemplo **int** + **real**) e retorna ***null*** nos casos impossíveis(por exemplo **string** + **int**).

***TypeControl***: ficheiro que ajuda a manipular tipos. Define uma interface para adicionar e extrair um tipo de uma class ST e ainda define as operações permitidas entre tipos diferentes.
***ContextControl***: controla o contexto de execução do programa permitindo saber que variáveis estão disponíveis e o tipo de bloco em que nos encontramos (main, for, while, func, if) que vai numa fase seguinte permitir definir instruções que só podem ser usadas dentro de um bloco específico (como o break e o return).

## 2. Linguagem Secundária
A linguagem secundária serve de mediador entre o import da linguagem primária e um ficheiro que descreve uma tabela de uma base de dados. É executada na chamada ao comando import e verifica a consistência de dados de um dado ficheiro. 
Para começar, a gramática foi definida de forma a verificar que o ficheiro começa por um cabeçalho e que é precedido por linhas que contêm dados. O cabeçalho foi definido de forma a ter a seguinte estrutura: **[Atributo]:[Tipo]**, uma ou mais vezes. O atributo pode ser qualquer conjunto alfanumérico conveniente e o tipo de dados tem que ser obrigatoriamente um dos seguintes: ***int***, ***float*** ou ***string***. Entre cada um destes conjuntos deve sempre existir um *tab* (*\t*) de forma a estruturar as colunas diferentes. No caso das linhas, estas vão também ter os seus valores separados por *tabs*, podendo existir 0 ou mais linhas, cada linha começa com um *\n*, de forma à primeira linha estar separada do cabeçalho, no final pode ou não ter outro *\n*, dependendo se é o final do ficheiro ou não.

#### Análise semântica e interpretação
O ficheiro **SecundariaMain** sofreu uma alteração. Foi adicionado um método *load()* muito idêntico à função *main* do ficheiro, com as diferenças de ser criado um *LinkedHashMap* que será uma representação da tabela descrita num ficheiro. Os conteúdos analisados são dados por um ficheiro passado como parâmetro e não pelo ***System.in*** e depois de executado o *visitor*, este método em vez de retornar *void*, retorna os dados do ficheiro na forma de um **Java map**. Esta função *load()* será chamada no *visitor* da gramática principal aquando da instrução *import*, onde caso retorne *null*, não será considerada a instrução mencionada. Decidimos retornar um mapa representativo e não simplesmente um valor booleano para manter o nosso sistema escalável, caso fosse necessário a gramática primária fazer um tratamento ou interpretação de dados mais profunda.
No visitor *Verify*, foram criadas muitas estruturas de dados parecidas mas necessárias para evitar erros. O *visitHeader*, ao analisar a primeira linha do nosso ficheiro, divide as colunas pelos tabs e os elementos pelos ':'. Após esta divisão, guarda num dicionário que descreve o cabeçalho os pares ***key-atributo value-tipo***, exemplo ```nmec:int, nome:string```. De seguida são feitas as alterações para a tabela retornada em forma de **Java Map**: ***keys*** são o atributo (nmec, nome, email), ***values*** são ***Array Lists*** de *strings*, sendo que cada entrada do mapa corresponde a uma coluna. É de notar que, aqui usamos *arraylists* de *strings* para tudo, já que no mapa retornado não fará diferença o valor dos dados, sendo que a verificação do tipo de dados será feita de forma diferente. Ainda no ***visitHeader*** é populada uma lista com os tipos de dados, na sua ordem original. Quanto ao *visitLinha*, este método começa por adicionar cada linha da tabela a um ***arraylist***, separando os elementos por *tabs*. De seguida, verifica se o número de elementos de cada linha é igual ao número de pares ***chave-valor*** do *map header*, caso não seja o valor da variável ***isvalid*** fica falso. Com este valor a falso, o programa saberá quando deve executar ou não certos blocos de código, pois se o número de colunas do cabeçalho é diferente do número colunas nas linhas isto gera imensos erros nos acessos aos *arrays*, caso a linha passe este teste, serão agora analisados os tipos dos valores introduzidos. Segue-se a verificação do tipo de dados de cada coluna com o valor passado na primeira linha, através de um *parse* ao valor string. Caso este parse seja impossível ou seja encontrado um tipo sem ser um dos desejados, a variável *isvalid* ficará com o valor falso o que faz com que não seja criado o mapa representativo da tabela descrita no ficheiro. Os dados apenas sofrem um teste de *parse*, no estado atual não são guardados no seu tipo correspondente visto que não iremos analisar o mapa representativo ao nível do conteúdo mas apenas ao nível da sua existência.

***Exemplo de um ficheiro aceite pela linguagem Secundária:***
``` 	
NMEC:INT	FNAME:STRING	LNAME:STRING	EMAIL:STRING	CURSO:STRING
11111	Américo	Sousa	dse24@ua.pt	IBM
40210	Nune	Almeida	nuno@ua.al	CT
71922	António	Cross	ac@ua.pt	LEI
```
***Exemplo de um ficheiro não aceite pela linguagem Secundária:***
``` 	
NMEC:INT	FNAME:STRING	LNAME:STRING	EMAIL:STRING	CURSO:STRING
11111	Américo	Sousa	dse24@ua.pt	IBM
40210	Nune	Almeida	nuno@ua.al	CT
71922	António	Cross	ac@ua.pt
```
**ou**
``` 	
NMEC:INT	FNAME:STRING	LNAME:STRING	EMAIL:STRING	CURSO:STRING
onze	Américo	Sousa	dse24@ua.pt	IBM
40210	Nune	Almeida	nuno@ua.al	CT
71922	António	Cross	ac@ua.pt	LEI
```
Por fim, a função *getMap()* é chamada pelo método clone da função main, o *load()*, apenas se não tiverem sido encontrados erros e não tenha sido acionada a *flag isvalid*. No melhor dos casos, o método *getMap()* itera o mapa representante da tabela do ficheiro, de forma a popular o novo mapa com os seus dados mas com a ligeira diferença das *keys* agora serem ```[ATRIBUTO]:[TIPO]``` e não apenas ```[ATRIBUTO]```.
No o último passo este novo mapa é retornado. Caso o ficheiro passado como argumento ao método *load()* não tenha sido validado corretamente, o valor de retorno é *null*.
## 3. Linguagem: Destino
#### Geração de código
Para a compilação e geração de código foi utilizada a ferramenta *String Template*, apresentada nas aulas teóricas, cujo principal objetivo é gerar o código-fonte da linguagem. De notar que este código só é gerado após compilação.
Quando as verificações da análise semântica são terminadas, a linguagem procede à compilação através de um *visitor* (***Compiler.java***). É neste ficheiro onde são introduzidas as instruções indicadas pelo utilizador no ficheiro *template.stg*, é introduzido também um *STGroupFile* que faz a renderização do *String Template* com o código *python* final pronto para ser executado, de acordo com as regras implementadas pelo grupo.

#### Linguagem de destino
A nossa linguagem destino foi desenvolvida em python. Pata isso, foi criado um conjunto de estruturas de dados que suportam a execução da nossa linguagem.

- `structures.py`

	Neste ficheiro encontram-se todas as estruturas que vão efetivamente conter os dados, assim como uma classe que é responsável por operações entre tabelas.
	 
	A classe <b>Table</b> contém um header (nome das colunas e respetivo tipo de dados), um conjunto de fórmulas associadas a determinadas colunas e uma lista de objetos <b>Row</b>. É chamando métodos desta classe que são efetuadas grande parte das manipulações de dados da nossa linguagem. Entre eles, temos <b>add_col</b>, que adiciona uma coluna, <b>select</b>, que retorna uma SubTable com um conjunto de objetos Row que satisfazem uma condição lambda, <b>order</b>, que ordena as linhas de tabela em função de uma coluna usando o quicksort, entre outras.
	
	Uma <b>SubTable</b> é uma sub classe de Table que é cirada quando se faz um select. Esta herda um subconjunto de rows da sua tabela mãe. Qualquer alteração feita neste objeto é refletida também na Table que a originou.
	
	A classe <b>Row</b> representa um tuplo de um tabela. O utilizador nunca instancia diretamente objetos Row, estes são criados em métodos de uma Table. Um Row possui um dicionário que associa um valor a cada coluna da table onde está, e possui um conjunto de métodos que permitem addcionar, remover ou alterar os seus dados. Para além disso, possuem um conjunto de SubRows, que, analogamente à relação Table/SubTable, trata-se de um Row definido por um subset de valores de um objeto Row. 
	
	<b>TableOperator</b> é uma classe estática, sendo chamada unicamente pelos seus métodos. É responsável por efetuar operações como joins (^), merges (*) e clones (+), aceitando, em cada uma das operações, duas tabelas como argumento.
	
	
- `instructions.py`
	
	Aqui encontra-se um conjunto de métodos com instruções básicas para receber input do utilizador e ler/escrever ficheiros
	
- `enums.py`

	Dois enums: o enum <b>Order</b> contém as possíveis ordenações quando se executa a operação table.order (ASC, DESC). O enum Type tem os tipos de dados possíveis: INT, STRING, FLOAT e LAMBDA
	
- `utils.py`
	
	Conjunto de utilidades.





## 4. Examples

1. `bdex-comp-02/examples/LingPrimaria/Notas.txt`

    Neste exemplo começamos por definir inicialmente 5 funções através do comando *def* que é o comando correspondente na nossa linguagem.
    1. A primeira função definida ***showMenu()*** vai fazer o *print* de 6 opções que vão servir menu ao utilizador. Contrariamente a outras linguagens, aqui o comando *print* não necessita de parêntesis.
    2. Quanto à segunda função definida ***cabecalho()*** e à semelhança da função anterior, esta faz *print* do que está entre aspas.
    3. A terceira função definida ***printresults(alunos, results)*** recebe duas tabelas. Antes de as juntar, é chamada a função *cabecalho* que imprime o cabeçalho. Após isto é feito um ciclo *for* sobre o *join* das duas tabelas e é impresso o valor das colunas correspondente ao *NMEC*, *NAME*, *NotaTP*, *NotaP*, *NotaF*, *Aprovacao*, respetivamente. De notar que conseguimos aceder ao valor da coluna com um determinado nome através da instrução ***str_val aluno<"nome_coluna">***
    4. A quarta função ***aprovacao(alunos, results)***

2. `/examples/LingPrimaria/Biblioteca.txt`

    Este exemplo simula uma base de dados de uma biblioteca, assim como uma interface na linha de comandos para a sua manipulação. O modelo de dados é constituído por tabelas de livros, autores, leitores, registos, nacionalidades e tipoRegisto que são importadas do seu respetivo ficheiro .csv para um objeto Table quando o programa inicia. Caso o import falhe, é criada uma nova tabela, vazia, no lugar do objeto que o import criaria. De seguida, são aplicados um conjunto de checks a certas colunas para definir uma lógica nos dados (por exemplo, o Rating não ser superior a 5.0).
    O utilizador é de seguida apresentado com um menu onde pode fazer um conjunto de operações.
    
    - <b>Adicionar um livro</b>
    	O utilizador fornece uma Referencia, um Título, uma Editora, uma Edição, o ano da Primeira Edição, o ano da Edição Atual e um conjunto de Autores e respetivas Nacionalidades. O livro é depois verificado se tem referencia única e inserido numa tabela usando `add (variaveis inseridas) to tabelaLivros;`. O mesmo acontece para os autores inseridos ( na tabela tabelaAutores ), caso estes ainda não lá estejam. 
    	
    - <b>Alterar num de exemplares</b>
    	Nesta operação, o utilizador pode adicionar um conjunto de números ao stock da biblioteca. Indica a referência do produto e a quantidade que quer adicionar. Para isso, é feito um get do livro com a referência inserida, ou seja, `livros[["LivroRef"] == ref];` . Se existir, é feito um set, `set livro to ("NumExemplares": read_int);`.
    	
    - <b>Ver livros</b>
    	Apresenta a tabela com todos os livros presentes na base de dados, assim como o calculo do seu Rating total e o conjunto dos seus autores.
    	Para esta tabela, é feito o merge da tabela dos livros, autores e nacionalidade: `print livros * autores * nacionalidades;`
    	
    - <b>Registar Leitor</b>
    	Insere um leitor na base de dados, identificado por um Nome e um número (que é auto-incrementado). É feito um add à tabela dos leitores.
    	
    - <b>Requisitar Livro</b>
    	Com o id do livro e de um utilizador, atribui o livro ao utilizador caso haja em stock. É verificado quantos livros da referencia estão disponiveis calculando o NumExemplares no tuplo desse livro, subtraindo o numero de vezes que este aparece nos registos (tanto em arranjo como requisitado). Se existirem livros disponiveis e o leitor estiver ativo, é adicionado aos registos `add (ref, 1, nleitor) to registos;`
    	
    - <b>Devolver Livro</b>
    	No momento de devolução, o utilizador pode dar um rating ao livro (inteiro, de 0 a 5) e pode indicar se o livro precisa ou não de arranjo. Caso precise, o livro fica em estado de arranjo. Uma devolução pode ser originado de uma Requisição ou de um Arranjo.
    	
    - <b>Ver Registos</b>
    	Mostra a tabela com o histórico de registos. Esta tabela resulta de um join, `join = registos * livros * tipoRegisto * leitores;` e são mostrados, com um select, `join[("Titulo", "Nome", "Designacao")];` apenas os campos indicados.
    	
    - <b>Ver Leitores</b>
    	Mostra a tabela com os leitores (Pode ser filtrado por todos ou apenas os ativos). Se forem escolhidos todos os leituras, é apenas impressa a tabela leitores. Se forem só os ativos, apenas os que possuem o campo "Ativo" com valor 1, ou seja, `leitores[["Ativo"] == 1]; `.
    	
    - <b>Top 3 livros</b>
    	Mostra uma tabela com os 3 melhores livros classificados mediante uma segunda opção: Ou top3 por rating, ou top3 por requisição ou finalmente top3 de autores portugues. Para a primeira, é feito um pop dos primeiros 3 tuplos da tabela dos livros ordenados por rating, `pop 3 from sort livros by "Rating" desc;`. Para a segunda opção, é criada uma tabela temp que associa cada livro na base de dados com a respetiva contagem na tabela dos registos, tendo uma tabela que associa a cada referência de livro o número de vezes requisitado e, de seguida, é feito o pop dessa tabela temp joined com os livros `pop 3 from tabLivros;`. Para a última operação, é feito um join de todos os livros com a tabela autores onde o campo de nacionalidade do autor tem valor e de seguida ordenado por rating. `livrosPT = livros * autores[["IdNacionalidade"] == 1];` , `pop 3 from sort livrosPT by "Rating" desc; `.


3. `/examples/LingPrimaria/Albuns.txt`

    Este exemplo simula um programa que trata de operações relativas a albúns de música. Cada albúm é identificado por uma referência, nome, ano que estreou, a banda/artista do mesmo e a editora (atributos que fazem parte do cabeçalho da tabela). O utilizador pode adicionar músicas inserindo estes dados e também tem a possibilidade de ver umas tabela com os albúns já registados com a sua informação completa. O menu apresenta-nos 3 opções que ao serem chamadas executam diferentes funções:

    - <b>Adicionar um albúm</b>
        Recebe como parâmetro o cabeçalho da tabela que será as informações do albúm e chama a função `addAlbumInput` que trata de pedir ao utilizador os restantes dados sobre o albúm que quer adicionar (referência, nome, ano, banda/artista, editora) e por fim atualiza a tabela com o novo albúm chamando a função `addAlbum` que tem como parâmetros a tabela principal e os atributos do albúm que é pretendido ser criado e adiciona então o albúm e os seus atributos à tabela.

    - <b>Mostrar albúns</b>
        Recebe como parâmetro mais uma vez o cabeçalho da tabela e chama a função que vai dar print em formato de tabela todos os albúns existentes na tabela começando por dar print tanto aos atributos do cabeçalho como aos atributos de cada albúm em formato String chamando a função `printShowAlbumsLine`. Primeiramente é dado print ao cabeçalho e de seguida para cada albúm existente na tabela irá dar print dos seus atributos.

    - <b>Sair</b>
        A última opção termina o programa de forma limpa.

4. `/examples/LingPrimaria/Futebol.txt`

    Este exemplo simula a tabela de um campeonato de futebol em que cada equipa, identificada pelo nome, compete para estar no topo da tabela. Para decidir quem está no topo é a equipa que tem mais pontos, cada vitória vale 3 pontos, empate 1 e derrota 0 pontos. Para cada equipa na tabela tem os atributos de número de vitórias, empates, derrotas, golos marcados, golos sofridos e pontos totais.
    Também é criada a tabela de todos os jogos entre as equipas criadas pelo utilizador em que verifica que são equipas diferentes e faz a operação `eq1 ^ eq2` que é a operação encarregue de multiplicar as colunas para obter todas as possibilidades de jogos entre as equipas criadas e são criadas 2 colunas extra com a informação dos golos marcados de uma equipa e da outra `jogos + { "GolosEq1": Int, "GolosEq2": Int }` na tabela dos jogos.

    - <b>Obter resultados</b>
        A função recebe como parâmetros as duas tabelas, a tabela das equipas criadas e a tabela de todos os jogos entre elas. Primeiramente vai dar print para cada linha representativa de um jogo entre 2 equipas o nome das equipas que se vão defrontar e pede ao utilizador para dar input do número de golos que cada equipa marca no jogo. Com estes dados inseridos é atualizada a tabela dos jogos bem como o das classificações das equipas conforme os golos que cada equipa marcar no confronto direto e, usando o `set`, vai atualizar para cada equipa os golos marcados e sofridos bem como os seus pontos.
        De seguida vai-se à tabela das classificações onde contém os atributos de vitórias, empates, derrotas, golos marcados, sofridos e pontos totais e vai ver para cada equipa as vitórias, derrotas e empates e o número de pontos será o número de vitórias multiplicado por 3 mais o número de empates.

    - <b>Obter melhores 3 equipas</b>
        Recebe como parâmetro a tabela de classificações e usa `pop 3 from sort equipas by "Pontos" desc` que retorna uma tabela com as 3 linhas com as equipas com mais pontos e dá print aos seus atributos.
...

## Semantic error examples

1. `/examples/errors/VarNotDefined.txt`

    Compilador avisa que uma variável usada não foi definida.

2. `/examples/errors/VarIsNotFunc.txt`

    Compilador avisa que uma variável de outro tipo está a tentar ser usada como função.
    
3. `/examples/errors/FuncNotDefined.txt`

    Compilador avisa que uma função usada não foi definida.
    
4. `/examples/errors/ReturnOutsideFunc.txt`

    Compilador avisa que um return foi usado fora de um bloco de função.
    
5. `/examples/errors/BreakOutsideLoop.txt`

    Compilador avisa que um break foi usado fora de um loop (while/for).

6. `bdex-comp-02/examples/errors/n_funcional1.csv`
```
NMEC:INT	FNAME:STRING	LNAME:STRING	EMAIL:STRING	CURSO:STRING
11111	Américo	Sousa	dse24@ua.pt	IBM
40210	Nune	Almeida	nuno@ua.al	CT
71922	António	Cross	ac@ua.pt
```
	O número de colunas(ou elementos separados por tab) na linha 4, não corresponde com o número de elementos descritos na primeira linha(cabeçalho)

7. `bdex-comp-02/examples/errors/n_funcional2.csv`
``` 	
NMEC:INT	FNAME:STRING	LNAME:STRING	EMAIL:STRING	CURSO:STRING
onze	Américo	Sousa	dse24@ua.pt	IBM
40210	Nune	Almeida	nuno@ua.al	CT
71922	António	Cross	ac@ua.pt	LEI
```
É impossível dar parse para int a partir de uma string.
	
	
Isto faz com que o visitor "Compiler" da linguagem primária receba um mapa null, devido à existência de erros.


    Compilador avisa que uma variável usada não foi definida.
    

...
