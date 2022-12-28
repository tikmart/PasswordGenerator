import java.util.Random;

public class RandGenerator {

    //random character generator
    //using ASCII table
    public String randomGenerator(int length, String answer) {
        String password = "";
        Random rand = new Random();


        int count = 0;
        int num;

        //checking if includes special characters
        if (answer.equalsIgnoreCase("yes")) {

            while (count < length) {
                num = rand.nextInt(122) + 1;

                //special characters
                if (num >= 32 && num <= 47) {
                    password += (char) num;
                    count++;
                }

                //numbers
                if (num >= 48 && num <= 57) {
                    password += (char) num;
                    count++;
                }
                //uppercase
                else if (num >= 65 && num <= 90) {
                    password += (char) num;
                    count++;
                } //lowercase
                else if (num >= 97 && num <= 122) {
                    password += (char) num;
                    count++;
                }

            }
        } else {
            while (count < length) {
                num = rand.nextInt(122) + 1;

                //numbers
                if (num >= 48 && num <= 57) {
                    password += (char) num;
                    count++;
                }
                //uppercase
                else if (num >= 65 && num <= 90) {
                    password += (char) num;
                    count++;
                } //lowercase
                else if (num >= 97 && num <= 122) {
                    password += (char) num;
                    count++;
                }

            }

        }


        return password;
    }
}
