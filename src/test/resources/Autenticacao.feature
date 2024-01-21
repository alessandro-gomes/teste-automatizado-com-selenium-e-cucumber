#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Autenticacao do Usuario

Scenario: Preencher credenciais de acesso
  
  Given que estou na pagina de autenticacao
  When preencho o campo "username" com "admin"
  And identifico o campo "password" e utilizo "admin"
  And clico no botao
  Then vejo a mensagem de sucesso contendo "Bem vindo ao Desafio"

