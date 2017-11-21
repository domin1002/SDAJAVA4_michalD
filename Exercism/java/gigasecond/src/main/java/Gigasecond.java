import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {
    private LocalDate birthDate;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        if (birthDateTime == null) {
            birthDateTime = LocalDateTime.of(birthDate, LocalTime.MIDNIGHT);
        }
        return birthDateTime.plusSeconds(1000000000);


    }

}
