
package examen1p1_marcelatovar;

import java.util.*;

public class Examen1P1_MarcelaTovar {

    
    public static void main(String[] args) {
        Menu();
    }
    
    public static void Menu(){
        Scanner ObiWan = new Scanner(System.in);
        int opcion = 0;
        System.out.println("¡Bienvenida a mi prueba de programación!");
        System.out.println("Antes de empezar, me gustaria que me ayudaras a saber quien soy.");
        System.out.println("¿Quien soy yo?(ingresa como te gustaría llamarme): ");
        String mi_nombre = ObiWan.nextLine();
        System.out.println("¡Hola! Yo soy "+mi_nombre+" es un gusto conocerte.");
        System.out.println("¿Como te llamas?: ");
        String tu_nombre = ObiWan.nextLine();
        System.out.println("Que bueno conocerte "+tu_nombre);
        System.out.println("A continuacion veremos el menu de este programa");
        do{
            System.out.println("---Menu---");
            System.out.println("1. Conjuntos");
            System.out.println("2. Cifrado por substitución");
            System.out.println("3. Sobre");
            System.out.println("4. Salir");
            System.out.println("Favor ingresa que deseas realizar "+tu_nombre);
            opcion = ObiWan.nextInt();
            while (opcion != 1 || opcion != 2 || opcion != 3 || opcion != 4){
                break;
            }
            switch(opcion){
                case 1:
                    System.out.println("Este programa muestra si la cadena es una union o una interseccion");
                    System.out.println("Ingrese primera cadena");
                    ObiWan.nextLine();
                    String cadena1 = ObiWan.nextLine();
                    System.out.println("Ingrese segunda cadena");
                    String cadena2 = ObiWan.nextLine();
                    UnionEInterseccion(cadena1, cadena2);
                    
                    break;
                case 2:
                    System.out.println("¡Hello there "+tu_nombre +"!");
                    System.out.println("Este programa codifica cadenas.");
                    System.out.println("Favor ingresa la contraseña: ");
                    ObiWan.nextLine();
                    String contraseña = ObiWan.nextLine();
                    String end = CifradoPorSubstitucion(contraseña);
                    System.out.println(end);
                    break;
                case 3:
                    System.out.println("¡Hi!Este programa crea un sobre.");
                    System.out.println("Porfavor "+tu_nombre+" ingresa la altura: ");
                    int altura = ObiWan.nextInt();
                    System.out.println("Favor ingresa el contorno que te gustaría");
                    String contorno = ObiWan.next();
                    sobre(altura,contorno);
                    break;
            }
        }while(opcion == 1 || opcion == 2 || opcion == 3 || opcion != 4);
    }
    
    public static String CifradoPorSubstitucion(String contraseña){
        String resultado = "";
        String cadena_contra = contraseña.toLowerCase();
        for (int i = 0; i < cadena_contra.length(); i ++){
            int aux = (122-(int)cadena_contra.charAt(i))+97;
            String nuevo = new Character((char) aux).toString();
            resultado += nuevo;       
                        }
         return resultado;
                   }
               //}
      
    
    public static void  UnionEInterseccion(String cadena1, String cadena2){
        String result = "";
        String result2 = "";
        String answer2="";
        String answer3 = "";
        String revisar1="";
        String nuevo="";
        String revisar_1_1 ="";
        boolean analizar = false;
        String [] conjunto1 = cadena1.split(",");
        String [] conjunto2 = cadena2.split(",");
        for (int i = 0; i < conjunto1.length; i++) {
            for (int j = 0; j < conjunto2.length; j++) {
                result = conjunto1[i] ;
                if (conjunto1[i].equals(conjunto2[j])){
                    analizar = true;
                }else{
                    analizar = false;
                    
                }
            }
        }
        if (analizar){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
            String nueva_cadena = cadena1.replace(",","");
            String nueva_cadena2 = cadena2.replace(",","");
            System.out.println("La union es: "+cadena1.concat(cadena2));
           
            if (conjunto1.length>conjunto2.length){
                for (int i = 0; i < conjunto2.length-1; i++) {
                    for (int j = 0; j < conjunto2.length-i-1; j++) {
                       if (conjunto1[j]==conjunto2[j+1]){
                           result2 += conjunto2[j+1];
                    }
                    }
 
                    
                }
     
                    }
            System.out.println("La interseccion es: C = { "+result2 +" }");
            System.out.println("No me salio Stephanie :(, pero intente.");
                }
                
            
    }
    
    public static void sobre(int altura, String contorno){
        if(altura%2==0){
        
       for (int contador = altura*2; contador >= 0; contador --){
                for (int espacios=altura*2; espacios >=  contador ; espacios -= 1 ){
                    System.out.print(" ");
                    }
                    for (int asteriscos = 1; asteriscos <= contador; asteriscos+=1){
                        System.out.print(contorno);
                    }
                    System.out.println(" ");
        
        for (int i = 0; i <= altura*2-2; i++) {
            System.out.print(contorno+" ");
            for (int j = 0; j <= altura*2+2; j++) {
                System.out.print(" ");
                
            }
            System.out.println(contorno+" ");
        }
        for (int i = 0; i < altura*2; i++) {
            System.out.print(contorno+" ");
        }
        System.out.println(" ");
       }
        }else{
            System.out.println("Favor ingrese un numero par.");
        }
        
        System.out.println("No me salio Stephanie :(, pero intente");
    }

    }
    

