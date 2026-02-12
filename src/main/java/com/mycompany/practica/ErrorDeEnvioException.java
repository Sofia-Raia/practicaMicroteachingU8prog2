package com.mycompany.practica;

// 1. Excepción Personalizada (Checked Exception)
class ErrorDeEnvioException extends Exception {
    public ErrorDeEnvioException(String mensaje) {
        super(mensaje);
    }
}


