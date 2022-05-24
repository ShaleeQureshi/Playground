import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int counter = Integer.parseInt(input.readLine());

        if (counter > 0) {
            ArrayList<String> computers = new ArrayList<>();
            for (int i = 0; i < counter; i++) {
                      String[] details = input.readLine().split(" ");
                          int ram = Integer.parseInt(details[1]);
                          int cpu = Integer.parseInt(details[2]);
                          int storage = Integer.parseInt(details[3]);
                          int score = (2 * ram) + (3 * cpu) + storage;
                          computers.add(details[0] + " " + score);

            }
            if (computers.size() == 1) {
                System.out.println(computers.get(0).split(" ")[0]);
            } else {
                String num1 = computers.get(0);
                String num2 = computers.get(1);

                String num1Name = num1.split(" ")[0];
                int num1Speed = Integer.parseInt(num1.split(" ")[1]);

                String num2Name = num2.split(" ")[0];
                int num2Speed = Integer.parseInt(num2.split(" ")[1]);

                if (num1Speed <= num2Speed) {
                    if (num1Speed == num2Speed) {
                        if (num1Name.compareTo(num2Name) > 0) {
                            String temp = num1;
                            num1 = num2;
                            num2 = temp;
                        }
                    } else {
                        String temp = num1;
                        num1 = num2;
                        num2 = temp;
                    }
                }

                for (int i = 2; i < computers.size(); i++) {
                    int val = Integer.parseInt(computers.get(i).split(" ")[1]);
                    int val1 = Integer.parseInt(num1.split(" ")[1]);
                    int val2 = Integer.parseInt(num2.split(" ")[1]);
                    String tempName;
                    String valName = computers.get(i).split(" ")[0];
                    String firstName = num1.split(" ")[0];
                    String secondName = num2.split(" ")[0];

                    if (val >= val2) {
                        if (val >= val1) {
                            if (val == val1) {
                                if (firstName.compareTo(valName) > 0) {
                                    tempName = num1;
                                    num1 = computers.get(i);
                                    num2 = tempName;
                                }

                                else {
                                    num2 = computers.get(i);
                                }
                            } else {
                                tempName = num1;
                                num1 = computers.get(i);
                                num2 = tempName;
                            }
                        } else {
                            if (val == val2) {
                                if (secondName.compareTo(valName) > 0) {
                                    num2 = computers.get(i);
                                }
                            } else {
                                num2 = computers.get(i);
                            }
                        }
                    }

                }

                System.out.println(num1.split(" ")[0] + "\n" + num2.split(" ")[0]);

            }
        }

    }

}
