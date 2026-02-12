package com.mycompany.practica;

import java.util.ArrayList;
import java.util.List;

// 4. Clase Principal con el método Main
public class EjercicioNotificaciones {

    public static void main(String[] args) {
        // Creamos la lista polimórfica
        List<Notificador> canales = new ArrayList<>();
        canales.add(new Email());
        canales.add(new WhatsApp());
        canales.add(new Email()); // Agregamos otro email para probar más casos

        // Mensaje de prueba (falla en Email porque no tiene '@')
        String mensajeAEnviar = "Clase de consulta hoy a las 18hs"; 

        System.out.println("--- INICIANDO SISTEMA DE NOTIFICACIONES ---\n");

        for (Notificador canal : canales) {
            try {
                // Polimorfismo: no sabemos qué implementación es, pero sabemos que tiene 'enviar'
                canal.enviar(mensajeAEnviar);
                
            } catch (ErrorDeEnvioException e) {
                // Manejo de la excepción específica de negocio
                System.err.println("⚠  ERROR CAPTURADO: " + e.getMessage());
                
            } catch (Exception e) {
                // Manejo genérico por seguridad
                System.err.println("⚠  ERROR DESCONOCIDO: " + e.getMessage());
            } finally {
                // Opcional: código que se ejecuta siempre (útil para explicar cleanup)
                // System.out.println("   (Intento finalizado para este canal)");
            }
        }
        
        System.out.println("\n--- PROCESO TERMINADO ---");
    }
}

