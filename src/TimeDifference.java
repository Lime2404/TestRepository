import java.util.Date;

public class TimeDifference {
    public static void main(String[] args) throws Exception
    {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        System.out.println(msTimeDistance);

        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        System.out.println("Days from start of the year " + dayCount );
    }
}
