# Java-Group-Projects---Group-2
University Submissions of our group projects in Java module
# Energy Management System

## Overview
This project simulates an energy management system where daily logs are generated for each energy source, charging station, and the system as a whole. The project supports operations like creating, moving, deleting, and archiving log files.

## Features
● Person 1: Manages log files (creating, moving, archiving, and deleting).
Create a Log: Creates a log file named StationA_Solar_log_<date>.txt in the
logs/ folder.
Move the Log: Moves the log file from logs/ to archived_logs/.
Archive the Log: Archives the log file as a .zip file in the archived_logs/ folder.
Delete the Log: Deletes the original log file after it has been archived.

● Person 2: Manages the metadata (updating it for every file operation).
The MetadataManager class is responsible for keeping track of all the operations performed on
log files by recording them in a metadata file. This file contains details about actions like
creating, moving, archiving, and deleting log files. Metadata provides a useful audit trail,
allowing you to track when and what actions were performed on each log file.
Method Purpose: This method updates the metadata file by logging each action
performed on a log file (e.g., create, move, delete, archive) along with a timestamp.
● Steps:
1. Capture Current Timestamp:
A SimpleDateFormat is used to capture the current date and time in
the format yyyy-MM-dd HH:mm:ss (e.g., 2024-10-09 12:45:32).
This timestamp marks when the action on the log file occurred.
2. Format Metadata Entry:
A string metadataEntry is created using String.format(). This
entry logs:
File Name: The name of the log file.
Action: The action performed on the log file (e.g., create, move,
archive).
Timestamp: When the action occurred.
Append Metadata to File:
The BufferedWriter is used to append the metadata entry to a file
called metadata.txt. The true flag in
FileWriter("metadata.txt", true) ensures that the file is
opened in append mode, so new metadata is added to the file instead of
overwriting it.
5. If metadata.txt doesn’t exist, it will be created automatically.
6. Print Confirmation:
A confirmation message is printed to the console stating that the
metadata has been updated for the given file and action.


● Person 3: Simulates data exchange using byte and character streams.
- Daily log generation for energy sources and stations
- Log retrieval based on name or date using regular expressions
  This class demonstrates two types of data exchange:
  Byte Stream: Used for handling binary data (e.g., raw data, images, etc.).
  Character Stream: Used for handling text data (e.g., logs, human-readable text).
It contains two methods: one for simulating binary data exchange using a byte stream and the
other for text data exchange using a character stream.
Purpose: This method simulates binary data exchange by writing an array of bytes to a
file. It uses a byte stream to handle the binary data.
● Steps:
1. FileOutputStream:
The method uses FileOutputStream to open the file and append
binary data. The true parameter in new
FileOutputStream(fileName, true) means that the file is opened
in append mode, meaning the binary data will be added at the end of the
file without overwriting existing content.
2. Binary Data:
The data array is a simple example of binary data: {1, 2, 3, 4, 5}.
In a real-world scenario, this could be sensor data or raw energy
readings.
3. Writing Data:
The write() method of FileOutputStream writes the binary data to
the file.
4. Confirmation:
After writing, a message is printed to the console to confirm that the
binary data was written to the specified file.
Use Case:
● Byte streams are used when you want to handle non-text data like images, audio, or
any other binary format. In an energy management system, this could simulate the
transfer of raw sensor data.
simulateCharacterStream(String fileName)

Explanation:
● Purpose: This method simulates text data exchange by writing text (or character data)
to a file. It uses a character stream to handle the text data.
● Steps:
1. BufferedWriter:
The method uses a BufferedWriter to write text data. The true
parameter in new FileWriter(fileName, true) ensures the file is
opened in append mode so that the text data is appended at the end of
the file without overwriting existing content.
2. Text Data:
A simple string data is written to the file: "Sample text data for "
+ fileName + "\n". This string includes a message along with the file
name and a newline character (\n).
3. Writing Data:
  The write() method of BufferedWriter is used to write the string
data to the file.
4. Confirmation:
After writing, a message is printed to the console to confirm that the text
data was written to the specified file.
Use Case:
Character streams are used when you are handling human-readable text, such as log
files or configuration files. In this case, the text could be log entries or system-generated
reports.


- 

## How to Run
1. Compile the project: `javac *.java`
2. Run the program: `java Main`

## Usage Instructions
- To generate a log for a charging station on a specific day: `LogGenerator.generateDailyLogs("Station1", "2024-10-08", "Charging data");`
- To retrieve logs for a specific station and date: `LogRetriever.retrieveLogs("Station1_2024-10-08.txt");`

