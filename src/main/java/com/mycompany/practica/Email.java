package com.mycompany.practica;

//3. Implementacion 1 : validacion logica de Email
public class Email implements Notificador {
    @Override
    public void enviar(String mensaje) throws ErrorDeEnvioException {
        // Validamos una regla de negocio simple: debe tener arroba
        if (!mensaje.contains("@")) {
            throw new ErrorDeEnvioException("FALLO EMAIL: Formato inválido (falta '@').");
        }
        System.out.println("✅ [Email] Enviado correctamente: " + mensaje);
    }
}
