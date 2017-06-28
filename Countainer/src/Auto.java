public class Auto extends Fahrzeug implements IKraftstoffFahrzeug{

	int _kmLetzteInspekt;

	public Auto(String name, float kilometerstand, boolean belegt, int kmLetzteInspekt){
		super(name, kilometerstand, belegt);
		this._kmLetzteInspekt = kmLetzteInspekt;
	}
	@Override
	public int maxReichweite(){
		return 700;
	}
	public boolean brauchtInspektion(){
		if(this._kilometerstand < this._kmLetzteInspekt){
			throw new RuntimeException("Kilometerstand muss groeser als Kilomerterletzerinpektions");
		}
		if(this._kilometerstand - this._kmLetzteInspekt <= 20000){
			System.out.println("Inspektion muss noch nicht durchgefuehrt werden");
			return false;
		} else {
			System.out.println("Inspektion muss durchgefuehrt werden");
			return true;
		}
	}
	public void inspektionDurchgefuehrt(){
		System.out.println("Inspektion wurde durchgefuehrt");
		this._kmLetzteInspekt = (int)this._kilometerstand;
	}
	@Override
	public String toString(){
		return super.toString() + " KmLI: " + this._kmLetzteInspekt;
	}
	public static void main (String [] args){
		Auto a = new Auto("Audi a6", 100000f, false, 77000);
		
		
		if(a.brauchtInspektion() == true){
			a.inspektionDurchgefuehrt();
		}
		
		System.out.println(a.toString());
	}
}