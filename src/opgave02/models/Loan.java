package opgave02.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        int days = (int) ChronoUnit.DAYS.between(returnDate, actualDate);
        int price = 0;

        if (days > 0 && days < 8) {
            price = 20;
        } else if (days > 8 && days < 15) {
            price = 60;
        } else if (days > 15) {
            price = 90;
        }
        return price = adult ? price : price / 2;
    }

}
