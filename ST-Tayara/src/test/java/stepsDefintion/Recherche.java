package stepsDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Recherche {
	@Given("Acceder au site de Tayara")
	public void acceder_au_site_de_tayara() {
	  System.out.println("step 1");
	    throw new io.cucumber.java.PendingException();
	}

	@When("Cliquer sur Connexion\\/Inscription")
	public void cliquer_sur_connexion_inscription() {

		System.out.println("step 12");// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Taper son identifiant \\(user name \\/ numero de telephone \\/ email)")
	public void taper_son_identifiant_user_name_numero_de_telephone_email() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 3");
	    throw new io.cucumber.java.PendingException();
	}

	@When("Cliquer sur Suivant")
	public void cliquer_sur_suivant() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 14");
	    throw new io.cucumber.java.PendingException();
	}

	@When("Taper son mot de pass")
	public void taper_son_mot_de_pass() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 15");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("se connecter a son compte utilisateur")
	public void se_connecter_a_son_compte_utilisateur() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 6");
	    throw new io.cucumber.java.PendingException();
	}

}
