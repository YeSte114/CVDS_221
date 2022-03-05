
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

![md](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/md.png)

* ¿Cuál es la diferencia entre los verbos GET y POST? 

La diferencia entre los métodos get y post radica en la forma de enviar los datos a la página cuando se pulsa el botón “Enviar”. Mientras que el método GET envía los datos usando la URL, el método POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).

* ¿Qué otros tipos de peticiones existen?

 GET
 El método GET  solicita una representación de un recurso específico. Las peticiones que usan el método GET sólo deben recuperar datos.

 HEAD
 El método HEAD pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta.

 POST
 El método POST se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.

 PUT
 El modo PUT reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

 DELETE
 El método DELETE borra un recurso en específico.

 CONNECT
 El método CONNECT establece un túnel hacia el servidor identificado por el recurso.

 OPTIONS
 El método OPTIONS es utilizado para describir las opciones de comunicación para el recurso de destino.

 TRACE
 El método TRACE  realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.

 PATCH
 El método PATCH  es utilizado para aplicar modificaciones parciales a un recurso.

* En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

curl www.httpbin.org
Utilice ahora el parámetro -v y con el parámetro -i:

curl -v www.httpbin.org

![-v](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/-v.png)

curl -i www.httpbin.org

![-i](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/-i.png)

¿Cuáles son las diferencias con los diferentes parámetros?
 curl -v: Este comando detallado le mostrará desde la conexión hasta los encabezados y los datos devueltos.
 curl -i: devuelve los encabezados http


### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.

* Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:

mvn package
mvn tomcat7:run

![1](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/1.png)

* Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá como host ‘localhost’, como puerto, el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.

![2](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/2.png)

* Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregando un parámetro GET (si no sabe como hacerlo, revise la documentación en http://www.w3schools.com/tags/ref_httpmethods.asp).

![3](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/3.png)

* En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.

![4](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/4.png)

![5](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/5.png)

![6](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/6.png)

### PARTE III.

* Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada. Ingrese los datos y verifique los resultados. Cambie el formulario para que ahora en lugar de POST, use el método GET . Qué diferencia observa?

Con método Post

![9](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/9.png)

Con método Get

![8](https://github.com/YeSte114/CVDS_2210/blob/main/Laboratorio%20No.%205/imagenes/8.png)


### PARTE IV.
