import java.util.HashMap;
import java.util.HashSet;
import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class Passport {

    private final Map<Long, DataPassport> pasportMap;

    public Passport() {
        this.pasportMap = new HashMap<>();
    }

    public void addPassports(Long number, String firstname, String lastName, String middleName, LocalDate dateOfBirth) {
        DataPassport passport = new DataPassport(number, firstname, lastName, middleName, dateOfBirth);
        pasportMap.put(passport.getNumber(), passport);
    }



}