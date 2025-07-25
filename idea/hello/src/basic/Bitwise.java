package basic;
public class Bitwise {
    public static void main(String[] args) {
        /*
        0 = false
        1 = true
        6 | 5 = 7
        110 | 101 = 111
        6 & 5 = 4
        110 & 101 = 100
        * & bitwise
        * | bitwise
        * ^ xor bitwise (xor = se os números são iguais = 0 diferentes = 1)
        6 & 5 = 3
        110 & 101 = 11
        ~ complement ou negação
        6 = 0000000000000000000000110
        ~6 = -7
        -7 = 1111111111111111111111001
        * << shift operator left
        9 = 1001
        2 = 10
        9 << 2 = 36
        1001 << 10 = 100100
        * >> shift operator right
        8 = 100
        2 = 10
        8 >> 2 = 2
        1000 >> 10 = 10
        diferença caso use um -8 e 8 no shift left e shift right
        shift left = empurra pra esquerda
        shift right = empurra pra direita se for número positivo ele preenche com 0 a esquerda, se for negativo com 1

        >>> shift operator right que funciona igual o shift operator left


        * */
        var value1 = 5;
        var binary1 = Integer.toBinaryString(value1);
        System.out.println(binary1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        // 0000000000000000000000111
        // 0000000000000000000000110
        // 0000000000000000000000110
    }
}
