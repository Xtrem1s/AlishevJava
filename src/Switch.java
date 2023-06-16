import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = sc.nextLine();
        switch (age){
            case "0" :
                System.out.println("ты родился");
                break;
            case "7" :
                System.out.println("ты пошел в школу");
                break;
            case "10" :
                System.out.println("ты учишься в школе");
                break;
            case "18" :
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни одно из предыдущих условий не подошло");
        }
    }
}
