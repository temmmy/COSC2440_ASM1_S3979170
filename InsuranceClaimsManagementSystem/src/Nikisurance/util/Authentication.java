package Nikisurance.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Authentication {
    private static final String CREDENTIALS_FILE = "InsuranceClaimsManagementSystem/data/admins.txt";
    private static Map<String, String> credentials = new HashMap<>();

    public Authentication() {
        credentials = new HashMap<>();
        loadCredentials();
    }

    private void loadCredentials() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CREDENTIALS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] parts = line.split(" "); // Adjust delimiter if necessary
                if (parts.length == 2) {
                    credentials.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading credentials: " + e.getMessage());
        }
        System.err.println("Credentials: " + credentials);
    }

    public boolean authenticate(String username, String password) {
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }
}