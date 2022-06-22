import java.util.Scanner;

public class CacaPalavras {
    // Atribuindo as palavras a serem procuradas à matriz palavras
    private String[][] palavrasEntrada(String[][] palavras) {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";

        return palavras;
    }

    // Atribuindo caracteres à matriz mapa
    private String[][] mapaEntrada(String[][] mapa) {
        mapa[0][0] = "D";
        mapa[0][1] = "C";
        mapa[0][2] = "Q";
        mapa[0][3] = "W";
        mapa[0][4] = "E";
        mapa[1][0] = "I";
        mapa[1][1] = "X";
        mapa[1][2] = "F";
        mapa[1][3] = "O";
        mapa[1][4] = "R";
        mapa[2][0] = "F";
        mapa[2][1] = "F";
        mapa[2][2] = "R";
        mapa[2][3] = "G";
        mapa[2][4] = "F";
        mapa[3][0] = "E";
        mapa[3][1] = "L";
        mapa[3][2] = "I";
        mapa[3][3] = "H";
        mapa[3][4] = "W";
        mapa[4][0] = "L";
        mapa[4][1] = "S";
        mapa[4][2] = "F";
        mapa[4][3] = "O";
        mapa[4][4] = "U";
        mapa[5][0] = "S";
        mapa[5][1] = "D";
        mapa[5][2] = "G";
        mapa[5][3] = "T";
        mapa[5][4] = "S";
        mapa[6][0] = "E";
        mapa[6][1] = "J";
        mapa[6][2] = "H";
        mapa[6][3] = "E";
        mapa[6][4] = "T";
        mapa[7][0] = "I";
        mapa[7][1] = "I";
        mapa[7][2] = "I";
        mapa[7][3] = "J";
        mapa[7][4] = "M";
        mapa[8][0] = "X";
        mapa[8][1] = "C";
        mapa[8][2] = "K";
        mapa[8][3] = "B";
        mapa[8][4] = "G";
        mapa[9][0] = "V";
        mapa[9][1] = "E";
        mapa[9][2] = "T";
        mapa[9][3] = "O";
        mapa[9][4] = "R";

        return mapa;
    }

    // Imprimindo as palavras do caça palavras
    private void palavrasImprimir(String[][] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras[i].length; j++) {
                System.out.println(palavras[i][j]);
            }
        }
    }

    /**
     * O método palavrasRepostas usa a segunda coluna da matriz palavras e se a
     * palavra não foi encontrada imprime
     * "Palavra NÃO encontrada". Mas se a palavra foi encontrada deve-se imprimir a
     * linha e coluna do mapa do primeiro
     * caratere da palavra (conforme demostrado no exemplo de execução).
     */
    private void palavrasRespostas(Scanner teclado) {

    }

    // Imprimindo os caracteres da matriz mapa conforme demostrado no exemplo de
    // execução
    private void mapaImprimir(String[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
        }
    }

    // Fazendo a pesquisa para verificar se as palavras da matriz palavras se
    // encontram na matriz mapa
    private void mapaPesquisa() {

    }

    // Construtor
    public CacaPalavras() {
        Scanner teclado = new Scanner(System.in);

        String[][] palavras = new String[5][2];
        String[][] mapa = new String[10][5];

        palavras = palavrasEntrada(palavras);
        mapa = mapaEntrada(mapa);

        System.out.println("Informe a opção que deseja de acordo com o menu:"
                + "\n Opção 1: listar palavras;"
                + "\n Opção 2: listar o mapa;"
                + "\n Opção 3: listar respostas;"
                + "\n Opção 4: sair do menu."
                + "\nQualquer outra opção será considerada como errada.");
        int opcao = teclado.nextInt();

        do {
            switch (opcao) {
                case 1:
                    // Imprime infinitamente
                    palavrasImprimir(palavras);
                    break;
                case 2:
                    // Imprime infinitamente
                    mapaImprimir(mapa);
                    break;
                case 3:
                    palavrasRespostas(teclado);
                    break;
                // Imprime infinitamente e considera opção 4 como errada
                default:
                    System.out.println("Opção ERRADA!...");
            }
        } while (opcao != 4);

        teclado.close();
    }

    public static void main(String[] args) {
        new CacaPalavras();
    }
}
