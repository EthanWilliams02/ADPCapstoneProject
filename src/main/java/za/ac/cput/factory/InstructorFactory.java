/* InstructorFactory.java
InstructorFactory model class
Author: Qaasim Isaacs(222544422)
Date: 26 March 2026
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Instructor;
import za.ac.cput.util.Helper;

// Factory class responsible for creating Instructor objects with validation.

public class InstructorFactory {

    public static Instructor createInstructor(String instructorId,
                                              String employeeCode,
                                              String specialisation,
                                              double rating,
                                              String userId){

        // Validate String inputs (must not be null or empty)
        if(Helper.isNullOrEmpty(instructorId)
                || Helper.isNullOrEmpty(employeeCode)
                || Helper.isNullOrEmpty(specialisation)
                || Helper.isNullOrEmpty(userId)){
            return null;
        }

        // Validate rating (must be between 0 and 5)
        if(rating < 0 || rating > 5){
            return null;
        }

        // Build and return Instructor object using Builder pattern
        return new Instructor.Builder()
                .setInstructorId(instructorId)
                .setEmployeeCode(employeeCode)
                .setSpecialisation(specialisation)
                .setRating(rating)
                .setUserId(userId)
                .build();
    }
}
