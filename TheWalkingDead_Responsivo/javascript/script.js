function  validarForm() {
    var msgP = "o campo está vazio!";

    const inputNome = document.getElementById("nome");
    const inputEmail = document.getElementById("email");
    const inputdtnascimento = document.getElementById("dtnascimento")
    const inputAssunto = document.getElementById("assunto")
    const inputDescrição = document.getElementById("descricao")

    if(inputNome.value == ""){
        inputNome.focus();
        mostraMensagemErro(msgP);
        return;
    }

    if(inputEmail.value == ""){
        inputEmail.focus();
        mostraMensagemErro(msgP);
        return;
    }

    if(inputdtnascimento.value == ""){
        inputdtnascimento.focus();
        mostraMensagemErro(msgP);
        return;
    }

    if(2023 -parseInt(inputdtnascimento.value) < 18){
        inputdtnascimento.focus();
        mostraMensagemErro()
    }

    if(inputAssunto.value == ""){
        inputAssunto.focus();
        mostraMensagemErro(msgP);
        return;
    }

    if(inputDescrição.value == ""){
        inputDescrição.focus();
        mostraMensagemErro(msgP);
        return;
    }

}

function mostraMensagemErro(mensagem){
    var estiloFormulario = document.getElementById("conteudoForm");
    estiloFormulario.style.backgroundColor = "tomato";
    var campoMSG = document.getElementById("mensagemErro");

    campoMSG.innerHTML = mensagem;
    campoMSG.style.display = "block";
}

function mostraMensagemSucesso(){
    var campoMSG = document.getElementById("mensagemSucesso");
    var campoMSGErro = document.getElementById("mensagemErro");
    campoMSGErro.style.display = "none";
    var estiloFormulario = document.getElementById("conteudoForm");
    estiloFormulario.style.backgroundColor = "h6f8848";

    campoMSG.style.display = "block";
}