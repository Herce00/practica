
package Menu;

import java.util.Scanner;

public class Menu_principal {
    private int opcion;
    
    public void menu_principal(){
        String cadena = ("Bienvenido A Mi Programa \n"
                + "A Contiuacion Encontraras El Menu Principal \n"
                + "1. Cargar Matrices \n"
                + "2. Reporte \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
        System.out.println(cadena);
        
    }
    public void menu_segundario(){
        System.out.println("\nSe Encuentra En Operaciones Con matrices \n"
                + "Que Operacion Desea Realizar? \n"
                + "1. Sumar matrices \n"
                + "2. Restar matrices\n"
                + "3. Multiplicar matrices\n"
                + "4. Dividir matrices\n"
                + "5. Transpuesta de matriz\n"
                + "6. Matriz Inversa\n"
                + "7. Matriz Potencia de una matriz\n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
        
    }
    public void menu_opcion_resta(){
        System.out.println("Escoje El Orden De La Resta \n"
                + "1. A-B \n"
                + "2. B-A \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
    public void menu_opcion_multiplicacion(){
        System.out.println("Escoje El Orden De La Multiplicacion \n"
                + "1. A*B \n"
                + "2. B*A \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
    public void menu_opcion_traspuesta(){
        System.out.println("Escoje La Matriz\n"
                + "1. A\n"
                + "2. B \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
    public void menu_opcion_potencia(){
        System.out.println("Escoje La Matriz\n"
                + "1. A\n"
                + "2. B \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
    public void menu_opcion_inversa(){
        System.out.println("Escoje La Matriz\n"
                + "1. A\n"
                + "2. B \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
    public void menu_opcion_dividir(){
        System.out.println("Escoje La Matriz\n"
                + "1. B/A\n"
                + "2. A/B \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
    }
}
