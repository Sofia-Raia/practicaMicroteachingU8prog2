package com.mycompany.practica;

// 3. Implementación 2: Simulación de Fallo de Red (WhatsApp)
public class WhatsApp implements Notificador{
    @Override
    public void enviar(String mensaje) throws ErrorDeEnvioException {
        // Simulamos inestabilidad: 30% de probabilidad de fallo
        if (Math.random() < 0.3) {
            throw new ErrorDeEnvioException("FALLO WHATSAPP: El servidor no responde (Time out).");
        }
        System.out.println("✅ [WhatsApp] Enviado correctamente: " + mensaje);
    }
}
