
**¿Cuál es su mayor utilidad?**

Maven es una herramienta open-source quesimplificar los procesos de build (compilar y generar ejecutables a partir del código fuente).

**Fases de maven**

- validate- validar que el proyecto sea correcto y que toda la información necesaria esté disponible
- compile- compilar el código fuente del proyecto
- test- probar el código fuente compilado utilizando un marco de prueba de unidad adecuado. Estas pruebas no deberían requerir que el código sea empaquetado o implementado.
- package- tomar el código compilado y empaquetarlo en su formato distribuible, como un JAR.
- verify- ejecutar cualquier verificación de los resultados de las pruebas de integración para garantizar que se cumplan los criterios de calidad
- install- instalar el paquete en el repositorio local, para usarlo como dependencia en otros proyectos localmente
- deploy- Realizado en el entorno de compilación, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.

**Ciclo de vida de la construcción**

- El ciclo de vida default, que gestiona la construcción y despliegue del proyecto.
- El ciclo de vida clean, que gestiona la limpieza del directorio del proyecto. Es decir, se encarga de eliminar todos los archivos generados en el proceso de construcción y despliegue.
- El ciclo de vida site, que gestiona la creación de la documentación del proyecto.

**¿Para qué sirven los plugins?**

Un Plugin es un fragmento o componente de código hecho para ampliar las funciones de un programa o de una herramienta.

**¿Qué es y para qué sirve el repositorio central de maven?**

El repositorio central de Maven es la ubicación predeterminada para que Maven descargue todas las bibliotecas de dependencia del proyecto para su uso. Para cualquier biblioteca involucrada en el proyecto, Maven primero busca en la carpeta .m2 del Repositorio local, y si no encuentra la biblioteca necesaria, busca en el Repositorio central y carga la biblioteca en el repositorio local.


Sin parámetros
Parámetro: qwerty
Parámetro: pentagon
Parámetro Hexagon

**¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?**

La unica instrucción que se ejecuta y funciona correctamente es Hexagon debido a que corresponde a uno de los parametros disponibles.

**para que sirve gitignore y cómo se usa**

gitnore es un fichero que se añade a la raíz de un proyecto en el que se indica, por medio de expresiones regulares, qué ficheros no hay que tener en cuenta para el control de versiones.

Para crear un archivo .gitignore local, crea un archivo de texto y asígnale el nombre ".gitignore" (recuerda incluir el . al principio). Luego, edita este archivo según sea necesario. 
- * se utiliza como una coincidencia comodín.
- / se usa para ignorar las rutas relativas al archivo .gitignore.
- (#) es usado para agregar comentarios
