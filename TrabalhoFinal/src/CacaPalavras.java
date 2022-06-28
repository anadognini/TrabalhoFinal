import java.util.Scanner;

public class CacaPalavras {
    private String[][] palavrasEntrada(String[][] palavras) {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";

        return palavras;
    }

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

    private void palavrasImprimir(String[][] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i][0]);
        }
    }
    
    private void mapaPesquisa(String[][] palavras, String palavraCompleta) {
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i][0].matches(palavraCompleta)) {
                System.out.println(palavras[i][0] + " ENCONTRADA");
            } else {
                System.out.println(palavras[i][0] + " NÃO ENCONTRADA");
            }
        }
    }

    private void mapaImprimir(String[][] mapa) {
        System.out.println(" ---------------------");
        int breakLine = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (breakLine == 5) {
                    System.out.println(" |");
                    breakLine = 0;
                }
                System.out.print(" | " + mapa[i][j]);
                breakLine++;
            }
        }

        System.out.println(" |");
        System.out.println(" ---------------------");
    }

    private void palavrasResposta(String[][] mapa, String[][] palavras) {
        String palavraCompleta = "";
        int breakLine = 0;

        /** Busca palavras da direita para a esquerda */
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (breakLine == 5) {
                    palavraCompleta = "";
                    breakLine = 0;
                }

                breakLine++;
                palavraCompleta += mapa[i][j];
            }

            mapaPesquisa(palavras, palavraCompleta);
        }

        /** Busca palavras da esquerda para a direita */
        for (int i = 0; i < 10; i++) {
            for (int j = 4; j >= 0; j--) {
                if (breakLine == 5) {
                    palavraCompleta = "";
                    breakLine = 0;
                }

                breakLine++;
                palavraCompleta += mapa[i][j];
            }

            mapaPesquisa(palavras, palavraCompleta);
        }

        /** Busca palavras de cima pra baixo */
        for (int j = 0; j < mapa[0].length; j++) {
            for (int i = 0; i < mapa.length; i++) {
                if (breakLine == 10) {
                    palavraCompleta = "";
                    breakLine = 0;
                }

                breakLine++;
                palavraCompleta += mapa[i][j];
            }

            mapaPesquisa(palavras, palavraCompleta);
        }

        /** Busca palavras de baixo para cima */ 
        for (int j = 0; j < 5; j++) {
            for (int i = 9; i >= 0; i--) {
                if (breakLine == 10) {
                    palavraCompleta = "";
                    breakLine = 0;
                }

                breakLine++;
                palavraCompleta += mapa[i][j];
            }

            mapaPesquisa(palavras, palavraCompleta);
        }
    }

    public CacaPalavras() {
        Scanner teclado = new Scanner(System.in);

        String[][] palavras = new String[5][2];
        String[][] mapa = new String[10][5];

        palavras = palavrasEntrada(palavras);
        mapa = mapaEntrada(mapa);

        int opcao;

        do {
            System.out.println("Informe a opção que deseja de acordo com o menu:"
                    + "\n Opção 1: listar palavras;"
                    + "\n Opção 2: listar o mapa;"
                    + "\n Opção 3: listar respostas;"
                    + "\n Opção 4: sair do menu.");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    palavrasImprimir(palavras);
                    break;
                case 2:
                    mapaImprimir(mapa);
                    break;
                case 3:
                    palavrasResposta(mapa, palavras);
                    break;
            }
        } while (opcao != 4);

        teclado.close();
    }

    public static void main(String[] args) {
        new CacaPalavras();
    }
}
