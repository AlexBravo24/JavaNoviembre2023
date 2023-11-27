package ciclos;

import java.util.Calendar;

public class ciclos4_AURC {
	public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        for (int i = 0; i < 24 * 60 * 60; i++) {
            System.out.printf("%02d:%02d:%02d\n",
                    calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE),
                    calendar.get(Calendar.SECOND));

            calendar.add(Calendar.SECOND, 1);
        }
    }
}
