
package practica_1;
import Menu.Menu_principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import operaciones.operacion;

public class Practica_1 {
    public static int opcion;
    public static int matriz_a[][],matriz_b[][];
    
    public static void main(String[] args) throws IOException {
        Practica_1 practica = new Practica_1();
        practica.proceso();
        
    }
    
    public void proceso() throws IOException{
        
        //Se creo la estacia del Menu_principal y se carga el metodo menu_principal
        Menu_principal menu = new Menu_principal();
        menu.menu_principal();
        
        //elegir opcion del menu
        Scanner opcion_elegi = new Scanner(System.in);
        opcion = opcion_elegi.nextInt();
        
        if (opcion == 1){
            //Se cargaron las dos matrices
            System.out.println("\n \n"
                    + "Se Encuentra En Cargar Matrices \n"
                    + "Ingrese La Ruta Del Archivo Para Cargar La Matriz A :");
            abrir_archivo();
            motrar_matriz();
            System.out.println("Ingrese La Ruta Del Archivo Para Cargar La Matriz B :");
            abrir_archivo2();
            motrar_matriz2();
            
            //Se carga el metodo menu_segundario de la estancia menu_principal
            menu.menu_segundario();
            
            //Elegir opcion de operaciones con matrices
            Scanner opcion_elegi2 = new Scanner(System.in);
            opcion = opcion_elegi.nextInt();
            
            //Se creo la estacia de operacion
            operacion operacion_matriz = new operacion();
            Menu_principal menu2 = new Menu_principal();
            switch (opcion){
                case 1:
                    System.out.println("suma");
                    operacion_matriz.suma(this.matriz_a,this.matriz_b);
                break;
                case 2: 
                    System.out.println("resta");
                    menu2.menu_opcion_resta();
                    operacion_matriz.resta(matriz_a, matriz_b);
                break;
                case 3:
                    System.out.println("multiplicacion");
                    menu2.menu_opcion_multiplicacion();
                    operacion_matriz.multiplicacion(matriz_a, matriz_b);
                    
                break;
                case 4:
                    System.out.println("dividir");
                    menu2.menu_opcion_dividir();
                    operacion_matriz.divicion(matriz_a, matriz_b);
                break;
                case 5: 
                    System.out.println("Traspuesta");
                    menu2.menu_opcion_traspuesta();
                    operacion_matriz.traspuesta(matriz_a, matriz_b);
                break;
                case 6:
                    System.out.println("inversa");
                    menu2.menu_opcion_inversa();
                    operacion_matriz.inversa(matriz_a, matriz_b);
                break;
                case 7:
                    System.out.println("Potencia");
                    menu2.menu_opcion_potencia();
                    operacion_matriz.potencia(matriz_a, matriz_b);
                break;
                default:System.out.println("Esa opcion no esta disponible"); break;
            }
            
        }
    }
    public void abrir_archivo(){
               // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String ruta;
        ruta = entrada.nextLine();
        File file;
        FileReader leer;
        BufferedReader lector;
        
        try{
            file = new  File(ruta);
            leer = new FileReader(file);
            lector = new BufferedReader(leer);
            String lineas;
            int separador =0;
            while((lineas = lector.readLine())!= null){
                separador ++;
                matriz_a = matriz(separador,lineas,matriz_a);  
            }
        }catch(Exception ex){
            ex.printStackTrace();
            
        } 
        
    }
    public void abrir_archivo2(){
               // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String ruta;
        ruta = entrada.nextLine();
        File file;
        FileReader leer;
        BufferedReader lector;
        
        try{
            file = new  File(ruta);
            leer = new FileReader(file);
            lector = new BufferedReader(leer);
            String lineas;
            int separador =0;
            while((lineas = lector.readLine())!= null){
                separador ++;
                matriz_b = matriz(separador,lineas,matriz_b);  
            }
        }catch(Exception ex){
            ex.printStackTrace();
            
        } 
        
    }
    public int[][] matriz(int filas,String lineas,int[][] matriz_parametro){
        String[] columnas= lineas.split(",");
        int matriz[][] = new int[filas][columnas.length];
        if (matriz_parametro != null) {
            for (int i = 0; i < matriz_parametro.length; i++) {
                for (int j = 0; j < matriz_parametro[i].length; j++) {
                    matriz[i][j]=matriz_parametro[i][j];
                }
            }
        }
        for (int i = 0; i <columnas.length; i++) {
                matriz[filas-1][i] = Integer.parseInt(columnas[i]);
            }
     return matriz;   
    }
    public  void motrar_matriz(){
        for (int i = 0; i < this.matriz_a.length; i++) {
            System.out.print("|");
            for (int j = 0; j < this.matriz_a[i].length; j++) {
                System.out.printf("%5d",matriz_a[i][j]);
            }
            System.out.println("|");
            System.out.println("");
        }
    }
    public  void motrar_matriz2(){
        for (int i = 0; i < this.matriz_b.length; i++) {
            System.out.print("|");
            for (int j = 0; j < this.matriz_b[i].length; j++) {
                System.out.printf("%5d",matriz_b[i][j]);
            }
            System.out.println("|");
            System.out.println("");
        }
    }
}
