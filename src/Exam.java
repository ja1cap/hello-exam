import convertors.StringToNumbersConverter;
import shop.Item;
import shop.Purchase;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam extends Hope implements Rage {

    public static void main(String[] args){

        /**
         * A
         */
        Exam.A();

        /**
         * B
         */
        Exam.B();

        /**
         * D
         */
        Exam.D();

    }

    protected static void A(){

        System.out.println("----------");
        System.out.println("START A");
        System.out.println("----------");

        Exam h = new Exam();
        h.hello();

        Polite p = new Polite(10);
        System.out.println("Your polite level - " + p.getA());

        Revenge r = new Revenge();
        r.feed();

        h.sell();

        String num = "1234";
        StringToNumbersConverter.convert(num);

        System.out.println("----------");
        System.out.println("END A");
        System.out.println("----------");

    }

    protected static void B(){

        Exam h = new Exam();

        System.out.println("----------");
        System.out.println("START B");
        System.out.println("----------");

        /**
         * Private constructor for singletons, must have static method to create new class instance
         */
        Lite lite = Lite.getInstance(2);
        System.out.println("Hulk can count to " + lite.getCount());

        String num = "1.234";
        StringToNumbersConverter.convert(num);


        Data data = new Data("biosistema@me.com", 2020327);
        h.savePersonalData(data);

        String dataReadEmail = "ja1cap@me.com";
        Data dataRead = h.readPersonalData(dataReadEmail);

        if(dataRead == null){
            System.out.println("Create personal data: " + dataReadEmail);
            dataRead = new Data(dataReadEmail, 6150391);
            h.savePersonalData(dataRead);
        }

        try {

            Data clonedData = data.clone();
            h.savePersonalData(clonedData);

        } catch (CloneNotSupportedException e){
            System.out.println("Personal data can not be cloned");
        }

        System.out.println("----------");
        System.out.println("END B");
        System.out.println("----------");

    }

    protected static void D(){

        System.out.println("----------");
        System.out.println("START D");
        System.out.println("----------");

        Integer checkNumber = 123;
        Date date = new Date();

        Item phone = new Item("iPhone", 499f);
        Item dress = new Item("Prada", 99.99f);
        Item[] items = new Item[]{phone, dress};

        Float summaryPrice = 0f;
        for (Item item : items){
            summaryPrice += item.getPrice();
        }

        Purchase purchase = new Purchase(checkNumber, date, summaryPrice, items);

        System.out.println("Purchase - " + purchase.getCheckNumber());

        System.out.println("Items - " + purchase.getItemNames());

        System.out.println("Summary price - " + purchase.getSummaryPrice());

        String formattedDate = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(purchase.getDate());
        System.out.println("Date - " + formattedDate);

        System.out.println("----------");
        System.out.println("END D");
        System.out.println("----------");

    }

    protected Data savePersonalData(Data data){

        System.out.print("Personal data: ");
        data.print();

        try {

            String dataFilePath = "personalData/" + data.getEmail() + ".data";
            FileOutputStream fos = new FileOutputStream(dataFilePath);

            try {

                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(data);

            } catch (IOException e){

                System.out.println("Personal data output error: " + e.getMessage());

            }


        } catch (FileNotFoundException e){
            System.out.println("Personal data file not found: " + data.getEmail());
        }

        return data;

    }

    public Data readPersonalData(String dataEmail){

        Data data = null;
        String dataFilePath = "personalData/" + dataEmail + ".data";

        try {

            FileInputStream fis = new FileInputStream(dataFilePath);

            try {

                ObjectInputStream ois = new ObjectInputStream(fis);

                try {

                    data = (Data) ois.readObject();
                    ois.close();

                    System.out.print("Personal data: ");
                    data.print();

                } catch (ClassNotFoundException e){

                    System.out.println("Personal data class not found: " + e.getMessage());

                }

            } catch (IOException e){
                System.out.println("Personal data input error: " + e.getMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println("Personal data file not found: " + dataEmail);
        }

        return data;

    }

    protected void sell() {
        System.out.println("Sell your soul!");
    }

    public void hello() {
        System.out.println("Hello exam!");
    }

}
