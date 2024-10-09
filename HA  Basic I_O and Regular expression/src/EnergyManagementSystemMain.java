import java.io.IOException;

public class EnergyManagementSystemMain {

    public static void main(String[] args) {
        // Instance creation
        LogFileManager logManager = new LogFileManager();  // person 1
        MetadataManager metadataManager = new MetadataManager();  // person 2
        DataExchangeSimulator dataSimulator = new DataExchangeSimulator();  // person 3

        try {
            // File management actions
            System.out.println("===== Log File Management =====");
            
            // Array of stations and sources for daily logs (Part 1 of new functionality)
            String[] stations = {"StationA", "StationB"};
            String[] sources = {"Solar", "Wind", "Hydro"};

            // Create daily logs for all stations and sources
            logManager.createDailyLogs(stations, sources);  // Use the new createDailyLogs() method

         
            // 1. Create a log for StationA using Solar
            logManager.createLog("StationA", "Solar");
            
            // 2. Move the log to the archive folder
            logManager.moveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

            // 3. Archive the log file into a .zip
            logManager.archiveLog("StationA_Solar_log_" + getCurrentDate() + ".txt");

            // 4. Delete the log file after archiving
            logManager.deleteLog("archived_logs/StationA_Solar_log_" + getCurrentDate() + ".txt");

            System.out.println();

            // Metadata management actions
            System.out.println("===== Metadata Management =====");

            // 5. Update metadata for each action
            metadataManager.updateMetadata("CREATE", "StationA_Solar_log_" + getCurrentDate() + ".txt");
            metadataManager.updateMetadata("MOVE", "StationA_Solar_log_" + getCurrentDate() + ".txt");
            metadataManager.updateMetadata("ARCHIVE", "StationA_Solar_log_" + getCurrentDate() + ".txt");
            metadataManager.updateMetadata("DELETE", "StationA_Solar_log_" + getCurrentDate() + ".txt");

            System.out.println();

            // Data exchange simulation actions
            System.out.println("===== Data Exchange Simulation =====");

            // 6. Simulate byte stream for data exchange
            dataSimulator.simulateByteStream("StationA_Solar_log_" + getCurrentDate() + ".dat");

            // 7. Simulate character stream for data exchange
            dataSimulator.simulateCharacterStream("StationA_Solar_log_" + getCurrentDate() + ".txt");
            
            System.out.println();
            
            // Open log file based on equipment name and date (Part 2 of new functionality)
            System.out.println("===== Search Log File =====");
            logManager.openLogFile("StationA", getCurrentDate());  // Use the new openLogFile() method

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Helper method to get current date in the format "yyyyMMdd"
    public static String getCurrentDate() {
        return new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
    }
}
