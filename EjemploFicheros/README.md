# EjemploFicheros

## Flujo:
  Es un canal de comunicación entre las operaciones de entrada y salida. Ejemplo: Teclado -> Pantalla // App -> Almacenamiento de ficheros

  Usaremos sockers, que envian la información de uno a otro. Si queremos una conexion bidireccional, necesitaremos dos (de A a B y de B a A)

  ### Tipos de flujo:

  | Tipos | Bites | Caracteres |
  | ------------- | ------------- | -------- |
  | Entrada  | Entrada Bytes  | Entrada Caracteres |
  | Salida  | Salida Bites  | Salida Caracteres |

  Asi, los patrones de salida se abren, se usan y se cierran. Es decir:
      -Abrimos el flujo
      -Insertamos lo que queremos enviar
      -Cerramos el flujo

  El más usado es el "OutputStream".

  Dentro de este, cada flujo de salida tiene su utilidad.
  - Si queremos escribir directamente en un fichero, usaremos el ObjectOutputStream.
  - Para escribirlo en memoria, usaremos el ByteArrayOutputStream

## Flujos hacia otros flujos

  Usaremos FileOutputStream para ello, pues tiene un constructor que acepta una ruta para ello. Así, podemos llegar a escribir Arrays de Bites en un fichero.
