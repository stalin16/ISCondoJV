import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Table table = new Table(3, BorderStyle.DESIGN_CAFE_WIDE);
        table.setColumnWidth(0,10,20);
        table.setColumnWidth(1,10,20);
        table.setColumnWidth(2,10,20);
        table.addCell("test");
        table.addCell("test");
        table.addCell("test");
        table.addCell("test");
        table.addCell("test");
        table.addCell("test");
        System.out.println(table.render());
        Scanner scanner = new Scanner(System.in);
        do{
            try{
                System.out.print("Enter the number: ");
                int num = Integer.parseInt(scanner.next());
                System.out.print("Enter the string: ");
                String str= scanner.next();
                System.out.println(str);
            } catch (NumberFormatException e){
                System.out.println("Input again: "+e.getMessage());
            }
        } while (true);

    }
}
