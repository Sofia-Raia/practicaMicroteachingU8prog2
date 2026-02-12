# # Consignas: # # 
Ejercicio Rápido: "Sistema de Notificaciones Críticas"
Tiempo: 20 min Objetivo: Crear un sistema polimórfico de alertas donde algunos canales pueden fallar, obligando a manejar la excepción para no detener el envío masivo.
Enunciado:
1.	La Excepción: Crea una excepción chequeada (checked) llamada ErrorDeEnvioException.
2.	El Contrato: Crea una interfaz Notificador con el método:
o	void enviar(String mensaje) throws ErrorDeEnvioException;
3.	Las Implementaciones:
o	Clase Email: Implementa Notificador. En su método enviar, verifica si el mensaje contiene el símbolo "@". Si NO lo tiene, lanza la excepción con el mensaje "Formato de correo inválido". Si lo tiene, imprime "Email enviado".
o	Clase WhatsApp: Implementa Notificador. Simula una conexión inestable: usa Math.random(). Si el número es mayor a 0.7 (30% de probabilidad), lanza la excepción con "El servicio de Meta está caído". Si no, imprime "WhatsApp enviado".
4.	Prueba (Main):
o	Crea una List<Notificador> con una instancia de cada uno.
o	Recorre la lista intentando enviar el mensaje: "Hola alumnos".
o	Requisito clave: Usa un try-catch dentro del bucle. Si un notificador falla, atrapa la excepción, muestra el error (e.getMessage()) y permite que el siguiente notificador intente enviar.
