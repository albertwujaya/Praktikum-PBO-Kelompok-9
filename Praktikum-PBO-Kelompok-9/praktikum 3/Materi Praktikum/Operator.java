public class Operator 
{
    public static void main(String[] args) 
    {
        int a = 10, b =3;

        System.out.println("a + b = " + (a + b)); // Penjumlahan: 13
        System.out.println("a - b = " + (a - b)); // Pengurangan: 7
        System.out.println("a * b = " + (a * b)); // Perkalian: 30
        System.out.println("a / b = " + (a / b)); // Pembagian: 3
        System.out.println("a % b = " + (a % b)); // Modulus: 1
        
        // Increment dan Decrement
        System.out.println("++a = " + (++a)); // Pre-increment: 11
        System.out.println("b-- = " + (b--)); // Post-decrement: 3, b = 2




        int x = 5, y = 8;
        System.out.println("x == y " + (x == y)); //false
        System.out.println("x != y " + (x != y)); //true
        System.out.println("x > y " + (x > y)); //false
        System.out.println("x < y " + (x < y)); //true
        System.out.println("x >= y " + (x >= y)); //false
        System.out.println("x <= y " + (x <= y)); //true




        boolean p = true, q = false;
        System.out.println("p && q:" + (p && q)); // AND: false
        System.out.println("p || q:" + (p || q)); // OR: true
        System.out.println("!p:" + (!p)); // NOT: false

        // Short-circuit evaluation
        int c = 5, d = 0;
        boolean result = (d != 0) && (c / d > 2); // Tidak error 
        System.out.println("Result: " + result); // false

        

        int num = 10;

        num += 5; // num = num + 5; // 15
        num -= 3; // num = num - 3; // 12
        num *= 2; // num = num * 2; // 24
        num /= 4; // num = num / 4; // 6
        num %= 4; // num = num % 4; // 2
        System.out.println("Hasil akhir: " + num);


        int score = 85;
        String grade = (score >= 80) ? "A" : (score >= 70) ? "B" : "C";
        System.out.println("Nilai: " + grade);

        // Penggunaan untuk mencari nilai maximum
        int max = (10 > 5) ? 10 : 5;
        System.out.println("Maximum: " + max);



        int e = 12; // 1100 dalam biner
        int f = 10; // 1010 dalam biner

        System.out.println("e & f = " + (e & f)); // AND: 8 (1000)
        System.out.println("e | f = " + (e | f)); // OR: 14 (1110)
        System.out.println("e ^ f = " + (e ^ f)); // XOR: 6 (0110)
        System.out.println("~e = " + (~e)); // NOT: -13
        System.out.println("e << 2 = " + (e << 2)); // Left shift: 48 
        System.out.println("e >> 2 = " + (e >> 2)); // Right shift: 3 




        
    }
}