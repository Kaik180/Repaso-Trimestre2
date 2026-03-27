package org.example.PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

class BancoServiceTest {

    @Test
    void testFlujoCompletoBanco() {
        RepositorioBanco repoMock = mock(RepositorioBanco.class);
        BancoService service = new BancoService(repoMock);

        String nroCuenta = "123-ABC";

        when(repoMock.obtenerSaldo(nroCuenta)).thenReturn(100.0);
        service.depositar(nroCuenta, 50.0);

        verify(repoMock).actualizarSaldo(nroCuenta, 150.0);

        doThrow(new RuntimeException("Error de DB")).when(repoMock).actualizarSaldo(anyString(), anyDouble());

        assertThrows(RuntimeException.class, () -> {
            service.depositar(nroCuenta, 10.0);
        });

        reset(repoMock);
        when(repoMock.obtenerSaldo(nroCuenta)).thenReturn(100.0).thenReturn(200.0);

        assertEquals(100.0, service.consultarSaldo(nroCuenta));
        assertEquals(200.0, service.consultarSaldo(nroCuenta));

        reset(repoMock);
        when(repoMock.obtenerSaldo(nroCuenta)).thenReturn(500.0);

        service.retirar(nroCuenta, 100.0);

        InOrder inOrder = inOrder(repoMock);

        inOrder.verify(repoMock).obtenerSaldo(nroCuenta);
        inOrder.verify(repoMock).actualizarSaldo(nroCuenta, 400.0);
    }
}