package gusiatko.model;

import java.util.ArrayList;
import java.util.List;

public class Uzytkownik {
	private String login;
	private String haslo;
	private Osoba osoba;
	private List<Rola> role;

	public Uzytkownik() {
		role = new ArrayList<Rola>();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setRola(List<Rola> rola) {
		this.role = rola;
	}

	public List<Rola> getRola() {
		return role;
	}
	public void addRola(Rola rola){
		role.add(rola);
	}
	public boolean removeRola(Rola rola){
		return role.remove(rola);
	}

}
