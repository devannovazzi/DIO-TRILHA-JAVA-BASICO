public class Operadores {
    public static void main(String[] args){
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //x repetição

        int numero = 5;
        numero++;
        //numero = numero + 1;
        System.out.println(numero);

        //
        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && 7 > 4 ){
            System.out.println("as duas condições são verdadeiras");
        }
        
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }


    }
    
}
