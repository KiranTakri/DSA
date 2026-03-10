package Opps;

public class Encapsulation {
    public static void main(String[] args) {
            Bank b=new Bank();
            b.setBal(40000);
            b.setAccNo(123456);
            b.setIFSC(1234);
        System.out.println(b.getBal());
        System.out.println( b.getAccNo());
        System.out.println(b.getIFSC());
            
    }

static class Bank{
    private int bal;
    private int accNo;
    int IFSC;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getIFSC() {
        return IFSC;
    }

    public void setIFSC(int IFSC) {
        this.IFSC = IFSC;
    }
}}
