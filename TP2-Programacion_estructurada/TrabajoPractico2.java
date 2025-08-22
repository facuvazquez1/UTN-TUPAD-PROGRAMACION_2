import java.util.Scanner;

public class TrabajoPractico2 {

    // Variable global para el ejercicio 11
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Puedes descomentar cada seccion para probarla individualmente
        
        // -----------------------------------------------------------
        // Punto 1 - Verificacion de Ano Bisiesto
        // -----------------------------------------------------------
        System.out.println("--- Punto 1: Verificacion de Ano Bisiesto ---");
        verificarAnioBisiesto(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 2 - Determinar el Mayor de Tres Numeros
        // -----------------------------------------------------------
        System.out.println("--- Punto 2: Mayor de Tres Numeros ---");
        encontrarMayorDeTres(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 3 - Clasificacion de Edad
        // -----------------------------------------------------------
        System.out.println("--- Punto 3: Clasificacion de Edad ---");
        clasificarEdad(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 4 - Calculadora de Descuento
        // -----------------------------------------------------------
        System.out.println("--- Punto 4: Calculadora de Descuento ---");
        calcularDescuento(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 5 - Suma de Numeros Pares (while)
        // -----------------------------------------------------------
        System.out.println("--- Punto 5: Suma de Numeros Pares (while) ---");
        sumarNumerosPares(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 6 - Contador de Positivos, Negativos y Ceros (for)
        // -----------------------------------------------------------
        System.out.println("--- Punto 6: Contador de Numeros ---");
        contarNumeros(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 7 - Validacion de Nota (do-while)
        // -----------------------------------------------------------
        System.out.println("--- Punto 7: Validacion de Nota (do-while) ---");
        validarNota(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 8 - Calculo de Precio Final con funciones
        // -----------------------------------------------------------
        System.out.println("--- Punto 8: Calculo de Precio Final con funciones ---");
        calcularPrecioFinalMain(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 9 - Composicion de funciones de costo de envio
        // -----------------------------------------------------------
        System.out.println("--- Punto 9: Calculo de Costo de Envio y Total ---");
        calcularTotalCompraMain(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 10 - Actualizacion de Stock
        // -----------------------------------------------------------
        System.out.println("--- Punto 10: Actualizacion de Stock ---");
        actualizarStockMain(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 11 - Descuento con variable global
        // -----------------------------------------------------------
        System.out.println("--- Punto 11: Descuento con Variable Global ---");
        calcularDescuentoEspecialMain(scanner);
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 12 - Modificacion de un array (for-each)
        // -----------------------------------------------------------
        System.out.println("--- Punto 12: Modificacion de Array ---");
        modificarArrayPrecios();
        System.out.println("\n");
        
        // -----------------------------------------------------------
        // Punto 13 - Impresion recursiva de arrays
        // -----------------------------------------------------------
        System.out.println("--- Punto 13: Impresion Recursiva de Array ---");
        imprimirRecursivoArrayPrecios();
        System.out.println("\n");
        
        scanner.close();
    }
    
    
    // -----------------------------------------------------------
    // Codigo para el punto 1
    // -----------------------------------------------------------
    public static void verificarAnioBisiesto(Scanner scanner) {
        System.out.print("Ingrese un ano: ");
        int anio = scanner.nextInt();
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        if (esBisiesto) {
            System.out.println("El ano " + anio + " es bisiesto.");
        } else {
            System.out.println("El ano " + anio + " no es bisiesto.");
        }
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 2
    // -----------------------------------------------------------
    public static void encontrarMayorDeTres(Scanner scanner) {
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 3
    // -----------------------------------------------------------
    public static void clasificarEdad(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un Nino.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 4
    // -----------------------------------------------------------
    public static void calcularDescuento(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);
        
        double descuento = 0.0;
        
        if (categoria == 'A') {
            descuento = 0.10;
        } else if (categoria == 'B') {
            descuento = 0.15;
        } else if (categoria == 'C') {
            descuento = 0.20;
        } else {
            System.out.println("Categoria no valida. No se aplicara descuento.");
            descuento = 0.0;
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 5
    // -----------------------------------------------------------
    public static void sumarNumerosPares(Scanner scanner) {
        int numero;
        int sumaPares = 0;
        
        System.out.println("Ingrese numeros (0 para terminar):");
        
        while (true) {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + sumaPares);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 6
    // -----------------------------------------------------------
    public static void contarNumeros(Scanner scanner) {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        System.out.println("Ingrese 10 numeros enteros:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 7
    // -----------------------------------------------------------
    public static void validarNota(Scanner scanner) {
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 8 (Funciones)
    // -----------------------------------------------------------
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
    public static void calcularPrecioFinalMain(Scanner scanner) {
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble() / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 9 (Composicion de funciones)
    // -----------------------------------------------------------
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0.0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void calcularTotalCompraMain(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de linea
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 10 (Funciones)
    // -----------------------------------------------------------
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static void actualizarStockMain(Scanner scanner) {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 11 (Variable global)
    // -----------------------------------------------------------
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void calcularDescuentoEspecialMain(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 12 (Arrays)
    // -----------------------------------------------------------
    public static void modificarArrayPrecios() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // Modificar el precio del tercer producto (indice 2)
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
    
    // -----------------------------------------------------------
    // Codigo para el punto 13 (Recursividad)
    // -----------------------------------------------------------
    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPreciosRecursivo(precios, indice + 1);
        }
    }
    
    public static void imprimirRecursivoArrayPrecios() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);
        
        // Modificar el precio del tercer producto (indice 2)
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }
}