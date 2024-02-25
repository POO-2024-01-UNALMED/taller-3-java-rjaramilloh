package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public static void numTV() {
		numTV++;
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal < 120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (canal > 1) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (volumen < 7) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen > 0) {
			volumen--;
		}
	}
	
	public void getMarca() {
		marca.getNombre();
	}
	
	public void setMarca(String marca) {
		this.marca.setNombre(marca);
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (1<=canal && canal<=120) {
			this.canal = canal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		if (0<=volumen && volumen<=7) {
			this.volumen = volumen;
		}
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
}
