/*Estrutura controle de fluxo FOR:
 * "for (bloco de inicialização); expressão booleana de validação; bloco de atualização;"
 */


public class ForArray{
    public static void main(String[] args) {
        String alunos [] = { "CASSIA", "PALOMA", "CLEITON", "PABLO"};

        //length= tamanho/ ouseja: enquanto x for menor que o tamanho de alunos
        for (int x=0; x<alunos.length; x++){
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);

            
            //ou de maneira mais agradável podemos usar o método:
            /*for (String aluno : aluno){
                System.out.printIn("nome do aluno é: " + aluno);}
             * 
             */
        }
    }
}