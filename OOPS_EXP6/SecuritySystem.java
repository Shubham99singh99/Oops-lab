// Final class to prevent tampering
final class SecuritySystem {
    
    // Method to authenticate user credentials
    public void authenticateUser(String username, String password) {
        // Dummy authentication logic (in real-world applications, use secure hashing and storage)
        if ("admin".equals(username) && "password123".equals(password)) {
            System.out.println("Authentication successful. Welcome, " + username + "!");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }
    }

    // Main method to test authentication
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();
        
        // Test authentication with valid and invalid credentials
        security.authenticateUser("admin", "password123"); // Valid credentials
        security.authenticateUser("user", "wrongpass");    // Invalid credentials
    }
}

// Attempting to extend the final class will result in a compilation error
/*
class AdvancedSecurity extends SecuritySystem {
    @Override
    public void authenticateUser(String username, String password) {
        // This override attempt will fail due to final class restriction
        System.out.println("This should not be allowed!");
    }
}
*/

