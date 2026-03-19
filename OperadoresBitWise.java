public class OperadoresBitWise {
    public static void main(String[] args) {
        var value1 = 5;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 6;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        var value3 = value1 | value2;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2, value3, binary3);
        var value4 = value1 ^ value2;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2, value4, binary4);
        var value5 = value1 << value2;
        var binary5 = Integer.toBinaryString(value5);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2, value5, binary5);
        var value6 = value1 >> value2;
        var binary6 = Integer.toBinaryString(value6);
        System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2, value6, binary6);
    }
}
