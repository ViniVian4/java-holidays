import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Holiday> getHolidaysList() {
        List<Holiday> holidays = new ArrayList<Holiday>();

        holidays.add(new Holiday("Confraternização mundial", "01/01/2023"));
        holidays.add(new Holiday("Carnaval", "21/02/2023"));
        holidays.add(new Holiday("Páscoa", "17/04/2023"));
        holidays.add(new Holiday("Tiradentes", "21/04/2023"));
        holidays.add(new Holiday("Dia do trabalho", "01/05/2023"));
        holidays.add(new Holiday("Corpus Christi", "08/06/2023"));
        holidays.add(new Holiday("Independência do Brasil", "07/09/2023"));
        holidays.add(new Holiday("Nossa Senhora Aparecida", "12/10/2023"));
        holidays.add(new Holiday("Finados", "02/11/2023"));
        holidays.add(new Holiday("Proclamação da República", "15/11/2023"));
        holidays.add(new Holiday("Natal", "25/12/2023"));

        return holidays;
    }

    static void holidayExists(String date) {
        List<Holiday> holidays = getHolidaysList();

        for (int i = 0; i < holidays.size(); i++) {
            Holiday holiday = holidays.get(i);
            if (holiday.getDate().equals(date)) {
                System.out.println("Este é o feriado de " + holiday.getName());
                return;
            }
        }

        System.out.println("Este feriado não existe");      
        
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();

        holidayExists(date);
    }
}
