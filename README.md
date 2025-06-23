# Test-Automation
## Requisitos
1. Intellj.
2. jdk 21.
3. maven 3.9.10
## Pasos para configurar la automatización
1. Abra el proyecto en Intellj.
2. Navegue hasta el directorio `src/test/resources/webdriver`.
3. sobre el archivo chromedriver.exe click derecho.
4. click en copy path reference.
5. click absolute path.
6. Navegue hasta el directorio `src/main/java/bdd/webdriver`.
7. ingrese al archivo DOM.java
8. en la linea 25 cambie el path por el que copio anteriormente.

## Pasos para correr la automatización 
### opcion 1
1. Navegue hasta el directorio `src/test/java/bdd/runner`.
2. abra el archivo "Runner.java"
3. en el ide observaremos un icono de play color verde
4. click en icono de play

### opcion 2
1. lado derecho se encuentra un icono de maven dar click
2. se despliega una pestaña en la cual daremos click en el icono de consola
3. se despiega una pantalla donde escribiremos mvn clean verify y enter

## pasos para ver el informe en cucumber 
1. en la parte inferior se deplegaron los logs al finalizar se encontrara un link con el informe
![image](https://github.com/user-attachments/assets/87e565de-f3ec-4dc4-a001-a0779c177894)
2. el informe se observara de la siguiente manera
![image](https://github.com/user-attachments/assets/4f45a685-5fbb-42c7-adef-22800b6e1340)
#### Nota para no tener inconvenientes con el informe se recomienda correr la primera vez por la opcion 2 
