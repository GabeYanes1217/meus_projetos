// Variáveis para armazenar o elemento do botão e do campo de texto
let botao = document.getElementById("botao");
let texto = document.getElementById("texto");

// Adicionando um ouvinte de evento ao botão
botao.addEventListener("click", function() {
  texto.innerHTML = "Hello World!";
  
  // Exibindo nome no console
  console.log("Gabriel Yanes");

  // Exibindo RM em um alerta
  window.alert("550324");
});