
import java.util.Scanner;


//import java.util.Scanner;

public class PruebaParaSubirEnGit {

//    public static void main(String[] args) {
//        char letra;
//        char avcd;
//        System.out.println("Por favor ingrese una letra");
//        Scanner letraV = new Scanner(System.in);
//        int letra1 = letraV.nextInt();
//        
//        if (letra =! letraV) {
//            System.out.println("Su letra es una vocal");
//        } else {
//            System.out.println("Es una consonante");
//        }
//    }
//    
//}
//    public static void main(String[] args) {
//        System.out.println("Por favor ingrese una letra");
//        Scanner scanner = new Scanner(System.in);
//        char letra = scanner.next().charAt(0);
//        
//        if (esVocal(letra)) {
//            System.out.println("La letra ingresada es una vocal");
//        } else {
//            System.out.println("La letra ingresada es una consonante");
//        }
//    }
//    
//    private static boolean esVocal(char letra) {
//        letra = Character.toLowerCase(letra); // Convertir la letra a minúscula para evitar problemas de comparación
//        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
//    }
//}

public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    String String = "Por favor digite tres numeros a continuacion";
    System.out.println("Digite el primer numero");
    int numeroUno = numeros.nextInt();
    System.out.println("Digite el segundo numero");
    int numeroDos = numeros.nextInt();
    System.out.println("Digite el tercer numero");
    int numeroTres = numeros.nextInt();

    
   int resultado = (numeroUno + numeroDos );
   int resultadoDos = resultado * numeroTres;
    System.out.println("El resultado de la suma de " + numeroUno +" y " +  numeroDos + " es " + resultado);
    System.out.println("Y multiplicado por el tercer numero es: " + resultadoDos);
}
}

