package OOP.Encapsulation.Invoice;

public class invoice {
    private int ORnumber;
    private String ORDate;
    private double totalPayemnt;


    invoice(int ORnumber, String ORDate, double totalPayemnt){
        this.ORnumber = ORnumber;
        this.ORDate = ORDate;
        this.totalPayemnt = totalPayemnt;
    }

    void showInvoice (){
        System.out.println("OR Number       : "+ ORnumber);
        System.out.println("OR Date         : "+ ORDate);
        System.out.println("Total Payment is: "+ totalPayemnt);
    }
    //setters
    void setTotalPayment(double totalPayemnt){
        this.totalPayemnt = totalPayemnt;
    }

    float getORnumber(){
        return ORnumber;
    }
}
