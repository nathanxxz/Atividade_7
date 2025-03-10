import java.util.Scanner;

public class Questoens{
    public static boolean par_impar(int numeroo){
        Scanner sc=new Scanner(System.in);
        if (numeroo %2==0){
            System.out.println("Numero é par");
            return true;

        }
        else{
            System.out.println("Impar");
            return false;
        }
    }
    public static int numdobro(int num){
        return num+num;
    }
    public static int nummaior(int num1, int num2){
        if (num1>num2){
            return num1;

        }
        else {
            return num2;

        }

    }
    public static int tabuada(int numero){
        for(int i=1;i<=10;i++){
          int resul= numero*i;
          System.out.println(numero + " " + "x" + i + "=" + resul);
        }
        return numero;
    }
    public static Object String(){
        Scanner name=new Scanner(System.in);
        System.out.println("INFORME SEU NOME");
         String nomee=name.nextLine();
        return (nomee + " " + "Voce é o Batman?");
    }
    public static int soma(){
        Scanner numb=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int  numberr= numb.nextInt();
        for(int i=1;i<numberr;i++){
            System.out.println("INFORME UM NUMERO");
            numberr= numb.nextInt();
        }
        return numberr;
    }
    public static  int fatorial(){
        Scanner ss=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int Num= ss.nextInt();
        for(int i=1;i<Num;i++){
            Num*=i;
            System.out.println(Num);
        }
        return Num;
    }
    public static int numeroprimo(){
        Scanner sp=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int num= sp.nextInt();
        for(int i=2;i<num;i++)
            if(num%i==0){
                System.out.println("Nao é primo");
                break;
            }
            else
                System.out.println("é primo");
        return num;
    }
    public static int vetorint(){
        int [] numeros={1,2,3,4,5};
        int soma=0;
        for(int i=0;i<=numeros.length;i++){
            soma+=numeros[i];
            System.out.println(soma);


        }
        return soma;
    }
    public static int maiorvalor(){
        int [] numeros={1,2,3,4,5};
        int maior=0;
        for(int i=0;i<numeros.length;i++){
            if (maior<numeros[i]){
                maior=numeros[i];
            }
        }
        return maior;
    }
    public static String nomeinvertido(){
        String perso="Batman";
            StringBuilder sc=new StringBuilder(perso);
            String personovo=sc.reverse().toString();
            System.out.println(perso);

        return personovo;
    }
    public static boolean palavraDtrasprafrente(){
       String palavra="arara";
        String palavraa="";
        for(int i=palavra.length()-1;i>=0;i--){
            palavraa+=palavra.charAt(i);
        }
        return palavra.equals(palavraa);
    }
    public static double celsius(){
        Scanner cel=new Scanner(System.in);
        System.out.println("INFORME O CELSIUS");
        double c= cel.nextDouble();
        double f=c*((double) 9 /5)+32;
        return f;
    }
    public static int vogais(){
        Scanner vg=new Scanner(System.in);
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;

        System.out.println("INFORME QUALQUER NOME");
        String vogal= vg.next();
        for(int f=0;f<vogal.length();f++){
            char n=vogal.charAt(f);
            if (n == 'a') a++;
            if (n == 'e') e++;
            if (n == 'i') i++;
            if (n == 'o') o++;
            if (n == 'u') u++;
        }
        return a + e + i + o + u;
    }
    public static int horario(){
        Scanner h=new Scanner(System.in);
        System.out.println("INFORME A HORA");
        int hora= h.nextInt();
        System.out.println("INFORME OS MINUTOS");
        int min= h.nextInt();
        if (hora >=00.00 && hora <=11.59 && min >=1 && min<=59){
            System.out.println("AM");

        }
        else {
            System.out.println("PM");
        }
        return hora;
    }
    public static int vetorpares() {
        int[] inteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < inteiros.length; i++) {
            if (i % 2 == 0) {
             System.out.println("PARES SAO:");
            }
            else {
                System.out.println(inteiros[i]);
            }

        }


        return 0;
    }
    public static int vetoRepetido(){
        int [] rep={1,1,1,2,2,3,6,6};
        for (int i=0;i<rep.length;i++){
            if (rep[i]!=1 && rep[i]!=2 && rep[i]!=6){
                return rep[i];
            }

        }
        return 0;
    }
    public static int crescente(){
        int [] vetor={10,9,8,7,6,5,4,3,2,1};
        for (int i=vetor.length-1;i>=0;i--){
                System.out.println(vetor[i]);
            }

        return 0;
    }
    public static int fibonnaci(){
        Scanner fin=new Scanner(System.in);
        System.out.println("INFORME UM NUMERO");
        int num= fin.nextInt();
        for(int i=1;i<num;i++){
            num*=i;
            System.out.println(num);
        }

        return num;
    }
    public static boolean numperfect(){
        Scanner perfect=new Scanner(System.in);
        int soma=0;
        System.out.println("INFORME UM NUMERO");
        int n= perfect.nextInt();
        for (int i=0;i<n;i++){
            soma+=i;
            if (soma==n){
                return true;
            }
        }
        return false;
    }
    public static int somadigi(){
        Scanner digi=new Scanner(System.in);
        int n=12345;
        int soma = 0;
        while (n> 0){
            int  resto = n % 10;
            n = (n - resto)/10;
            soma += resto;
        }
        return soma;
    }
    public static int hh(){
        Scanner k=new Scanner(System.in);
        System.out.println("INFORME A QTD DE SEGUNDOS");
        int segun= k.nextInt();
        int horas=segun/3600;
        int min=(segun%3600)/60;
        segun=(segun%3600)%60;
        System.out.println("A HORA É" + " " + horas + "hh" + " " + min + "mm" + " " + segun + " " + "ss");


        return 0;
    }
    public static boolean data(){
        Scanner valido=new Scanner(System.in);
        System.out.println("INFORME O DIA");
        int day= valido.nextInt();
        System.out.println("INFORME O MES");
        int mes=valido.nextInt();
        System.out.println("INFORME O ANO");
        int ano=valido.nextInt();
        if (day>=1 && day<=31 && mes >=1 && mes<=12 && ano>=2025){
            return true;

        }else {
            System.out.println("A DATA É" + " " + day + " " + mes + " " + " " + ano);
        }

        return false;
    }

    public static boolean vetores(){
        boolean fim=false;
        int [] vetor1={1};
        int [] vetor2={2};
        for (int i=0;i<vetor1.length;i++){
            for (int n=0;n<vetor2.length;n++){
                if (vetor1[i]==vetor2[n]){
                    return true;
                }
        }
    }

        return fim;
    }
    public static String vogais2(){
        String name="Nathan";
        String vogais=name.replaceAll("(?i)[aeiou]","*");

        return vogais;

    }
    //Implemente uma função que receba uma string e retorne true se for composta apenas por números, caso contrário, false.
    public static boolean apenasnumero(){
        boolean k=false;
        Scanner tr=new Scanner(System.in);
        System.out.println("INFORME UMA PALVRA");
        String palavra= tr.nextLine();
        if (palavra.matches("\\d+")){
              return true;

        }
        else {
            return k;
        }

    }
    public static String ocorrencias(){
        String name="N a t h a n";
        String ocorre=name.replaceAll("(?i)[ ]","-");

        return ocorre;

    }
}






