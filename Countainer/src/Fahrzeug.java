


public class Fahrzeug{
	protected String _name;
	protected float _kilometerstand;
	protected boolean _belegt = false;
	
	public Fahrzeug(String name, float kilometerstand, boolean belegt){
		this._name = name;
		this._kilometerstand = kilometerstand;
		this._belegt = belegt;
	}
	
	public String getName(){
		return this._name;
	}
	public float getKilometerstand(){
		return this._kilometerstand;
	}
	public boolean getBelegt(){
		return this._belegt;
	}
	public int maxReichweite(){
		return 0;
	}
	public void belege(){
		_belegt = true;
	}
	public void gebeFrei(float gefahreneKm){
		_belegt = false;
		gefahreneKm = getKilometerstand();
	}
	@Override
	public String toString(){
		String s = "Klassenname: " + this.getClass().getName() + " Km: " + getKilometerstand() + " Belegt: " + getBelegt();
		return s;
	}
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if((o instanceof Fahrzeug) == false){
			return false;
		}
		Fahrzeug f = (Fahrzeug) o;
		return this._name.equals(f._name) && this._kilometerstand == f._kilometerstand;
	}
	@Override
	public int hashCode(){
		return  _name.hashCode() + 10*(int)this._kilometerstand;
	}
	public static void main(String [] args){
		Fahrzeug f = new Fahrzeug("Audi A6", 50000, false);
		System.out.println(f.toString());
	}
	
}