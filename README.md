<h1> Nome dos integrantes: Danilo Garcia e Isabele Timotio </h1>
<h1> Aplicativo God Of War </h1>
<br>
<h2> Introdução </h2>
<br>
<p> Neste trabalho desenvolvemos um aplicativo estático como se fosse um "livro" de informações 
sobre o jogo <strong> God Of War</strong>. </p>
<p> Nele consiste quatro aplicações obrigatórias que foram utilizadas, sendo elas: </p>
<ul><li> 
Mínimo de 05 Activities distintas (dados e componentes de tela);
</li></ul>
<ul><li>
Cada Activity tem pelo menos 04 Views (elementos) distintas;
</li></ul>
<ul><li>
Utilizado Intents Explicitas com envio de informações para navegação;
</li></ul>
<ul><li>
Existem dentro do app pelo menos 03 Intents Implícitas distintas (em qualquer ponto da aplicação);
</li></ul>
<br>

<h2> Tela inicial </h2>
<p> <strong>Explicação do layout:</strong> na tela inicial temos quatro botões (button), uma imagem de fundo (ImageView) e
o nome do aplicativo (TextView). </p>
<p><strong> Como funciona o código: </strong></p>
<ul> <li> 
<strong> Declaração dos botões: </strong> São declarados quatro objetos do tipo Button para representar os botões na interface do usuário;
</li></ul>
<ul> <li> 
<strong>  Método onCreate(): </strong> Esse método é chamado quando a atividade é criada. Nele, são realizadas as seguintes ações:
 <ul><li> Chamada do método onCreate() da superclasse para executar a lógica básica de criação da atividade. </ul></li>
 <ul><li> Definição do layout da atividade usando o método setContentView(). </ul></li>
 <ul><li> Associação dos objetos Button aos botões correspondentes no layout usando o método findViewById().  </ul></li>
 <ul><li> Definição dos listeners de clique para cada botão. Quando um botão é clicado, um método correspondente é chamado.  </ul></li>
</li></ul>
<ul><li>
  <strong> Métodos para abrir atividades:</strong> Existem quatro métodos (openActivity2, openActivity3, openActivity4, openActivity5) que são chamados quando 
  os botões são clicados. Cada um desses métodos cria um objeto Intent que representa a intenção de abrir uma determinada atividade e, em seguida, 
  chama o método startActivity() para iniciar a atividade correspondente.
</li></ul>
<br>

<h2> Tela da história </h2>
<p><strong> Explicação do layout: </strong> nesta tela optamos por deixar mais simples tendo apenas a sinopse do jogo (TextView) e dois botões (butonn), sendo um para
ir a próxima tela e o outro para voltar ao menu. </p>
<p><strong> Como funciona o código: </strong></p>
<ul> <li> 
<strong> Declaração dos botões: </strong> São declarados quatro objetos do tipo Button para representar os botões na interface do usuário;
</li></ul>
<ul> <li> 
<strong>  Método onCreate(): </strong> Esse método é chamado quando a atividade é criada. Nele, são realizadas as seguintes ações:
 <ul><li> Chamada do método onCreate() da superclasse para executar a lógica básica de criação da atividade. </ul></li>
 <ul><li> Definição do layout da atividade usando o método setContentView(). </ul></li>
 <ul><li> Associação dos objetos Button aos botões correspondentes no layout usando o método findViewById().  </ul></li>
 <ul><li> Definição dos listeners de clique para cada botão. Quando um botão é clicado, um método correspondente é chamado.  </ul></li>
</li></ul>
<ul><li>
<strong> Métodos para abrir atividades: </strong> Existem dois métodos (openMenuActivity, openNextActivity) que são chamados quando os botões são clicados. Cada um desses 
  métodos cria um objeto Intent que representa a intenção de abrir uma determinada atividade e, em seguida, chama o método startActivity() para iniciar a atividade correspondente.
</li></ul>
<br>

<h2> Tela dos personagens </h2>
<p><strong> Explicação do layout: </strong> como podemos ver aqui temos alguns personagens do jogo sendo apresentados (ImageView) e como na tela anterior dois botões (button) sendo
um para ir a próximoa tela e outro para voltar ao menu.</p>
<p><strong> Como funciona o código: </strong></p>
