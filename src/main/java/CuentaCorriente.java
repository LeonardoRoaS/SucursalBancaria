public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public String getTipo() {
		return "Cuenta Corriente";
	}

	public CuentaCorriente(int numeroCuenta, int lineaSobregiro, Cliente cliente, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta, cliente, sucursalBancaria);
		this.lineaSobregiro = lineaSobregiro;
	}

	public void mostrarDetallesCuenta() {
		String detalleCuenta = "Cliente: "+super.getCliente().getNombre()+", "+this.getTipo()+" |Numero Cuenta: "+super.getNumeroCuenta()+" |Saldo: "+super.getSaldo()+" |Linea sobregiro: "+this.lineaSobregiro;
		System.out.println(detalleCuenta);
	}
}