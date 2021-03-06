function exibirusuario(){
    var userstr = localStorage.getItem("userlogado");
    if(userstr == null)
    {
        window.location = "login.html";
    }    
    else{
        var userjson = JSON.parse(userstr);
        document.getElementById("foto").innerHTML =
        "<img width='50' height='50' src=imagens/" + userjson.foto + ">";

        document.getElementById("dados").innerHTML = 
        "<h4>" + userjson.nome + "<br>" 
        + userjson.email + "<br>ID: " + userjson.id + "</h4>";
    }
}

function logar(){
    var carta = {
        email:document.getElementById("txtemail").value,
        senha: document.getElementById("txtsenha").value
    };

    var envelope={
        method:"POST",
        body: JSON.stringify(carta),
        headers: {
            "Content-type": "application/json"
        }
    };

    fetch("http://localhost:8080/login", envelope)
    .then(res => res.json())
    .then(res => {
        localStorage.setItem("userlogado", JSON.stringify(res));
        window.location = "usuario.html";
    })
    .catch(err=>{
        window.alert("Não foi possível realizar o Login!");
    });
}