package taller3.televisores;

public class TV {
	
	private static int numTV;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		canal=1;
		volumen=1;
		precio=500;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	static public int getNumTV() {
		return numTV;
	}
	static public void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	public void setCanal(int canal) {
		if (canal<121 && canal>0 && estado==true) {
				this.canal=canal;	}
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff(){
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if (canal<120) {
			if (estado==true) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if (canal>1) {
			if (estado==true) {
				canal--;
			}
		}
	}

	public void volumenUp() {
		if (volumen<7) {
			if (estado) {
				volumen++;
			}
		}
	}
	public void volumenDown() {
		if (volumen>0) {
			if (estado) {
				volumen--;
			}
		}
	}

	
}


