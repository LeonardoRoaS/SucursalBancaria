import java.util.ArrayList;

public class GestionBanco {
	public ArrayList<SucursalBancaria> sucursalesBancarias = new ArrayList<SucursalBancaria>();
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public ArrayList<SucursalBancaria> getSucursalesBancarias() {
		return sucursalesBancarias;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void agregarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		throw new UnsupportedOperationException()	;
	}

	public void verCuentasCliente() {
		throw new UnsupportedOperationException();
	}

	public void obtenerCuentasAhorro() {
		throw new UnsupportedOperationException();
	}

	public void obtenerCuentasCorriente() {
		throw new UnsupportedOperationException();
	}
}