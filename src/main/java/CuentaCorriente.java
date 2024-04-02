public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public CuentaCorriente(int numeroCuenta, int lineaSobregiro, Cliente cliente, SucursalBancaria sucursalBancaria) {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesCuenta() {
		throw new UnsupportedOperationException();
	}
}