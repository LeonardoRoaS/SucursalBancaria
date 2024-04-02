public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaAhorro(int numeroCuenta, double reajusteAnual, Cliente cliente, SucursalBancaria sucursalBancaria) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesCuenta() {
		throw new UnsupportedOperationException();
	}
}