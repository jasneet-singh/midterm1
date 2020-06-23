package midterm;

/**
 * A simple class to model registration plate numbers for vehicles. For simplicity, assume that each vehicle
 * registration plate object has a unique plate number and a type. The possible options for plate types are provided in
 * an array of type Strings.
 *
 * Students are reminded to add themselves as modifiers when editing the code.
 *
 * @author Ali Hassan
 * @author Paul Bonenfant
 */
public class RegistrationPlate {

    private String plateNumber;
    private String plateType;
    private String[] registrationTypes = {"Commercial", "Non-Commercial", "Personalized"};

    /**
     * This method checks whether the format of the provided registration plate number is valid or not. Assume that the
     * format of a valid registration plate is 'THREE_CHARACTERS' + 'FOUR_DIGITS'. Example: ABC1234
     *
     * @param plateNum the registration plate number of the vehicle.
     * @return the method returns true if the format of the plate# is valid.
     */
    public boolean isValid(String plateNum) {
        boolean isValidNumber = false;
        int validPlateNoLength = 7; // Number of letters+digits on a valid plate;
        if (plateNum.length() == validPlateNoLength) {
            if (Character.isLetter(plateNum.charAt(0))
                    && Character.isLetter(plateNum.charAt(1))
                    && Character.isLetter(plateNum.charAt(2))) {
                isValidNumber = true;
                for (int k = 3; k < plateNum.length(); k++) {
                    if (!Character.isDigit(plateNum.charAt(k))) {
                        isValidNumber = false;
                    }
                }
            }
        }
        return isValidNumber;
    }

    /**
     * A getter method that returns plate number of the registration plate.
     *
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * A setter method to set plate number of the registration plate.
     *
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * A getter method to return type of the registration plate.
     *
     * @return the plateType
     */
    public String getPlateType() {
        return plateType;
    }

    /**
     * A setter method to set type of the registration plate.
     *
     * @param plateType the plateType to set
     */
    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }
}
