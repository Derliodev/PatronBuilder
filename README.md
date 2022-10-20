## Patron Builder

Builder nos permite centralizar el proceso de creación de objetos en un único punto abstracto, de tal forma que este punto pueda crear representaciones diferentes. Lo ejemplificaremos creando una pizza con la siguiente estructura:

# Clases
- Cocina.java
- HawaiPizzaBuilder.java
- PicantePizzaBuilder.java
- Pizza.java
- PizzaBuilder.java

# Director
- Cocina.java

# Principal
- Principal.java

## Contenido

Como podemos observar, nuestra clase Main instancia la clase director que a su vez setea el tipo de pizza a crear utilizando el mismo set (setPizzaBuilder) y dependiendo del objeto que pasemos, será el tipo de pizza que creará. De esta forma, ocultamos la creación concreta de los distintos tipos de pizza.

## UML

Pronto Diagrama UML
