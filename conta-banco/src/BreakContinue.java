/*Estrutura controle de fluxo FOR:
 * "for (bloco de inicialização); expressão booleana de validação; bloco de atualização;"
 */

public class BreakContinue {
    public static void main(String[] args) {
        
        for (int numero = 1; numero <=5; numero ++){
            /*essa condição vai fazer parar a contagem no 2,
             pois eu pedi que não mostrasse o 3 */

            if(numero == 3)
                continue;
            /*colocando o 'continue' a contagem vai continuar até o 5
             * porém pulando o número 3 a contagem será: (1,2,4,5)
             */

             System.out.println(numero);
        }
    }
}
