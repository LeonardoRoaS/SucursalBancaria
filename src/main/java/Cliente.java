import java.util.ArrayList;

public class Cliente {
	private String nombre;
	public ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	public GestionBanco banco;

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}
}