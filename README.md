# desafioPOO

---
## Modelagem e Diagramação de um Componente iPhone

```mermaid
classDiagram
iPhone --> ReprodutorMusical
iPhone --> AparelhoTelefonico
iPhone --> NavegadorInternet


  class ReprodutorMusical
  <<interface>> ReprodutorMusical 
  ReprodutorMusical : +tocar()
  ReprodutorMusical : +pausar()
  ReprodutorMusical : +selecionarMusica(String musica)

class AparelhoTelefonico
<<interface>> AparelhoTelefonico
AparelhoTelefonico : +ligar(String numero)
AparelhoTelefonico : +atender()
AparelhoTelefonico : +iniciarCorreioVoz()

class NavegadorInternet
<<interface>> NavegadorInternet
NavegadorInternet : +exibirPagina (String url)
NavegadorInternet : +adicionarNovaAba()
NavegadorInternet : +atualizarPagina()

class iPhone


```
