import java.util.Scanner;

public class ejer1
{
    public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca el primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca el segundo número: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );
    }
}
