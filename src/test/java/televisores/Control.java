package televisores;

public class Control {
	TV tv;
	
	
	public void setCanal(int canal) {
		tv.setCanal(canal);	
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff(){
		tv.turnOff();
	}

	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public TV getTV(){
		return tv;
	}
	public void setTV(TV tv) {
		this.tv=tv;
	}
	}
