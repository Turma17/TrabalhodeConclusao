
#language: pt
@tag
Funcionalidade:testar funcionalidade de login no site com senha invalida

  @tag1
  Cenario: tentativa de login com senha invalida
    Dado que eu esteja no site "https://www.onlineshopdemo.co.uk"
    Quando clicar no botao de logar
    E inserir usuario valido
    E inserir senha invalida
    E clicar no botao de login
    Entao deve exibir mensagem de senha incorreta
      