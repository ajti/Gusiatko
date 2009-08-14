package gusiatko.model;

import java.util.Date;

public class Osoba {
	private String imie;
	private String nazwisko;
	private Date dataUr;
	private Uzytkownik uzytkownik;

	public Osoba() {
		
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Date getDataUr() {
		return dataUr;
	}

	public void setDataUr(Date dataUr) {
		this.dataUr = dataUr;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}
}
