import java.util.Scanner;


public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int menu=-1;
        while (menu!=0){
            System.out.println("------------------------------------");
            System.out.println("            MENU QUESTS             ");
            System.out.println("------------------------------------");
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("VER NUMERO PAR OU IMPAR (1) ");
            System.out.println("DOBRO DE OUTRO NUMERO (2) ");
            System.out.println("VER MAIOR NUMERO (3) ");
            System.out.println("VER TABUADA (4) ");
            System.out.println("SAUDACAO (5) ");
            System.out.println("SOMA DE TODOS OS NUMEROS (6) ");
            System.out.println("VER FATORIAL (7) ");
            System.out.println("VER NUMERO PRIMO (8) ");
            System.out.println("SOMA VETOR (9) ");
            System.out.println("MAIOR VALOR DE VETOR (10) ");
            System.out.println("VER NOME INVERTIDO (11) ");
            System.out.println("VER SE PALIDROMO (13) ");
            System.out.println("TESTE (14) ");
            System.out.println("VER FIBONNACI (15) ");
            System.out.println("CONVERSAO CELSIUS (16) ");
            System.out.println("VER NUM PERFECT (17) ");
            System.out.println("TESTE (18) ");
            System.out.println("DIGITOS (20) ");
            System.out.println("VER NUMEROS PARES DE UM VETOR (26) ");
            System.out.println("VER DATA VALIDA (28) ");
            System.out.println("VER FORMATO HH/MIN/SS (29) ");
            System.out.println("VER QUANTIDADE DE VOGAIS (23) ");
            System.out.println("SUBST OCORRENCIA (30) ");
            System.out.println("VER HORARIO (35) ");
            System.out.println("STRING COMPOSTA POR NUMEROS (41) ");
            System.out.println("VER SE VETORES SAO IGUAIS (47) ");
            System.out.println("VOGAIS POR * (49)");
            System.out.println("SAIR DO SISTEMA (0) ");
            System.out.println("------------------------------------");
            System.out.println();
            System.out.println("===============");
            System.out.println("INFORME UMA OP");
            System.out.println("===============");
            menu= sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("INFORME UM NUMERO");
                    int numeroo= sc.nextInt();
                    boolean  result=Questoens.par_impar(numeroo);
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("INFORME UM NUMERO");
                    int num= sc.nextInt();
                    int result2=Questoens.numdobro(num);
                    System.out.println(result2);
                    break;
                case 3:
                    System.out.println("INFORME UM NUMERO");
                    int num1= sc.nextInt();
                    System.out.println("INFORME  OUTRO NUMERO");
                    int num2= sc.nextInt();
                    int result3=Questoens.nummaior(num1,num2);
                    System.out.println(result3);
                    break;
                case 4:
                    System.out.println("INFORME UM NUMERO");
                    int numero= sc.nextInt();
                    int result4=Questoens.tabuada(numero);
                    System.out.println(result4);
                    break;
                case 5:
                     String result5= (String) Questoens.String();
                    System.out.println(result5);
                    break;
                case 6:
                    int result6=Questoens.soma ();
                    System.out.println(result6);
                    break;
                case 7:
                    int result7=Questoens.fatorial();
                    System.out.println(result7);
                    break;
                case 8:
                    int result8=Questoens.numeroprimo();
                    System.out.println(result8);
                    break;
                case 9:
                    int result9=Questoens.vetorint();
                    System.out.println(result9);
                    break;
                case 10:
                    int result10=Questoens.maiorvalor();
                    System.out.println(result10);
                    break;
                case 11:
                    String result11=Questoens.nomeinvertido();
                    System.out.println(result11);
                    break;
                case 13:
                    boolean result13=Questoens.palavraDtrasprafrente();
                    System.out.println(result13);
                    break;
                case 14:
                    int result90=Questoens.crescente();
                    System.out.println(result90);
                    break;
                case 15:
                    int result91=Questoens.fibonnaci();
                    System.out.println(result91);
                    break;
                case 16:    
                    double result14=Questoens.celsius();
                    System.out.println(result14);
                    break;
                case 17:
                    boolean result92=Questoens.numperfect();
                    System.out.println(result92);
                    break;
                case 18:
                    int  result17=Questoens.vetorpares();
                    System.out.println(result17);
                    break;
                case 20:
                    int result93=Questoens.somadigi();
                    System.out.println(result93);
                    break;
                case 23:
                    int resul15=Questoens.vogais();
                    System.out.println(resul15);
                    break;
                case 26:
                    int result18=Questoens.vetoRepetido();
                    System.out.println(result18);
                    break;
                case 28:
                    boolean result94=Questoens.data();
                    System.out.println(result94);
                    break;
                case 29:
                    int resul94=Questoens.hh();
                    System.out.println(resul94);
                    break;
                case 30:
                    String result819=Questoens.ocorrencias();
                    System.out.println(result819);
                    break;
                case 35:
                    int result16=Questoens.horario();
                    System.out.println(result16);
                    break;
                case 41:
                    boolean result100=Questoens.apenasnumero();
                    System.out.println(result100);
                    break;
                case 47:
                    boolean result98=Questoens.vetores();
                    System.out.println(result98);
                    break;
                case 49:
                    String result99=Questoens.vogais2();
                    System.out.println(result99);
                    break;


                case 0:
                    System.out.println("==================");
                    System.out.println("SAINDO DO SISTEMA");
                    System.out.println("==================");
                    break;
                default:
                    System.out.println("OP INVALIDA, TENTE NOVAMENTE");




            }

        }
    }
}
