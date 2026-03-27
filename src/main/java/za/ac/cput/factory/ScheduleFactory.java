package za.ac.cput.factory;

import za.ac.cput.domain.MockTest;
import za.ac.cput.domain.Schedule;
import za.ac.cput.util.Helper;

public class ScheduleFactory {

    public static Schedule createSchedule(String scheduleId, String instructorId, String vehicleId, String status ){

        if (Helper.isNullOrEmpty(scheduleId)) {
            return null;

        }

        return new Schedule.Builder().setScheduleId(scheduleId)
                .setInstructorId(instructorId)
                .setVehicleId(vehicleId)
                .setStatus(status)
                .build();
    }
}


