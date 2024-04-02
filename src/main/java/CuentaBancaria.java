public abstract class CuentaBancaria {
	private int numeroCuenta;
	private Date fechaApertura;
	private int saldo;
	public SucursalBancaria sucursal;
	public Cliente cliente;

	public abstract String getTipo();

	public abstract void mostrarDetallesCuenta();

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria(int numeroCuenta, Cliente cliente, SucursalBancaria sucursalBancaria) {
		throw new UnsupportedOperationException();
	}
}