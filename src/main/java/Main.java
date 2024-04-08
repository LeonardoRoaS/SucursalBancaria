public class Main {
    public static void main(String[] args) {

        GestionBanco banco = new GestionBanco();
        banco.agregarClientes(new Cliente("Leonardo"));
        banco.agregarClientes(new Cliente("Miguel"));
        banco.agregarSucursalBancaria(new SucursalBancaria(1, 1));
        banco.agregarSucursalBancaria(new SucursalBancaria(2, 2));

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1,1,"Leonardo",1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1,1,"Leonardo",1);
        banco.agregarCuentaBancaria(cuentaCorriente,"Leonardo",1);
        banco.agregarCuentaBancaria(cuentaAhorro,"Leonardo",1);
        banco.verCuentasCliente("Leonardo");




    }
}
