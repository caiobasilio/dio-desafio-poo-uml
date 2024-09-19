# dio-desafio-poo-uml
Desafio UML trabalhando abstração.

![image](https://github.com/user-attachments/assets/48acf1d5-b615-4510-9b1c-64e894508b4a)

```
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    ReprodutorMusical --> iPhone
    AparelhoTelefonico --> iPhone
    NavegadorInternet --> iPhone

```  
