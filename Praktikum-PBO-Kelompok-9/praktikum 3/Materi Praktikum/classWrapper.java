public class classWrapper
{
    public static void main(String[] args) 
    {
        // Autoxing - primitif ke wrapper
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoxing

        // Unboxing - wrapper ke primitif
        Integer anotherWrapper = 200;
        int anotherPrimitif = anotherWrapper; // Unboxing

        //String ke wrapper/primitif
        String strNumber = "123";
        String strDouble = "45.67";
        String strBoolean = "true";

        // Parse methods
        int num = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        Boolean flag = Boolean.parseBoolean(strBoolean);

        System.out.println("Parsed int: " + num);
        System.out.println("Parsed double: " + decimal);
        System.out.println("Parsed boolean: " + flag);

        Integer wrapperNum = Integer.valueOf(strNumber);
        Double wrapperDecimal = Double.valueOf(strDouble);

        System.out.println("Wrapper Integer: " + wrapperNum);
        System.out.println("Wrapper Double: " + wrapperDecimal);

        // Wrapper/primtif ke String
        int value = 789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);
        System.out.println("toString(): " + strValue1);
        System.out.println("valueOf(): " + strValue2);

        // Integer methods
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);

        // Konversi sistem bilangan
        int decimal2 = 255;
        System.out.println("Binary " + Integer.toBinaryString(decimal2));
        System.out.println("Octal " + Integer.toOctalString(decimal2));
        System.out.println("Hex " + Integer.toHexString(decimal2));
    }
}