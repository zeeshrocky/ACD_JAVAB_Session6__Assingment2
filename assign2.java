abstract class Instrument{
	protected String name;  
	abstract void play();  
}  
  
abstract class StringedInstrument extends Instrument{  
	protected int numberOfStrings;
}


public class ElectricGuitar extends StringedInstrument{
	public ElectricGuitar() {
		super();
		this.name = "Guitar";
		this.numberOfStrings = 5;
	}
	@Override
	public void play() {
		System.out.println("A" + numberOfStrings + "-string " + name + " is playing");
	}

}

public class ElectricBassGuitar extends StringedInstrument{
	public ElectricBassGuitar() {
		super();
		this.name = "Bass Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	@Override
	public void play() {
		System.out.println("A" + numberOfStrings + "-string " + name + " is booming");
	}

}

class Start {
public static void main(String[] args) {
ElectricGuitar guitar = new ElectricGuitar();
ElectricBassGuitar bassGuitar =  new ElectricBassGuitar(5);
guitar.play();
bassGuitar.play();
}
}

