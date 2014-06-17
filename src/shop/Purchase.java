package shop;

import java.util.Date;

public class Purchase {

    protected Integer checkNumber;

    protected Date date;

    protected Float summaryPrice;

    protected Item[] items;

    public Purchase(Integer checkNumber, Date date, Float summary, Item[] items) {
        this.checkNumber = checkNumber;
        this.date = date;
        this.summaryPrice = summary;
        this.items = items;
    }

    public Integer getCheckNumber() {
        return checkNumber;
    }

    public Date getDate() {
        return date;
    }

    public Float getSummaryPrice() {
        return summaryPrice;
    }

    public Item[] getItems() {
        return items;
    }

    public String getItemNames(){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < items.length; i++) {

            Item item = items[i];

            sb.append(item.getName());
            sb.append(":");
            sb.append(item.getPrice());

            if(i < (items.length - 1)){
                sb.append(", ");
            }

        }

        return sb.toString();

    }

}
