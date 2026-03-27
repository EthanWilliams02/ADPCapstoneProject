package za.ac.cput.factory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Learner;
import za.ac.cput.domain.MockTest;
import za.ac.cput.domain.Schedule;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class ScheduleFactoryTest {


        // Test 1: Create a valid schedule with all fields
        @Test
        @Order(1)  // Runs first
        public void testCreateSchedule() {

            Schedule schedule = ScheduleFactory.createSchedule(
                    "AB01",                // scheduleId
                    "C001", // instructorId
                    "TC001",                     // vehicle
                    "Accepted"             // status
            );
            assertNotNull(schedule);  // Verify schedule was created
        }
        // Test 2: Create a schedule with an empty testId type
        @Test
        @Order(2)
        public void testCreateScheduleWithEmptyScheduleId() {

            Schedule schedule = ScheduleFactory.createSchedule(
                    "",                // scheduleId (empty)
                    "C001", // instructorId
                    "TC001",                     // vehicle
                    "Accepted"             // status
            );
            assertNull(schedule);  // Verify schedule was NOT created
        }

    }
