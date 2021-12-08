
package operaciones;

import java.util.Scanner;
import static practica_1.Practica_1.matriz_a;
import static practica_1.Practica_1.matriz_b;

public class operacion {
    
    
    public void suma( int matriz_a[][] ,int matriz_b[][]){
        int filas=0,columnas=0;
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas ++;  
            }
            filas ++;
        }
        int matriz_r[][] = new int [filas][columnas];
        
        //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
        System.out.println("  Matriz A          Matriz B         Matriz Resultante");
        for(int i=0;i<matriz_a.length;i++){
            for(int j=0;j<matriz_a.length;j++){
                System.out.print("|"+matriz_a[i][j]+"|");
            }
            if (i==1){
                System.out.print("  + ");
                System.out.print("  ");
            }
            if (i!=1){
            System.out.print("      ");    
            }
            
            for(int j=0;j<matriz_b.length;j++){
                System.out.print("|"+matriz_b[i][j]+"|");
            }

            if (i==1){
                System.out.print("  = ");
                System.out.print("  ");
            }

            if (i!=1){
            System.out.print("      ");    
            }

            for(int j=0;j<matriz_r.length;j++){
                matriz_r[i][j]= matriz_a[i][j]+matriz_b[i][j];
                System.out.print("|"+matriz_r[i][j]+"|");
            }
            System.out.println("\n");
        }
    }
    
    public void resta(int matriz_a[][] ,int matriz_b[][]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int filas=0,columnas=0;
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas ++;  
            }
            filas ++;
        }
        int matriz_r[][] = new int [filas][columnas];
        opcion= entrada.nextInt();
        
        //A-B
        if (opcion==1) {
            
            //mostrando en pantalla mtriz b,a y realizando el calculo de la matriz resultante
            System.out.println("  Matriz A          Matriz B         Matriz Resultante");
            for(int i=0;i<matriz_a.length;i++){
                for(int j=0;j<matriz_a.length;j++){
                    System.out.print("|"+matriz_a[i][j]+"|");
                }
                if (i==1){
                    System.out.print("  - ");
                    System.out.print("  ");
                }
                if (i!=1){
                    System.out.print("      ");    
                }
            
                for(int j=0;j<matriz_b.length;j++){
                    System.out.print("|"+matriz_b[i][j]+"|");
                }

                if (i==1){
                    System.out.print("  = ");
                    System.out.print("  ");
                }

                if (i!=1){
                    System.out.print("      ");    
                }

                for(int j=0;j<matriz_r.length;j++){
                    if (opcion == 1) {
                        matriz_r[i][j]= matriz_a[i][j]-matriz_b[i][j];
                    }else if (opcion==2) {
                        matriz_r[i][j]= matriz_b[i][j]-matriz_a[i][j];
                    }
                
                    System.out.print("|"+matriz_r[i][j]+"|");
                }
                System.out.println("\n");
            }
            
        }else{
            
            //mostrando en pantalla mtriz b,a y realizando el calculo de la matriz resultante
            System.out.println("  Matriz B          Matriz A         Matriz Resultante");
            for(int i=0;i<matriz_b.length;i++){
                for(int j=0;j<matriz_b.length;j++){
                    System.out.print("|"+matriz_b[i][j]+"|");
                }
                if (i==1){
                    System.out.print("  - ");
                    System.out.print("  ");
                }
                if (i!=1){
                    System.out.print("      ");    
                }
            
                for(int j=0;j<matriz_a.length;j++){
                    System.out.print("|"+matriz_a[i][j]+"|");
                }

                if (i==1){
                    System.out.print("  = ");
                    System.out.print("  ");
                }

                if (i!=1){
                    System.out.print("      ");    
                }

                for(int j=0;j<matriz_r.length;j++){
                    if (opcion == 1) {
                        matriz_r[i][j]= matriz_a[i][j]-matriz_b[i][j];
                    }else if (opcion==2) {
                        matriz_r[i][j]= matriz_b[i][j]-matriz_a[i][j];
                    }
                
                    System.out.print("|"+matriz_r[i][j]+"|");
                }
                System.out.println("\n");
            }
        }
        
    }
    
    public void multiplicacion(int matriz_a[][] ,int matriz_b[][]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int filas_a=0,columnas_a=0;
        int filas_b=0,columnas_b=0;
        
        //calculando filas y columnas de cada matriz
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas_a ++;  
            }
            filas_a ++;
        }
        for (int i = 0; i < matriz_b.length; i++) {
            for (int j = 0; j < matriz_b.length; j++) {
             columnas_b ++;  
            }
            filas_b ++;
        }
        columnas_b/= filas_b;
        columnas_a/= filas_a;
        
         opcion= entrada.nextInt();
         
         if (opcion==1) {
             
             //A*B
             int matriz_r[][] = new int [filas_a][columnas_b];
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz A          Matriz B         Matriz Resultante");
                for(int i=0;i<matriz_a.length;i++){
                    int variable_extra_multiplicacion = 0;
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_a[i][j]+"|");
                    }
                    if (i==1){
                        System.out.print("  * ");
                        System.out.print("  ");
                    }
                    if (i!=1){
                    System.out.print("      ");    
                    }
            
                    for(int j=0;j<matriz_b.length;j++){
                        System.out.print("|"+matriz_b[i][j]+"|");
                    }

                    if (i==1){
                        System.out.print("  = ");
                        System.out.print("  ");
                    }

                    if (i!=1){
                    System.out.print("      ");    
                    }

                    for(int j=0;j<matriz_a.length;j++){
                        
                        for (int k = 0; k < matriz_b.length; k++) {
                            if (opcion == 1) {
                                matriz_r[i][j] += matriz_a[i][k]*matriz_b[k][j];
                            }else if (opcion==2) {
                               matriz_r[i][j] += matriz_b[i][k]*matriz_a[k][j]; 
                            }
                        }
                        
                
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
            
         }else if (opcion==2) {
            //B*A
             int matriz_r[][] = new int [filas_a][columnas_b];
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz B          Matriz A         Matriz Resultante");
                for(int i=0;i<matriz_b.length;i++){
                    for(int j=0;j<matriz_b.length;j++){
                        System.out.print("|"+matriz_b[i][j]+"|");
                    }
                    if (i==1){
                        System.out.print("  * ");
                        System.out.print("  ");
                    }
                    if (i!=1){
                    System.out.print("      ");    
                    }
            
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_a[i][j]+"|");
                    }

                    if (i==1){
                        System.out.print("  = ");
                        System.out.print("  ");
                    }

                    if (i!=1){
                    System.out.print("      ");    
                    }

                    for(int j=0;j<matriz_a.length;j++){
                        
                        for (int k = 0; k < matriz_b.length; k++) {
                            if (opcion == 1) {
                                matriz_r[i][j] += matriz_a[i][k]*matriz_b[k][j];
                            }else if (opcion==2) {
                               matriz_r[i][j] += matriz_b[i][k]*matriz_a[k][j]; 
                            }
                        }
                        
                
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
         }
         
       
        
        
        
    }
    
    public void divicion(int matriz_a[][],int matriz_b[][]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int filas_a=0,columnas_a=0;
        int filas_b=0,columnas_b=0;
        
        
        //calculando filas y columnas de cada matriz
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas_a ++;  
            }
            filas_a ++;
        }
        for (int i = 0; i < matriz_b.length; i++) {
            for (int j = 0; j < matriz_b.length; j++) {
             columnas_b ++;  
            }
            filas_b ++;
        }
        columnas_b/= filas_b;
        columnas_a/= filas_a;
        
         opcion= entrada.nextInt();
         
         if (opcion==1) {
             
             //inversa de A
             int matriz_r[][] = new int [filas_a][columnas_b];
             float matriz_r2[][] = new float [filas_a][columnas_b];
             float matriz_aux[][] = new float [filas_a][columnas_a];
             float pivote, aux, identidad[][]= new float[filas_a][columnas_a];
             //llenar matriz identidad
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     if (i==j){
                         identidad[i][j]=1;
                     }
                 }
                 
             }
             
             //paso los datos A a aux
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     matriz_aux[i][j] = matriz_a[i][j];
                 }
                 
             }
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz B ");
                for(int i=0;i<matriz_a.length;i++){
                    
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_b[i][j]+"|");
                    }

                    
                    pivote = matriz_aux[i][i];
                    for(int k=0;k<matriz_a.length;k++){
                       matriz_aux[i][k] = matriz_aux[i][k]/pivote;
                       identidad[i][k] = identidad[i][k]/pivote;
                       
                        
                    }
                    for (int j = 0; j <matriz_a.length; j++) {
                            if (i != j) {
                                aux = matriz_aux[j][i];
                                for (int k = 0; k < matriz_a.length; k++) {
                                    matriz_aux[j][k]= matriz_aux[j][k]-aux*matriz_aux[i][k];
                                    identidad[j][k]= identidad[j][k]-aux*identidad[i][k];
                                }
                            }
                            
                        }
                    
                    
                    
                    System.out.print("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
             
             
             
             System.out.println("\n matriz inversa");
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     
                     System.out.print("|"+matriz_r2[i][j]+"|");
                     //System.out.print("|"+matriz_r2[i][j]+"|");
                     
                 }
                 System.out.print("\n");
             }
            
         }
         if (opcion == 2) {
            //inversa de B
             int matriz_r[][] = new int [filas_a][columnas_b];
             float matriz_r2[][] = new float [filas_a][columnas_b];
             float matriz_aux[][] = new float [filas_a][columnas_a];
             float pivote, aux, identidad[][]= new float[filas_a][columnas_a];
             //llenar matriz identidad
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     if (i==j){
                         identidad[i][j]=1;
                     }
                 }
                 
             }
             
             //paso los datos B a aux
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     matriz_aux[i][j] = matriz_b[i][j];
                 }
                 
             }
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz A ");
                for(int i=0;i<matriz_a.length;i++){
                    
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_a[i][j]+"|");
                    }

                    
                    pivote = matriz_aux[i][i];
                    for(int k=0;k<matriz_b.length;k++){
                       matriz_aux[i][k] = matriz_aux[i][k]/pivote;
                       identidad[i][k] = identidad[i][k]/pivote;
                       
                        
                    }
                    for (int j = 0; j <matriz_b.length; j++) {
                            if (i != j) {
                                aux = matriz_aux[j][i];
                                for (int k = 0; k < matriz_b.length; k++) {
                                    matriz_aux[j][k]= matriz_aux[j][k]-aux*matriz_aux[i][k];
                                    identidad[j][k]= identidad[j][k]-aux*identidad[i][k];
                                }
                            }
                            
                        }
                    
                    
                    System.out.print("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
             for (int i = 0; i < matriz_b.length; i++) {
                for(int j=0;j<matriz_a.length;j++){
                        
                        for (int k = 0; k < matriz_b.length; k++) {
                            if (opcion == 1) {
                                matriz_r2[i][j] += matriz_b[i][k]*identidad[k][j];
                            }else if (opcion==2) {
                                matriz_r2[i][j] += matriz_a[i][k]*identidad[k][j]; 
                            }
                        }
                        
                
                    } 
             }
             
             System.out.println("\n matriz inversa");
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     System.out.print("|"+matriz_r2[i][j]+"|");
                 }
                 System.out.print("\n");
             }
        }
    }
    
    public void traspuesta(int matriz_a[][],int matriz_b[][]){
        int opcion = 0;
        int filas_a=0,columnas_a=0;
        int filas_b=0,columnas_b=0;
        
        //calculando filas y columnas de cada matriz
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas_a ++;  
            }
            filas_a ++;
        }
        for (int i = 0; i < matriz_b.length; i++) {
            for (int j = 0; j < matriz_b.length; j++) {
             columnas_b ++;  
            }
            filas_b ++;
        }
        columnas_b/= filas_b;
        columnas_a/= filas_a;
        Scanner entrada = new Scanner(System.in);
        opcion= entrada.nextInt();
        if (opcion == 1) {
            //traspuesta de A
            int matriz_r[][] = new int [columnas_a][filas_a];
            //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
            System.out.println("  Matriz A          Matriz traspuesta");
            for(int i=0;i<matriz_a.length;i++){
                for(int j=0;j<matriz_a.length;j++){
                    System.out.print("|"+matriz_a[i][j]+"|");
                    }
                    if (i==1){
                        System.out.print("  = ");
                        System.out.print("  ");
                    }
                    if (i!=1){
                        System.out.print("      ");    
                    }

                    for(int j=0;j<matriz_r.length;j++){
                        matriz_r[i][j]= matriz_a[j][i];
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                }
            
            }else if (opcion == 2) {
                //traspuesta de B
                int matriz_r[][] = new int [columnas_a][filas_a];
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz B          Matriz traspuesta");
                for(int i=0;i<matriz_b.length;i++){
                    for(int j=0;j<matriz_b.length;j++){
                    System.out.print("|"+matriz_b[i][j]+"|");
                    }
                    if (i==1){
                        System.out.print("  = ");
                        System.out.print("  ");
                    }
                    if (i!=1){
                        System.out.print("      ");    
                    }

                    for(int j=0;j<matriz_r.length;j++){
                        matriz_r[i][j]= matriz_b[j][i];
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                } 
            }
        
    }
    
    public void inversa(int matriz_a[][],int matriz_b[][]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int filas_a=0,columnas_a=0;
        int filas_b=0,columnas_b=0;
        
        
        //calculando filas y columnas de cada matriz
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas_a ++;  
            }
            filas_a ++;
        }
        for (int i = 0; i < matriz_b.length; i++) {
            for (int j = 0; j < matriz_b.length; j++) {
             columnas_b ++;  
            }
            filas_b ++;
        }
        columnas_b/= filas_b;
        columnas_a/= filas_a;
        
         opcion= entrada.nextInt();
         
         if (opcion==1) {
             
             //inversa de A
             int matriz_r[][] = new int [filas_a][columnas_b];
             float matriz_aux[][] = new float [filas_a][columnas_a];
             float pivote, aux, identidad[][]= new float[filas_a][columnas_a];
             //llenar matriz identidad
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     if (i==j){
                         identidad[i][j]=1;
                     }
                 }
                 
             }
             
             //paso los datos A a aux
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     matriz_aux[i][j] = matriz_a[i][j];
                 }
                 
             }
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz A ");
                for(int i=0;i<matriz_a.length;i++){
                    
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_a[i][j]+"|");
                    }

                    
                    pivote = matriz_aux[i][i];
                    for(int k=0;k<matriz_a.length;k++){
                       matriz_aux[i][k] = matriz_aux[i][k]/pivote;
                       identidad[i][k] = identidad[i][k]/pivote;
                       
                        
                    }
                    for (int j = 0; j <matriz_a.length; j++) {
                            if (i != j) {
                                aux = matriz_aux[j][i];
                                for (int k = 0; k < matriz_a.length; k++) {
                                    matriz_aux[j][k]= matriz_aux[j][k]-aux*matriz_aux[i][k];
                                    identidad[j][k]= identidad[j][k]-aux*identidad[i][k];
                                }
                            }
                            
                        }
                    
                    
                    System.out.print("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
             
             System.out.println("\n matriz inversa");
             for (int i = 0; i < matriz_a.length; i++) {
                 for (int j = 0; j < matriz_a.length; j++) {
                     System.out.print("|"+identidad[i][j]+"|");
                 }
                 System.out.print("\n");
             }
            
         }
         if (opcion == 2) {
            //inversa de B
             int matriz_r[][] = new int [filas_a][columnas_b];
             float matriz_aux[][] = new float [filas_a][columnas_a];
             float pivote, aux, identidad[][]= new float[filas_a][columnas_a];
             //llenar matriz identidad
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     if (i==j){
                         identidad[i][j]=1;
                     }
                 }
                 
             }
             
             //paso los datos B a aux
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     matriz_aux[i][j] = matriz_b[i][j];
                 }
                 
             }
             if (columnas_a==filas_b) {
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz B ");
                for(int i=0;i<matriz_b.length;i++){
                    
                    for(int j=0;j<matriz_b.length;j++){
                        System.out.print("|"+matriz_b[i][j]+"|");
                    }

                    
                    pivote = matriz_aux[i][i];
                    for(int k=0;k<matriz_b.length;k++){
                       matriz_aux[i][k] = matriz_aux[i][k]/pivote;
                       identidad[i][k] = identidad[i][k]/pivote;
                       
                        
                    }
                    for (int j = 0; j <matriz_b.length; j++) {
                            if (i != j) {
                                aux = matriz_aux[j][i];
                                for (int k = 0; k < matriz_b.length; k++) {
                                    matriz_aux[j][k]= matriz_aux[j][k]-aux*matriz_aux[i][k];
                                    identidad[j][k]= identidad[j][k]-aux*identidad[i][k];
                                }
                            }
                            
                        }
                    
                    
                    System.out.print("\n");
                }
            }else{
                System.out.println("Es Incosistente Por Lo Tanto No Se Puede Operar");
            }
             
             System.out.println("\n matriz inversa");
             for (int i = 0; i < matriz_b.length; i++) {
                 for (int j = 0; j < matriz_b.length; j++) {
                     System.out.print("|"+identidad[i][j]+"|");
                 }
                 System.out.print("\n");
             }
        }
    }
    
    public void potencia(int matriz_a[][],int matriz_b[][]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int filas_a=0,columnas_a=0;
        int filas_b=0,columnas_b=0;
        int potencia=0;
        
        //calculando filas y columnas de cada matriz
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_a.length; j++) {
             columnas_a ++;  
            }
            filas_a ++;
        }
        for (int i = 0; i < matriz_b.length; i++) {
            for (int j = 0; j < matriz_b.length; j++) {
             columnas_b ++;  
            }
            filas_b ++;
        }
        columnas_b/= filas_b;
        columnas_a/= filas_a;
        
         opcion= entrada.nextInt();
        //A^potencia
             int matriz_r[][] = new int [filas_a][columnas_b];
             
             if (opcion ==1) {
                 System.out.print("Ingrese La potencia: ");
                 potencia = entrada.nextInt();
                 
                //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz A ^"+potencia+"         Matriz Resultante");
                // pasar lo de la matriz a a la matriz b
                     for (int n = 0; n <matriz_a.length; n++) {
                         for (int o = 0; o < matriz_a.length; o++) {
                             matriz_b[n][o]=matriz_a[n][o];
                         }
                    }
                //bucle para la potencia
                for (int m = 0; m < potencia-1; m++) {
                    
                    // pasar lo de la matriz r a ceros
                     for (int n = 0; n <matriz_a.length; n++) {
                         for (int o = 0; o < matriz_a.length; o++) {
                             matriz_r[n][o]=0;
                         }
                    }
                     
                   //operacion 
                    for(int i=0;i<matriz_a.length;i++){
                        for(int j=0;j<matriz_a.length;j++){
                            for (int k = 0; k < matriz_b.length; k++) {
                            if (opcion == 1) {
                                matriz_r[i][j] += matriz_a[i][k]*matriz_b[k][j];
                            }else if (opcion==2) {
                               matriz_r[i][j] += matriz_b[i][k]*matriz_a[k][j]; 
                            }
                        }
                        }
                    }
                    
                    // pasar lo de la matriz r a la matriz b
                     for (int n = 0; n <matriz_a.length; n++) {
                         for (int o = 0; o < matriz_a.length; o++) {
                             matriz_b[n][o]=matriz_r[n][o];
                         }
                    }
                     
                     
                 }
                 for(int i=0;i<matriz_a.length;i++){
                     
                    for(int j=0;j<matriz_a.length;j++){
                        System.out.print("|"+matriz_a[i][j]+"|");
                    }
                    if (i!=1){
                    System.out.print("     ");    
                    }

                    if (i==1){
                        System.out.print("   = ");
                        System.out.print("   ");
                    }

                    if (i!=1){
                    System.out.print("   ");    
                    }

                    for(int j=0;j<matriz_a.length;j++){
                
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                }
            }else if (opcion == 2) {
            System.out.print("Ingrese La potencia: ");
                 potencia = entrada.nextInt();
                 
                //mostrando en pantalla mtriz b y realizando el calculo de la matriz resultante
                System.out.println("  Matriz B ^"+potencia+"         Matriz Resultante");
                // pasar lo de la matriz b a la matriz a
                     for (int n = 0; n <matriz_b.length; n++) {
                         for (int o = 0; o < matriz_b.length; o++) {
                             matriz_a[n][o]=matriz_b[n][o];
                         }
                    }
                //bucle para la potencia
                for (int m = 0; m < potencia-1; m++) {
                     
                    // pasar lo de la matriz r a ceros
                     for (int n = 0; n <matriz_a.length; n++) {
                         for (int o = 0; o < matriz_a.length; o++) {
                             matriz_r[n][o]=0;
                         }
                    }
                    
                   //operacion 
                    for(int i=0;i<matriz_a.length;i++){
                        for(int j=0;j<matriz_a.length;j++){
                            for (int k = 0; k < matriz_b.length; k++) {
                            if (opcion == 1) {
                                matriz_r[i][j] += matriz_a[i][k]*matriz_b[k][j];
                            }else if (opcion==2) {
                               matriz_r[i][j] += matriz_b[i][k]*matriz_a[k][j]; 
                            }
                        }
                        }
                    }
                    
                    // pasar lo de la matriz r a la matriz a
                     for (int n = 0; n <matriz_a.length; n++) {
                         for (int o = 0; o < matriz_a.length; o++) {
                             matriz_a[n][o]=matriz_r[n][o];
                         }
                    }
                     
                 }
                 for(int i=0;i<matriz_a.length;i++){
                     
                    for(int j=0;j<matriz_a.length;j++){
                        if (opcion==1) {
                            System.out.print("|"+matriz_a[i][j]+"|");
                        }else if (opcion==2) {
                            System.out.print("|"+matriz_b[i][j]+"|");
                        }
                    }
                    if (i!=1){
                    System.out.print("     ");    
                    }

                    if (i==1){
                        System.out.print("   = ");
                        System.out.print("   ");
                    }

                    if (i!=1){
                    System.out.print("   ");    
                    }

                    for(int j=0;j<matriz_a.length;j++){
                
                        System.out.print("|"+matriz_r[i][j]+"|");
                    }
                    System.out.println("\n");
                }
        }
        
    }
    
    
    
       
}
