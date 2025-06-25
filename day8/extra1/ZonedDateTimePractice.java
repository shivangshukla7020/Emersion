import java.time.*;
public class ZonedDateTimePractice{
    public static void main(String[] args){
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmt);

        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ist);

        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(ist);
    }
}