# Java-Group-Projects---Group-2
Done by:
Monica Ponnappadhas Santhini - 7221964
Arthisree saraswathi rajamanickam- 7216696
Daranya Maniseharan - 7222079

University Submissions of our group projects in Java module
# Energy Management System

## Overview
This project simulates an energy management system where daily logs are generated for each energy source, charging station, and the system as a whole. The project supports operations like creating, moving, deleting, and archiving log files.

## Features
● Person 1: Manages log files (creating, moving, archiving, and deleting).
Create a Log: Creates a log file named StationA_Solar_log_<date>.txt in the
logs/ folder.

● Person 2: Manages the metadata (updating it for every file operation).
The MetadataManager class is responsible for keeping track of all the operations performed on
log files by recording them in a metadata file. This file contains details about actions like
creating, moving, archiving, and deleting log files. Metadata provides a useful audit trail,
allowing you to track when and what actions were performed on each log file.
Method Purpose: This method updates the metadata file by logging each action
performed on a log file (e.g., create, move, delete, archive) along with a timestamp


● Person 3: Simulates data exchange using byte and character streams.
- Daily log generation for energy sources and stations
- Log retrieval based on name or date using regular expressions
  
Explanation:
● Purpose: This method simulates text data exchange by writing text (or character data)
to a file. It uses a character stream to handle the text data.
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

