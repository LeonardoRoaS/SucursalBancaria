import java.util.ArrayList;
import java.util.List;

public class GestionBanco {
	public ArrayList<SucursalBancaria> sucursalesBancarias = new ArrayList<SucursalBancaria>();
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public GestionBanco(){
		this.clientes = new ArrayList<Cliente>();
		this.sucursalesBancarias = new ArrayList<SucursalBancaria>();
	}

	public ArrayList<SucursalBancaria> getSucursalesBancarias() {
		return sucursalesBancarias;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void agregarClientes(Cliente cliente) {
		//Agregando cliente
		this.clientes.add(cliente);
	}

	public void agregarSucursalBancaria(SucursalBancaria sucursalBancaria){
		//Agregando sucursal
		this.sucursalesBancarias.add(sucursalBancaria);
	}

	public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria, Cliente cliente, SucursalBancaria sucursalBancaria) {
		//agrego una cuenta al cliente
		cliente.getCuentasBancarias().add(cuentaBancaria);

		//agrego la cuenta bancaria a una sucursal del banco
		sucursalBancaria.getCuentasBancarias().add(cuentaBancaria);
	}

	public void verCuentasCliente(Cliente cliente) {
		//Se muestra las cuentas bancarias del cliente asociado
		for (CuentaBancaria cuentaBancaria : cliente.getCuentasBancarias()){
			cuentaBancaria.mostrarDetallesCuenta();
		}
	}

	public void obtenerCuentasAhorro(SucursalBancaria sucursalBancaria) {
		System.out.println("Cuentas Ahorro: ");
		for(CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentasBancarias()){
			if (cuentaBancaria.getTipo().equalsIgnoreCase("Cuenta Ahorro")){
				cuentaBancaria.mostrarDetallesCuenta();
			}
		}
	}

	public void obtenerCuentasCorriente(SucursalBancaria sucursalBancaria) {
		System.out.println("Cuentas Corriente: ");
		for (CuentaBancaria cuentaBancaria : sucursalBancaria.getCuentasBancarias()){
			if (cuentaBancaria.getTipo().equalsIgnoreCase("Cuenta Corriente")){
				cuentaBancaria.mostrarDetallesCuenta();
			}
		}
	}

	public Cliente buscarCliente(String nombre){
		//Buscar cliente por nombre y regresar el Cliente
		for (Cliente cliente : this.clientes){
			if (cliente.getNombre().equalsIgnoreCase(nombre)){
				return cliente;
			}
		}
		return null;
	}

}