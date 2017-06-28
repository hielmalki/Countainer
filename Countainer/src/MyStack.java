public class MyStack extends MyAbstractCountainer{
	public MyStack(int capacity){
		super(capacity);
	}
	public void push(Object obj){
		try{
			if(capacity() > size()){
				throw new RuntimeException("Stack ist voll");
			} else {
				this._objs [this._objs.length - 1] = obj;
				this._size++;
			}
		} catch(Exception ex){
			System.out.print("Fehler in Push-Methode: " + ex.getMessage());
		}
	}
	public void pop(){
		if (this.size() == 0){
			throw new RuntimeException("Stack ist leer!");
		} else {
			this._objs [this._objs.length -1] = null;
			this._size = this.size() - 1;
		}
	}
	public static void main(String [] args){
		Auto a = new Auto("Audi a6", 50000, false, 40000);
		MyStack stack = new MyStack(5);
		stack.push(a);
		stack.pop();
		//stack.toString();
	}
}