import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tháng bạn muốn đếm số ngày: ");

        int month = sc.nextInt();
        String dayInMonth;

        switch (month){
            case 2:
                dayInMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                default:
                    dayInMonth = "";
        }
        if (dayInMonth != ""){
            System.out.printf("Tháng '%d' có '%s' ngày!", month, dayInMonth);
        }else {
            System.out.print("Không có dữ liệu vào");
        }
    }
}
