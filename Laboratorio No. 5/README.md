
### PARTE I. - JUGANDO A SER UN CLIENTE HTTP

Realice una conexión síncrona TCP/IP a través de Telnet/Netcat al siguiente servidor:

Host: www.escuelaing.edu.co
Puerto: 80
Teniendo en cuenta los parámetros del comando telnet:

telnet HOST PORT

Solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.

![https://github.com/YeSte114/CVDS_2210/edit/main/Laboratorio%20No.%205/README.md](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/telnetEscuing.png)

* ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

400 Bad Request indica que el servidor no puede o no procesará la petición debido a algo que es percibido como un error del cliente, tales como sintaxis de petición malformada, solicitud inválida de enmarcado de mensajes, o enrutamiento engañoso de peticiones.

* ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?

1. Códigos de estado 1xx. Son respuestas de carácter informativo e indican que el navegador puede continuar con la petición. Como no reflejan ningún error, no se muestran al usuario.
2. Códigos de estado 2xx. El conjunto de códigos de estado HTTP del tipo 2xx son respuestas satisfactorias, Simplemente indican que la petición fue procesada correctamente
3. Códigos de estado 3xx. Estos códigos indican que se está haciendo una redirección de una página a otra.
4. Códigos de estado 4XX: se refieren a errores de cliente. Suelen darse cuando la página que se carga no existe o se tiene el acceso bloqueado a ella.
5. Códigos de estado 5XX: se refieren a errores del servidor. Pueden generarse por un error en el código de la página web o dentro del propio servidor. 

* Realice una nueva conexión con telnet, esta vez a:

Host: www.httpbin.org
Puerto: 80
Versión HTTP: 1.1
Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?

![telnet2](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/telnet2.png)

* Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:

wc -c 

### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.

* Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:

mvn package
mvn tomcat7:run

![1](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/1.png)

*Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá como host ‘localhost’, como puerto, el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.
