Feature: Chercher un produit sur le site de Tayara
  
  Scenario: Se connecter a son compte Tayara
    
    Given Acceder au site de Tayara
    When Cliquer sur Connexion/Inscription
    And Taper son identifiant (user name / numero de telephone / email)
     And Cliquer sur Suivant
    And Taper son mot de pass
    And Cliquer sur Suivant
    Then se connecter a son compte utilisateur
    