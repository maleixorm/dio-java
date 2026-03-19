public class OperadoresBitWise {
    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        System.out.printf(" %s | %s = %s", value1, value2, value1 | value2);
        System.out.println("\n");
        var value3 = 8;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Terceiro número da operação %s (representação binária %s)\n", value3, binary3);
    }
}
