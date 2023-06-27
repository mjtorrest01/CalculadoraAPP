import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("***** Aplicacion Calculadora *****");
            // Mostar el Menu
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Dividir
                    5. Salir
                    """);

            System.out.print("¿Que Operacion Desea Realizar?: ");
            var seleccionMenu = Integer.parseInt(consola.nextLine());

            // Revisar Que Este Dentro de las Opciones Mensionadas
            if (seleccionMenu >= 1 && seleccionMenu <= 4) {
                System.out.print("Escriba Valor del Primer Operador: ");
                var operador1 = Integer.parseInt(consola.nextLine());
                System.out.print("Escriba Valor del Segundo Operador: ");
                var operador2 = Integer.parseInt(consola.nextLine());
                int resultado;
                switch (seleccionMenu) {
                    case 1 -> { // SUMA
                        resultado = operador1 + operador2;
                        System.out.println("_________________________________________________________");
                        System.out.println("|     EL Resultado de la Suma es: " + resultado + "     |");
                        System.out.println("_________________________________________________________");
                    }
                    case 2 -> { // RESTA
                        resultado = operador1 - operador2;
                        System.out.println("__________________________________________________________");
                        System.out.println("|     El Resultado de la Resta es: " + resultado + "     |");
                        System.out.println("__________________________________________________________");
                    }
                    case 3 -> { // MULTIPLICAR
                        resultado = operador1 * operador2;
                        System.out.println("____________________________________________________________________");
                        System.out.println("|     El Resultado de la Multiplicacion es: " + resultado + "     |");
                        System.out.println("____________________________________________________________________");
                    }
                    case 4 -> { // DIVIDIR
                        resultado = operador1 / operador2;
                        System.out.println("______________________________________________________________");
                        System.out.println("|     EL Resultado del la Divicion es: " + resultado + "     |");
                        System.out.println("______________________________________________________________");
                    }
                    default -> // SELECCION INVALIDA
                            System.out.println("Opcion Erronea " + seleccionMenu);
                } // Fin de switch

            } else if (seleccionMenu == 5) { // SALIR DE LA APP
                System.out.println("__________________________________________");
                System.out.println("|     Cerrando App ¡Hasta Pronto...!     |");
                System.out.println("__________________________________________");
                break;
            } else {
                System.out.println("_________________________________________________________________________________");
                System.out.println("Opcion Erronea... Seleccionaste: " + seleccionMenu + " Debes Selecionar del 1 al 5");
                System.out.println("_________________________________________________________________________________");
            }
            System.out.println(); //Salto de Linea Antes de Repetir el Ciclo
        } // Fin de while
    } //Fin de Main
} //Fin de class
