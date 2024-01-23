#Author:brahim
Feature: Consultations des menus du home page

  Background: 
    Given Utilisateur est connecte avec le bon userName "Admin" et le bon password "admin123"

  Scenario Outline: acceder aux page de chaque menu de la page home
    When utilisateur clique sur le menu "<menu>"
    Then la page de menu est affichée "<menu>"

    Examples: 
      | menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
