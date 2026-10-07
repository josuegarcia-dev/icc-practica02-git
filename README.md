# icc-practica02-git
## Intsrucciones para la compilación, ejecución y varios ejemplos
 CalcBinjav.java                Calculadora para enteros de 8 bits
 Patron(A, B, C, D).java        Algoritmos para la generación de patrones 
 ManejoCadenas.java             Ejercicios de manipulación y analisis de cadenas
 README.md                      Instrucciones de compilacion, ejecución y ejemplos
 
# Todos los programas fueron desarrollados y probados utilizando Java 21

*Para compilar todos los archivos .java, abre una terminal en la carpetad repositorio y ejecuta:*
javac CalculadoraBinaria
javac PatronA
javac PatronB
javac PatronC
javac PatronD
javac ManejoCadenas

*Para ejecutar cualquiera de los programas compilados:*
java CalculadoraBinaria
java PatronA
java PatronB
java PatronC
java PatronD
java ManejoCadenas

## Ejemplos:
#Calculadora Binaria
Para 5+3:
Seleccione operación: 1 (Suma)
Ingrese el primer operando: 5
Ingrese el segundo operando: 3
Representación binaria n1: 00000101
Representación binaria n2: 00000011
Resultado decimal: 8
Representación binaria: 00001000

Para 5x(-3)
Seleccione operación: 3 (Multiplicación)
Ingrese el primer operando: 5
Ingrese el segundo operando: -3
Representación binaria n1: 00000101
Representación binaria n2: 11111101
Resultado decimal: -15
Representación binaria: 11110001 (expresado en complemento a 2)

Para 64x2
Seleccione operación: 3 (Multiplicación)
Ingrese el primer operando: 64
Ingrese el segundo operando: 2
Representación binaria n1: 01000000
Representación binaria n2: 00000010
Error: Hay un overflow

Para -13/5
Seleccione operación: 4 (División)
Ingrese el primer operando (Dividendo): -13
Ingrese el segundo operando (Divisor): 5
Representación binaria nd1: 11110011
Representación binaria nd2: 00000101
Cociente: -2 (11111110) 
Residuo:  -3 (11111011)

# ManejoCadenas
Ingrese una cadena de texto: Eduardo
Carácter buscado: 'u'
Subcadena Buscada: 'do'
Posible anagrama: Pepelalo
Análisis:
Ingrese una cadena de texto: Eduardo
1. Mostrar longitud: Tu cadena tiene 7 caracteres
2. Mostrar caracteres: E\n d\n u\n a\n r\n d\n o\n 
3. Mostrar cadena invertida: odraudE
4. Contar apariciones de un carácter: El carácter está en la cadena 1 vez
5. Buscar una subcadena: La subcadena aparece en la posición 6
6. Checar anagrama: NO SON ANAGRAMAS

# PatronA
=== EJECUCIÓN DE PATRONES (n = 5) ===

A · Triángulo delimitado
Ingrese el valor de n: 5

    1
   1 * 1
  1 * * 1
 1 * * * 1
1 * * * * 1

# PatronB
Ingrese el valor de n: 5

    *
   * *
  * * *
 * * * *
* * * * *

# PatronC
Ingrese el valor de n: 5

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

# PatronD
Ingrese el valor de n: 5

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
