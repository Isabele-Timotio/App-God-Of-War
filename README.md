<h1> Nome dos integrantes: Danilo Garcia e Isabele Timotio </h1>
<h1> Aplicativo God Of War </h1>
<br>
<h2> Introdução </h2>
Neste trabalho desenvolvemos um aplicativo estático como se fosse um "livro" de informações 
sobre o jogo <strong> God Of War</strong>.
Nele consiste quatro aplicações obrigatórias que foram utilizadas, sendo elas:
<br>
<br>
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
<p> <strong>Explicação do layout:</strong> na tela inicial temos quatro botões (button), uma imagem de fundo (ImageView),
o nome do aplicativo e mais um link para a música (2 TextView). </p>
![image](https://github.com/Isabele-Timotio/App-God-Of-War/assets/101645908/21214ac6-ad45-4f79-a81e-8e36810fe93c)

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
<p><strong> Explicação do layout: </strong> nesta tela optamos por deixar mais simples tendo apenas a sinopse do jogo, o link para conhecer um elemento do jogo (3 TextView) e dois botões (butonn), sendo um para
ir a próxima tela e o outro para voltar ao menu. </p>
![image](https://github.com/Isabele-Timotio/App-God-Of-War/assets/101645908/7adceaf4-8b47-46fc-8e37-172eb083bbeb)

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
<p><strong> Explicação do layout: </strong> como podemos ver aqui temos alguns personagens do jogo sendo apresentados (12 ImageView) e como na tela anteriores dois botões (button) sendo
um para ir a próximoa tela e outro para voltar ao menu.</p>
![image](https://github.com/Isabele-Timotio/App-God-Of-War/assets/101645908/d083e00b-103b-4f43-ac28-0961402a3e65)

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

<h2> Tela de armas </h2>
<p><strong> Explicação do layout: </strong>  aqui obtemos três imagens das armas do jogos, sendo elas as mais importantes. Todas são ImageView e contemos como nas telas anteriores 
 dois botões (button) sendo um para ir a próximoa tela e outro para voltar ao menu. </p>
 ![image](https://github.com/Isabele-Timotio/App-God-Of-War/assets/101645908/6b9abaab-47de-4dd4-93fe-8d4cfc4fae54)

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

<h2> Tela de mensagem </h2>
<p><strong> Explicação do layout: </strong> e por último temos a tela da mensagem final que queríamos deixar ao usuário sobre o jogo. Contento o TextView para a escrita desta mensagem e o link para
 ver uma cena do jogo e um único botão (button) para voltar desde o começo do app. </p>
![image](https://github.com/Isabele-Timotio/App-God-Of-War/assets/101645908/8485ba05-240b-4aa9-8070-0cc22e0a7f02)

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
<strong> Métodos para abrir atividades: </strong> Existe um método (openMenuActivity) que é chamado quando o botão é clicado. Esse método cria um objeto Intent que representa
 a intenção de abrir a atividade principal (MainActivity) e, em seguida, chama o método startActivity() para iniciar essa atividade.
</li></ul>
<br>

<h2> Sobre a intent explicita </h2>
<p> Para trazer uma imersão maior dentro do aplicativo escolhemos como uma <strong> Intents Explicitas </strong> uma música relacionada ao tema que escolhemos e duas cenas do jogo. Ela foi aplicada como uma string
sendo também possivél clicar nela. </p>
<p><strong> Como funciona o código: </strong></p>
<p> A string possui o nome "link" e o valor é o seguinte texto:
"Clique <a href = "https://www.youtube.com/watch?v=V5Ar0dKnl6Y"> aqui </a> para ouvir a trilha sonora do jogo"
Dentro do texto, há uma tag HTML <a> que envolve a palavra "aqui". Essa tag <a> define um hiperlink. O atributo href contém o endereço URL para onde o link deve redirecionar, que é "https://www.youtube.com/watch?v=V5Ar0dKnl6Y". Na aplicação, o link está definido para redirecionar para um vídeo no YouTube que representa a trilha sonora do jogo.
Ao utilizar essa string em um aplicativo Android, ela pode ser processada e exibida em uma interface do usuário que suporta renderização de HTML, como um TextView com a propriedade android:autoLink="web" definida. Isso permitiria que o usuário clicasse no link "aqui" para acessar o vídeo da trilha sonora do jogo no YouTube.</p>
