import java.util.ArrayList;
import java.util.List;

public class GestionBanco {
	public ArrayList<SucursalBancaria> sucursalesBancarias = new ArrayList<SucursalBancaria>();
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public GestionBanco(){
		this.clientes = new ArrayList<Cliente>();
		this.sucursalesBancarias = new Arraylist<SucursalBancaria>();
	}

	public ArrayList<SucursalBancaria> getSucursalesBancarias() {
		return sucursalesBancarias;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void agregarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarSucursalBancaria(SucursalBancaria sucursalBancaria){
		this.sucursalesBancarias.add(sucursalBancaria);
	}

	public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria) {
		throw new UnsupportedOperationException();
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