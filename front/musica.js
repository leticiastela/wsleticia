function filtrar(){
    fetch("http://localhost:8080/intervalo/" + 
    document.getElementById("txtdatainicial").value +
     "/" + document.getElementById("txtdatafinal").value)
     .then(res=>res.json())
     .then(res=>{
         var tabela = 
         "<table class='table' border = '1' align='center' width='80%'>" +
            "<tr>" +
                "<th> Música</th>" +
                "<th> Artista</th>" +
                "<th> Cadastro</th>" +
            "</tr>";
           for(cont = 0; cont<res.length; cont++)
           {
               tabela +=
               "<tr>" +
                    "<td>" + res[cont].titulo + "</td>" +
                    "<td>" + res[cont].artista.nomeArtistico + "</td>" +
                    "<td>" + res[cont].cadastro + "</td>" +
                "</tr>"

           }
            tabela +="</table>";
            document.getElementById("resultado").innerHTML = tabela;
     })
     .catch( err=> {
         window.alert("Música não encontrada!");
     });
}