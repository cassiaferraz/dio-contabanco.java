/*significa 'enquanto' enquanto uma condição for válida, o bloco de código será executado
 * while (expressão booleana de validação)
 * {
 *      comando que será executado até que:
 *      a expressão de validação torne-se falsa
 * }
 * 
 * EXEMPLO: Eu tenho 50$ e estou no mercado, posso encher meu carrinho ENQUANTO (while)
 * não atingi o valor gasto.
 */

import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

                System.out.println("Doce do valor: " + valorDoce + "Adicionado ao carrinho");
                mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:"+ mesada);
        System.out.println("João gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current() .nextDouble(2,8);
    }
}
