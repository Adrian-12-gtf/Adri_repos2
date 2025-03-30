#Proyecto: Sistema de Inventario y Jugador

Este proyecto contiene clases para manejar un sistema de inventario de productos y un sistema de salud para un jugador en un juego. A continuación, se describen los métodos implementados. enlace al proyecto:

#Clases y Métodos

Inventario (Gestión de productos)

"añadirProducto(Producto producto)" → Agrega un producto al inventario.

"eliminarProducto(String codigo)" → Elimina un producto según su código.

"buscarProductoPorCodigo(String codigo)" → Busca un producto en el inventario por su código.

"actualizarStock(String codigo, int nuevoStock)" → Actualiza la cantidad de stock de un producto.

"listarProductos()" → Devuelve una lista con todos los productos en el inventario.


#Pruebas en JUnit 5

Se han implementado pruebas unitarias para la clase Inventario, asegurando el correcto funcionamiento de los métodos mediante:

"assertEquals" para validar valores esperados.

"assertNotNull" para verificar que los productos existen tras ser añadidos.

"assertNull" para confirmar que los productos eliminados no están en el inventario.


#Subida al github

Para efectuar la subida del proyecto a GitHub, primero tuve que crearme una cuenta en la plataforma. Tras completar este paso, generé un nuevo repositorio donde cargué la práctica. Una vez creado el repositorio en GitHub, la plataforma proporciona una URL que se emplea para enlazar mi repositorio local con el repositorio remoto.

El siguiente paso que llevé a cabo fue descargar Git para poder inicializar mi repositorio local. Los comandos que me han sido útiles para la práctica son:

"git clone:" para copiar el repositorio del profesor.

"git init:" para inicializar la carpeta donde almaceno el proyecto y gestionar su seguimiento.

"git remote add origin (URL de mi repositorio):" para conectar mi repositorio remoto con el repositorio local.

"git add .:" para añadir todos los archivos modificados al "staging area" (o área de preparación).

"git commit -m "Comentario para describir el cambio realizado":" para confirmar todos los cambios efectuados.

"git push -u origin main:" para enviarlo al repositorio remoto en la rama principal del proyecto.

