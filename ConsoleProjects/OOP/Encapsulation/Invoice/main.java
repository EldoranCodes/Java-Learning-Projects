package OOP.Encapsulation.Invoice;

public class main {
    public static void main(String[] args) {
        invoice customer1 = new invoice(1, "05/06/2024", 45.51);
        customer1.showInvoice();

        System.out.println("set the total payment: 100.55");
        customer1.setTotalPayment(100.55);
        System.out.println("get the ORNumber ");
        double ORnum = customer1.getORnumber();
        System.out.println("OR numb is: "+ ORnum);
        customer1.showInvoice();
    }   
    
}
