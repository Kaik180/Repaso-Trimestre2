package org.example.PruebasUnitarias;


interface RepositorioBanco {
    double obtenerSaldo(String cuenta);
    void actualizarSaldo(String cuenta, double nuevoSaldo);
}

// Punto 5: Implementación de BancoService (contiene la lógica del Punto 3)
class BancoService {
    private final RepositorioBanco repositorio;

    public BancoService(RepositorioBanco repositorio) {
        this.repositorio = repositorio;
    }

    public void depositar(String cuenta, double monto) {
        double saldoActual = repositorio.obtenerSaldo(cuenta);
        repositorio.actualizarSaldo(cuenta, saldoActual + monto);
    }

    public void retirar(String cuenta, double monto) {
        double saldoActual = repositorio.obtenerSaldo(cuenta);
        if (monto > saldoActual) {
            throw new RuntimeException("Fondos insuficientes");
        }
        repositorio.actualizarSaldo(cuenta, saldoActual - monto);
    }

    public double consultarSaldo(String cuenta) {
        return repositorio.obtenerSaldo(cuenta);
    }
}
