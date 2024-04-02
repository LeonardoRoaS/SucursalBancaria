public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaAhorro(int numeroCuenta, double reajusteAnual, Cliente cliente, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta, cliente, sucursalBancaria);
		this.reajusteAnual = reajusteAnual;
	}

	public String getTipo() {
		return "Cuenta Ahorro";
	}

	public void mostrarDetallesCuenta() {
		String detalleCuenta = "Cliente :"+super.getCliente().getNombre()+" "+this.getTipo()+" Numero Cuenta: "+super.getNumeroCuenta()+" Sueldo: "+super.getSaldo()+" Reajuste: "+this.getReajusteAnual();
		System.out.println(detalleCuenta);
	}
}