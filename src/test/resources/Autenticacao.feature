Feature: Autenticacao do Usuario

Scenario: Preencher credenciais de acesso
  
  Given que estou na pagina de autenticacao
  When preencho o campo "username" com "admin"
  And identifico o campo "password" e utilizo "admin"
  And clico no botao
  Then vejo a mensagem de sucesso contendo "Bem vindo ao Desafio"

