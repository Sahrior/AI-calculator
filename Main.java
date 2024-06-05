import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nupur: Assalmualaikum dear, i will help you to change number on their base.");
        System.out.print("Me: ");
        StringBuilder line1 = new StringBuilder(sc.nextLine());
        int flag = 69;
        for(int i = 0; i<line1.length(); i++){
            if(line1.charAt(i)>='A' && line1.charAt(i)<'Z'){
                flag = 100;
            }
        }
        if(flag == 100){
            System.out.println("Nupur: I am having hard time understanding Uppercase letters, can you write in lowercase pls...!");
            System.out.print("Me: ");
            StringBuilder line2 = new StringBuilder(sc.nextLine());
            String substring1 = "binary";
            String substring2 = "octal";
            String substring3 = "decimal";
            String substring4 = "hexadecimal";
            int flag1 = 69;


            if (line2.indexOf(substring1) != -1 ||
                    line2.indexOf(substring2) != -1 ||
                    line2.indexOf(substring3) != -1 ||
                    line2.indexOf(substring4) != -1) {
                flag1 = 100;
            }
            if(flag1==100){
                String to = "from";
                String line2str = line2.toString(); // convert string builder to string
                int index;
                index = line2str.indexOf(to);
                int binary = 0;
                int octal = 0;
                int decimal = 0;
                int hexadecimal = 0;
                if (line2.indexOf(substring1) != -1) {
                    binary = 1;
                }
                if (line2.indexOf(substring2) != -1) {
                    octal = 1;
                }
                if (line2.indexOf(substring3) != -1) {
                    decimal = 1;
                }
                if (line2.indexOf(substring4) != -1) {
                    hexadecimal = 1;
                }
                /*System.out.println("binary: " + binary);
                System.out.println("octal: " + octal);
                System.out.println("decimal: " + decimal);
                System.out.println("hexadecimal: " + hexadecimal);*/
                if(binary==1){
                    if(hexadecimal == 1){
                        int indexbinary = line2.indexOf(substring1);
                        int indexhexadecimal = line2.indexOf(substring4);
                        if(indexbinary < indexhexadecimal){
                            binarytohexa();
                        }else{
                            hexatobinary();
                        }
                    }else if(octal == 1){
                        int indexbinary = line2.indexOf(substring1);
                        int indexoctal = line2.indexOf(substring2);
                        if(indexbinary<indexoctal){
                            binarytooctal();
                        }else{
                            octaltobinary();
                        }
                    }else if(decimal == 1){
                        int indexbinary = line2.indexOf(substring1);
                        int indexdecimal = line2.indexOf(substring3);
                        if(indexbinary<indexdecimal){
                            binarytodecimal();
                        }else{
                            decimaltobinary();
                        }
                    }
                }else if(decimal == 1){
                    if(hexadecimal==1){
                        int indexdecimal = line2.indexOf(substring3);
                        int indexhexadecimal = line2.indexOf(substring4);
                        if(indexdecimal<indexhexadecimal){
                            decimaltohexa();
                        }else{
                            hexatodecimal();
                        }
                    }else if(octal == 1){
                        int indexdecimal = line2.indexOf(substring3);
                        int indexoctal = line2.indexOf(substring2);
                        if(indexdecimal<indexoctal){
                            decimaltooctal();
                        }else{
                            octaltodecimal();
                        }

                    }else if(binary ==1){
                        int indexdecimal = line2.indexOf(substring3);
                        int indexbinary = line2.indexOf(substring1);
                        if(indexdecimal<indexbinary){
                            deimaltobinary();
                        }else{
                            binarytodecimal();
                        }

                    }
                }else if(octal==1){
                    if(binary == 1){
                        int indexoctal = line2.indexOf(substring2);
                        int indexbinary = line2.indexOf(substring1);
                        if(indexoctal<indexbinary){
                            octaltobinary();
                        }else{
                            binarytooctal();
                        }

                    }else if(decimal == 1){
                        int indexoctal = line2.indexOf(substring2);
                        int indexdecimal = line2.indexOf(substring3);
                        if(indexoctal<indexdecimal){
                            octaltodecimal();
                        }else{
                            decimaltooctal();
                        }

                    }else if(hexadecimal==1){
                        int indexoctal = line2.indexOf(substring2);
                        int indexhexa = line2.indexOf(substring4);
                        if(indexoctal<indexhexa){
                            octaltohexa();
                        }else{
                            hexatooctal();
                        }

                    }

                }else if(hexadecimal==1){
                    if(binary == 1){
                        int indexhexa  = line2.indexOf(substring4);
                        int indexbinary = line2.indexOf(substring1);
                        if(indexhexa<indexbinary){
                            hexatobinary();
                        }else{
                            binarytohexa();
                        }

                    }else if(octal == 1){
                        int indexhexa  = line2.indexOf(substring4);
                        int indexoctal = line2.indexOf(substring2);
                        if(indexhexa<indexoctal){
                            hexatooctal();
                        }else{
                            octaltohexa();
                        }

                    }else if(decimal ==1){
                        int indexhexa  = line2.indexOf(substring4);
                        int indexdecimal = line2.indexOf(substring3);
                        if(indexhexa<indexdecimal){
                            hexatodecimal();
                        }else{
                            decimaltohexa();
                        }

                    }
                }

            }else{

            }

        }else{
            String substring1 = "binary";
            String substring2 = "octal";
            String substring3 = "decimal";
            String substring4 = "hexadecimal";
            int flag1 = 69;
            //int flag1 = 69;


            if (line1.indexOf(substring1) != -1 ||
                    line1.indexOf(substring2) != -1 ||
                    line1.indexOf(substring3) != -1 ||
                    line1.indexOf(substring4) != -1) {
                flag1 = 100;
            }
            if(flag1==100){
                String to = "from";
                String line2str = line1.toString(); // convert string builder to string
                int index;
                index = line2str.indexOf(to);
                int binary = 0;
                int octal = 0;
                int decimal = 0;
                int hexadecimal = 0;
                if (line1.indexOf(substring1) != -1) {
                    binary = 1;
                }
                if (line1.indexOf(substring2) != -1) {
                    octal = 1;
                }
                if (line1.indexOf(substring3) != -1) {
                    decimal = 1;
                }
                if (line1.indexOf(substring4) != -1) {
                    hexadecimal = 1;
                }
                /*System.out.println("binary: " + binary);
                System.out.println("octal: " + octal);
                System.out.println("decimal: " + decimal);
                System.out.println("hexadecimal: " + hexadecimal);*/
                if(binary==1){
                    if(hexadecimal == 1){
                        int indexbinary = line1.indexOf(substring1);
                        int indexhexadecimal = line1.indexOf(substring4);
                        if(indexbinary < indexhexadecimal){
                            binarytohexa();
                        }else{
                            hexatobinary();
                        }
                    }else if(octal == 1){
                        int indexbinary = line1.indexOf(substring1);
                        int indexoctal = line1.indexOf(substring2);
                        if(indexbinary<indexoctal){
                            binarytooctal();
                        }else{
                            octaltobinary();
                        }
                    }else if(decimal == 1){
                        int indexbinary = line1.indexOf(substring1);
                        int indexdecimal = line1.indexOf(substring3);
                        if(indexbinary<indexdecimal){
                            binarytodecimal();
                        }else{
                            decimaltobinary();
                        }
                    }
                }else if(decimal == 1){
                    if(hexadecimal==1){
                        int indexdecimal = line1.indexOf(substring3);
                        int indexhexadecimal = line1.indexOf(substring4);
                        if(indexdecimal<indexhexadecimal){
                            decimaltohexa();
                        }else{
                            hexatodecimal();
                        }
                    }else if(octal == 1){
                        int indexdecimal = line1.indexOf(substring3);
                        int indexoctal = line1.indexOf(substring2);
                        if(indexdecimal<indexoctal){
                            decimaltooctal();
                        }else{
                            octaltodecimal();
                        }

                    }else if(binary ==1){
                        int indexdecimal = line1.indexOf(substring3);
                        int indexbinary = line1.indexOf(substring1);
                        if(indexdecimal<indexbinary){
                            deimaltobinary();
                        }else{
                            binarytodecimal();
                        }

                    }
                }else if(octal==1){
                    if(binary == 1){
                        int indexoctal = line1.indexOf(substring2);
                        int indexbinary = line1.indexOf(substring1);
                        if(indexoctal<indexbinary){
                            octaltobinary();
                        }else{
                            binarytooctal();
                        }

                    }else if(decimal == 1){
                        int indexoctal = line1.indexOf(substring2);
                        int indexdecimal = line1.indexOf(substring3);
                        if(indexoctal<indexdecimal){
                            octaltodecimal();
                        }else{
                            decimaltooctal();
                        }

                    }else if(hexadecimal==1){
                        int indexoctal = line1.indexOf(substring2);
                        int indexhexa = line1.indexOf(substring4);
                        if(indexoctal<indexhexa){
                            octaltohexa();
                        }else{
                            hexatooctal();
                        }

                    }

                }else if(hexadecimal==1){
                    if(binary == 1){
                        int indexhexa  = line1.indexOf(substring4);
                        int indexbinary = line1.indexOf(substring1);
                        if(indexhexa<indexbinary){
                            hexatobinary();
                        }else{
                            binarytohexa();
                        }

                    }else if(octal == 1){
                        int indexhexa  = line1.indexOf(substring4);
                        int indexoctal = line1.indexOf(substring2);
                        if(indexhexa<indexoctal){
                            hexatooctal();
                        }else{
                            octaltohexa();
                        }

                    }else if(decimal ==1){
                        int indexhexa  = line1.indexOf(substring4);
                        int indexdecimal = line1.indexOf(substring3);
                        if(indexhexa<indexdecimal){
                            hexatodecimal();
                        }else{
                            decimaltohexa();
                        }

                    }
                }

            }else{

            }

        }
    }
    public static void binarytohexa(){
        System.out.println("Nupur: Oh, sure! can you pls enter the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");

    }
    /*public static void hextatobinary(){
        System.out.println("Nupur: why not ! enter the number pls sir.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }*/
    public static void binarytooctal(){
        System.out.println("Nupur: it will be my pleasure, pls give me the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  octaltobinary(){
        System.out.println("Nupur: enter the number pls sir.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  binarytodecimal(){
        System.out.println("Nupur: pls tell me the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");

        String binary = sc.nextLine();

        // Split the binary string into integer and fractional parts
        String[] parts = binary.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        // Convert integer part
        int integerDecimal = 0;
        for (int i = 0; i < integerPart.length(); i++) {
            if (integerPart.charAt(i) == '1') {
                integerDecimal += Math.pow(2, integerPart.length() - 1 - i);
            }
        }

        // Convert fractional part
        double fractionalDecimal = 0;
        for (int i = 0; i < fractionalPart.length(); i++) {
            if (fractionalPart.charAt(i) == '1') {
                fractionalDecimal += Math.pow(2, -1 - i);
            }
        }

        // Combine both parts
        double decimal = integerDecimal + fractionalDecimal;

        System.out.println("Nupur: Here is your decimal number, it is "+decimal);
    }
    public static void decimaltobinary() {
        System.out.println("Nupur: what is the number you want to convert in binary?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
        double decimal = sc.nextDouble();

        int integerPart = (int) decimal;
        double fractionalPart = decimal - integerPart;

        String integerBinary = Integer.toBinaryString(integerPart);

        StringBuilder fractionalBinary = new StringBuilder();
        fractionalBinary.append(".");

        while (fractionalPart > 0) {
            fractionalPart *= 2;
            if (fractionalPart >= 1) {
                fractionalBinary.append("1");
                fractionalPart -= 1;
            } else {
                fractionalBinary.append("0");
            }

            if (fractionalBinary.length() > 32) {
                break;
            }
        }

        String binary = integerBinary + fractionalBinary.toString();

        System.out.println("Nupur: here is the binary number " + binary);

        //sc.close();
    }

    public static void  decimaltohexa(){
        System.out.println("Nupur: pls enter the decimal value.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  hexatodecimal(){
        System.out.println("Nupur: why not ! pls give me the hexadecimal number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  decimaltooctal(){
        System.out.println("Nupur: Oh, sure! give me the decimal number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  octaltodecimal(){
        System.out.println("Nupur: sure, pls enter the octal number you want to convert! .");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    public static void  deimaltobinary(){
        System.out.println("Nupur: absolutely, give me the decimal number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }
    /*public static void  binarytodecimal(){
        System.out.println("Nupur: Oh, sure! can you pls enter the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }*/
    // also problem in this function
    public static void octaltohexa() {
        System.out.println("Nupur: yes of course! Please enter the octal number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");

    }
    //having problem in this function
    public static void  hexatooctal(){
        System.out.println("Nupur: pls enter the hexadecimal number sir.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
        String hex = sc.nextLine().trim().toUpperCase();
    }
    public static void  hexatobinary(){
        System.out.println("Nupur: hexadecimal number ta bolo babu ami convert kore dissi.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine().toUpperCase();

        // Split the hex string into integer and fractional parts
        String[] parts = hex.split("\\.");
        String integerPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        // Convert integer part to binary
        StringBuilder integerBinary = new StringBuilder();
        for (int i = 0; i < integerPart.length(); i++) {
            char hexDigit = integerPart.charAt(i);
            int decimalValue = Character.digit(hexDigit, 16);
            String binaryString = Integer.toBinaryString(decimalValue);
            // Pad the binary string with leading zeros to make it 4 bits
            while (binaryString.length() < 4) {
                binaryString = "0" + binaryString;
            }
            integerBinary.append(binaryString);
        }

        // Convert fractional part to binary
        StringBuilder fractionalBinary = new StringBuilder();
        for (int i = 0; i < fractionalPart.length(); i++) {
            char hexDigit = fractionalPart.charAt(i);
            int decimalValue = Character.digit(hexDigit, 16);
            String binaryString = Integer.toBinaryString(decimalValue);
            // Pad the binary string with leading zeros to make it 4 bits
            while (binaryString.length() < 4) {
                binaryString = "0" + binaryString;
            }
            fractionalBinary.append(binaryString);
        }

        // Combine both parts
        String binary = integerBinary.toString();
        if (fractionalBinary.length() > 0) {
            binary += "." + fractionalBinary.toString();
        }

        System.out.println("Nupur: "+binary+" this is your binary number");

    }
    /*public static void  binarytohexa(){
        System.out.println("Nupur: Oh, sure! can you pls enter the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }*/
    /*public static void  hexatooctal(){
        System.out.println("Nupur: Oh, sure! can you pls enter the number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Me: ");
    }*/


}
