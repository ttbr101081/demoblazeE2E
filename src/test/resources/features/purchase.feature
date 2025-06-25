# language: es
Funcionalidad: Flujo de compra en Saucedemo

  Escenario: Completar un flujo de compra exitoso
    Dado que el usuario esta en la pagina de inicio de Saucedemo
    Cuando el usuario ingresa el nombre de usuario "standard_user"
    Y el usuario ingresa la contrasena "secret_sauce"
    Y el usuario hace clic en el boton de inicio de sesion
    Entonces el usuario deberia ser redirigido a la pagina de productos
    Cuando el usuario agrega el producto "Sauce Labs Backpack" al carrito
    Y el usuario agrega el producto "Sauce Labs Bike Light" al carrito
    Y el usuario hace clic en el icono del carrito
    Entonces el usuario deberia ver la pagina del carrito
    Cuando el usuario hace clic en el boton "Checkout"
    Entonces el usuario deberia ver la pagina de informacion del checkout
    Cuando el usuario ingresa el nombre "John"
    Y el usuario ingresa el apellido "Doe"
    Y el usuario ingresa el codigo postal "12345"
    Y el usuario hace clic en el boton "Continue"
    Entonces el usuario deberia ver la pagina de resumen del checkout
    Cuando el usuario hace clic en el boton "Finish"
    Entonces el usuario deberia ver el mensaje de confirmacion "THANK YOU FOR YOUR ORDER"
