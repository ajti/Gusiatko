package gusiatko.model;

import java.util.ArrayList;
import java.util.List;

public class Rola {
	private String nazwa;
	private List<Uprawnienie> uprawnienia;

	public Rola() {
		uprawnienia = new ArrayList<Uprawnienie>();
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setUprawnienie(List<Uprawnienie> uprawnienie) {
		this.uprawnienia = uprawnienie;
	}

	public List<Uprawnienie> getUprawnienie() {
		return uprawnienia;
	}
	
	public void addUprawnienie(Uprawnienie upr){
		uprawnienia.add(upr);
	}
	
	public boolean removeUprawnienie(Uprawnienie upr){
		return uprawnienia.remove(upr);
	}

}
