import java.util.Scanner;

public class Voucher {
    String dataEmitere;
    String dataExpirare;
    boolean isValid;

    public Voucher(String dataEmitere){
        this.dataEmitere = dataEmitere;

    }

    public void setDataExpirare(String dataEmitere) {
        this.dataExpirare = dataExpirare;
    }

    public void splitDate (String date){
        String[] split = dataEmitere.split("/");
        String day = split[0];
        String month = split[1];
        String year = split[2];
    }

    public void enterData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input date (dd/MM/yyyy):");
        this.dataEmitere = in.next();
        String[] split = dataEmitere.split("/");
        String day = split[0];
        String month = split[1];
        String year = split[2];
        System.out.println("Day:" + day + "\nMonth:" + month + "\nYear:" + year);

        int DAY = 31;
        if (Integer.parseInt(day) > DAY) {
            System.out.println("Day not valid.Please insert a day up to 31");
        }

        int MONTH = 12;
        if (Integer.parseInt(month) > MONTH) {
            System.out.println("Month not valid.Please insert a month up to 12");
        }

        int YEAR = 2021;
        if (Integer.parseInt(year) < 2021) {
            System.out.println("Year not valid.Please insert current year");
        }

        int sum = 0;
        sum = Integer.parseInt(month) + 6;
        if (sum > MONTH){
            sum -= MONTH;
        }
        System.out.println(sum);
    }
}
