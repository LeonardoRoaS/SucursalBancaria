import java.util.Date;

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

	public SucursalBancaria getSucursal() {
		return sucursal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public CuentaBancaria(int numeroCuenta, Cliente cliente, SucursalBancaria sucursalBancaria) {
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = new Date();
		this.saldo = 0;
		this.cliente = cliente;
		this.sucursal = sucursalBancaria;
	}
}