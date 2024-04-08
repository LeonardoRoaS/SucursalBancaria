public class Main {
    public static void main(String[] args) {

        GestionBanco banco = new GestionBanco();
        banco.agregarClientes(new Cliente("Leonardo"));
        banco.agregarClientes(new Cliente("Miguel"));
        banco.agregarSucursalBancaria(new SucursalBancaria(1, 1));

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1,1,banco.buscarCliente("Leonardo"),banco.getSucursalesBancarias().get(0));
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1,1,banco.buscarCliente("Leonardo"),banco.getSucursalesBancarias().get(0));
        banco.agregarCuentaBancaria(cuentaCorriente,banco.buscarCliente("Leonardo"),banco.getSucursalesBancarias().get(0));
        banco.agregarCuentaBancaria(cuentaAhorro,banco.buscarCliente("Leonardo"),banco.getSucursalesBancarias().get(0));
        banco.verCuentasCliente(banco.buscarCliente("Leonardo"));

        banco.obtenerCuentasAhorro(banco.getSucursalesBancarias().get(0));




    }
}
