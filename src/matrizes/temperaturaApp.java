package matrizes;

public class temperaturaApp {

    public static void main(String[] args) {
        String[] cidades = new String[]{"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = new int[][]{{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 3}};
        int temperaturaMinimaIndex = 0;
        int temperaturaMinima = temperaturas[0][0];
        int temperaturaMaximaIndex = 0;

        int linha;
        for (int coluna = 0; temperaturaMaximaIndex < 10; ++temperaturaMaximaIndex) {
            linha = temperaturas[temperaturaMaximaIndex][coluna];
            if (temperaturaMinima > linha) {
                temperaturaMinima = temperaturas[temperaturaMaximaIndex][coluna];
                temperaturaMinimaIndex = temperaturaMaximaIndex;
            }
        }

        temperaturaMaximaIndex = 0;
        int temperaturaMaxima = temperaturas[0][1];
        linha = 1;

        for (int coluna = 1; linha < 10; ++linha) {
            int temperatura02 = temperaturas[linha][coluna];
            if (temperaturaMaxima < temperatura02) {
                temperaturaMaxima = temperaturas[linha][coluna];
                temperaturaMaximaIndex = linha;
            }
        }

        System.out.println("A cidade com menor temperatura é : " + cidades[temperaturaMinimaIndex] + " (" + temperaturaMinima + ")");
        System.out.println("A cidade com maior temperatura é : " + cidades[temperaturaMaximaIndex] + " (" + temperaturaMaxima + ")");
    }
}