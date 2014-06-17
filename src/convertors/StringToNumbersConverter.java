package convertors;

import java.text.NumberFormat;
import java.text.ParseException;

public class StringToNumbersConverter {

    public static void convert(String num){

        try {

            //Replace dot with comma for double and float
            String formattedNum = num.replaceAll("\\.", ",");

            Number number = NumberFormat.getNumberInstance().parse(formattedNum);
            System.out.println("String " + num + " converted to number " + number.doubleValue());

        } catch (ParseException e){

            System.out.println(num + " is not a number");
            return;

        }

        try {

            Integer numInteger1 = Integer.parseInt(num);
            System.out.println(numInteger1.getClass().getSimpleName() + " - " + numInteger1);

            Integer numInteger2 = Integer.valueOf(num);
            System.out.println(numInteger2.getClass().getSimpleName() + " - " + numInteger2);

            Integer numInteger3 = new Integer(num);
            System.out.println(numInteger3.getClass().getSimpleName() + " - " + numInteger3);

        } catch (NumberFormatException e){

            System.out.println("Number " + num + " can not be converted to integer");

        }

        try {

            Float numFloat1 = Float.parseFloat(num);
            System.out.println(numFloat1.getClass().getSimpleName() + " - " + numFloat1);

            Float numFloat2 = new Float(num);
            System.out.println(numFloat2.getClass().getSimpleName() + " - " + numFloat1);

        } catch (NumberFormatException e){
            System.out.println("Number " + num + " can not be converted to float");
        }

        try {

            Double numDouble1 = Double.parseDouble(num);
            System.out.println(numDouble1.getClass().getSimpleName() + " - " + numDouble1);

            Double numDouble2 = new Double(num);
            System.out.println(numDouble2.getClass().getSimpleName() + " - " + numDouble2);

        } catch (NumberFormatException e){
            System.out.println("Number " + num + " can not be converted to double");
        }

        try {

            // @TODO make notice only numbers in range from -128 to 127 can be converted to byte
            Byte numByte1 = Byte.parseByte(num);
            System.out.println(numByte1.getClass().getSimpleName() + " - " + numByte1);

        } catch (NumberFormatException e){
            System.out.println("Number " + num + " is out of byte range");
        }

        try {

            Short numShort1 = Short.parseShort(num);
            System.out.println(numShort1.getClass().getSimpleName() + " - " + numShort1);

        } catch (NumberFormatException e){
            System.out.println("Number " + num + " can not be converted to short");
        }

        try {

            Long numLong1 = Long.parseLong(num);
            System.out.println(numLong1.getClass().getSimpleName() + " - " + numLong1);

        } catch (NumberFormatException e){
            System.out.println("Number " + num + " can not be converted to long");
        }

    }

}
