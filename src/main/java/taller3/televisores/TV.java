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
		numTV+=1;
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
	public int getNumTV() {
		return numTV;
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
		this.canal=canal;	
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
			if (estado) {
				canal++;
			}
		}
	}
	public void canalDown() {
		if (canal>1) {
			if (estado) {
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

