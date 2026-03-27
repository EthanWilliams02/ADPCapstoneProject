package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Learner;
import za.ac.cput.domain.MockTest;
import za.ac.cput.domain.Vehicle;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MockTestFactoryTest {


    // Test 1: Create a valid mocktest with all fields
    @Test
    @Order(1)  // Runs first
    public void testCreateMockTest() {
        MockTest mockTest = MockTestFactory.createMockTest(
                "A001",                // testId
                LocalDate.of(2026, 6,25 ), // localdate
                50,                     // score
                true              // userId
        );
        assertNotNull(mockTest);  // Verify admin was created
    }
    // Test 2: Create a learner with empty
    @Test
    @Order(2)  // Runs second
    public void testMockTestWithNegativeScore()
        {
            MockTest mockTest = MockTestFactory.createMockTest(
                    "A001",                // testId
                    LocalDate.of(2026, 6,25 ) // localdate
                    ,       -1,              // score (negative number)
                    true              // userId
            );
            assertNotNull(mockTest);  // Verify mocktest was created
        }

        // Test 3: Create a mocktest with an empty testId type
        @Test
        @Order(3)
        public void testCreateMockTestWithEmptyTestId() {

            MockTest mockTest = MockTestFactory.createMockTest(
                    "A001",             // vehicleID
                    LocalDate.of(2026, 6,25 ),   // model
                    50,       // regNumber
                                  // transmissionType (empty)
                    true                // isAvailable
            );
            assertNull(mockTest);  // Verify vehicle was NOT created
        }


    }
