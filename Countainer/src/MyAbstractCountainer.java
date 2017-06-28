public abstract class MyAbstractCountainer{
	protected Object [] _objs; // Ein Feld, indem wir verschiedene Objekte hinzufügen können.
	protected int _size; //Anzahl der gehaltenen Objekte
	
	public MyAbstractCountainer(int capacity){
		this._objs = new Object[capacity];
		this._size = 0;
	}
	public int capacity(){
		return this._objs.length;
	}
	public int size(){
		return this._size;
	}
	public Object get(int index){
		for(int i=0; i<this._objs.length; i++){
			if(i == index){
				return this._objs[index];
			}
		}
		return null;
	}
	public int find(Object obj){
		for(int i=0; i<this._objs.length; i++){
			if(this._objs [i] == obj){
				return i;
			}
		}
		return -1;
	}
	// public String toString(){
		// StringBuilder s = new StringBuilder();
		// s.append("Objektname: \n" + this.getClass().getName())
		// .append("Cap: %d, Size: %d", this.capacity(), this.size());
		// String str = (String) s;
		// return str;
	// }
	@Override
	public String toString (){
		String ausgabe;
		
		ausgabe = this.getClass().getName() + " (Cap: " + capacity() + ", Size: " + size() + "):" + "\n";
		for ( int i=0; i < size(); i++){ // i <= size() -1
			ausgabe += _objs[i].toString() + "\n";
			
		}
		return ausgabe; 
	}
}