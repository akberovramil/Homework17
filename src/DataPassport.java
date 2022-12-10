import java.time.LocalDate;
import java.util.Objects;

public class DataPassport {

        private Long number;
        private String firstname;
        private String lastName;
        private String patronymic;
        private LocalDate dateOfBirth;

        public DataPassport(Long number, String firstname, String lastName, String patronymic, LocalDate dateOfBirth) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.number = number;
            this.patronymic = patronymic;
            this.dateOfBirth = dateOfBirth;
        }

        public void setLastName(String lastName) {
            if (lastName == null || lastName.isEmpty() || lastName.isBlank()) throw new RuntimeException();
            else this.lastName = lastName;
        }

        public void setNumber(Long number) {
            if (number == null) throw new RuntimeException();
            else this.number = number;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth == null) throw new RuntimeException();
            else this.dateOfBirth = dateOfBirth;
        }

        public void setFirstname(String firstname) {
            if (firstname == null || firstname.isEmpty() || firstname.isBlank()) throw new RuntimeException();
            else this.firstname = firstname;

        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public Long getNumber() {
            return number;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getPatronymic() {
            return patronymic;
        }

    @Override
    public String toString() {
        return "DataPassport{" +
                "number=" + number +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataPassport that = (DataPassport) o;
        return Objects.equals(number, that.number) && Objects.equals(firstname, that.firstname) && Objects.equals(lastName, that.lastName) && Objects.equals(patronymic, that.patronymic) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, firstname, lastName, patronymic, dateOfBirth);
    }
}
