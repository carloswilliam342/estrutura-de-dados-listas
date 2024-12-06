package lista02;

public class Matrizes {
    public static void q01() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz com diagonal principal zerada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q02() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz com diagonal secundária zerada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q03() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos da diagonal secundária: [");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i]);
            if (i < matriz.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void q04() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("Soma dos elementos da diagonal secundária: " + soma);
    }

    public static void q05() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos da diagonal secundária e abaixo: [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    System.out.print(matriz[i][j]);
                    if (!(i == matriz.length - 1 && j == matriz.length - 1)) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println("]");
    }

    public static void q06() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    soma += matriz[i][j];
                    contador++;
                }
            }
        }

        double media = (double) soma / contador;
        System.out.printf("Média dos elementos da diagonal secundária e abaixo: %.2f\n", media);
    }

    public static void q07() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos abaixo da diagonal secundária: [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1) {
                    System.out.print(matriz[i][j]);
                    if (!(i == matriz.length - 1 && j == matriz.length - 1)) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println("]");
    }

    public static void q08() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j > matriz.length - 1 && matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("Maior valor abaixo da diagonal secundária: " + maior);
    }

    public static void q09() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos da diagonal secundária e acima: [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1) {
                    System.out.print(matriz[i][j]);
                    if (!(i == matriz.length - 1 && j == 0)) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println("]");
    }

    public static void q10() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= matriz.length - 1 && matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Menor valor na diagonal secundária e acima: " + menor);
    }

    public static void q11() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos acima da diagonal secundária: [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1) {
                    System.out.print(matriz[i][j]);
                    if (!(i == 0 && j == matriz.length - 2)) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println("]");
    }

    public static void q12() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int produto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j < matriz.length - 1) {
                    produto *= matriz[i][j];
                }
            }
        }

        System.out.println("Produto dos elementos acima da diagonal secundária: " + produto);
    }

    public static void q13() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = matrizA[i][j] * matrizA[i][j]; // Quadrado
                } else {
                    matrizB[i][j] = matrizA[i][j] * matrizA[i][j] * matrizA[i][j]; // Cubo
                }
            }
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q14() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[j][matrizA.length - 1 - i] = matrizA[i][j];
            }
        }

        System.out.println("Matriz rotacionada 90°:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q15() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[matrizA.length - 1 - i][matrizA.length - 1 - j] = matrizA[i][j];
            }
        }

        System.out.println("Matriz rotacionada 180°:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q16() {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[matrizA.length - 1 - j][i] = matrizA[i][j];
            }
        }

        System.out.println("Matriz rotacionada 270°:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void q17() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Elementos destacados (em vermelho): [");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || i + j == matriz.length - 1) { // Condição para o "X"
                    System.out.print(matriz[i][j]);
                    if (!(i == matriz.length - 1 && j == matriz.length - 1)) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println("]");
    }


}
