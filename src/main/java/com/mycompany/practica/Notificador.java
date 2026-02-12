package com.mycompany.practica;

//2.intefaz (el contrato)
interface Notificador {
    void enviar(String mensaje) throws ErrorDeEnvioException;
}
