package Aprendiendo;

import java.util.Scanner;


public class Pollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int op;
        int contPollo= 0,contCarne=0,contCazuela=0,contFideos=0;
        
        do{
            System.out.println("=+M E N U+=");
            System.out.println("------------");
            System.out.println("1.pollo con arroz");
            System.out.println("2.carne con pure");
            System.out.println("3.cazuela de pollo");
            System.out.println("4.fideos con salsa");
            System.out.println("0.salir");
            
            System.out.println("selecciona una opcion:");
            op=teclado.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("elegiste pollito con papa");
                    contPollo++;
                    break;
                case 2:
                    System.out.println(" elegiste carnita");
                    contCarne++;
                    break;
                case 3:
                    System.out.println("elegiste cazuela");
                    contCazuela++;
                    break;
                case 4:
                    System.out.println("elegiste fideos");
                    contFideos++;
                    break;
                case 0:
                    System.out.println("          =+V E N T AS+=");
                    System.out.println("--------------------------------------");
                    System.out.println("se han vendido: "+contPollo+"  pollo con arroz");
                    System.out.println("se han vendido: "+contCarne+"  carne con pure");
                    System.out.println("se han vendido: "+contCazuela+"  cazuela de pollo");
                    System.out.println("se han vendido: "+contFideos+"  fideos con salsa");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
            
        }while(op!=0);
    }
    
}