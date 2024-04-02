import java.util.ArrayList;

public class SucursalBancaria {
	private int codigoSucursal;
	private int codigoPostal;
	public GestionBanco banco;
	public ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public SucursalBancaria(int codigoSucursal, int codigoPostal) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
	}
}