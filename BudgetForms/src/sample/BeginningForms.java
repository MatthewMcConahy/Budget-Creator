package sample;

// Holding layout of objects
// This will be the form that will be used to hold values

public class BeginningForms {
    private String date;
    private String type;
    private String amount;

    public BeginningForms(String date, String type, String amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
