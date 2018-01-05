# Library Management System
A platform independent stand-alone application written in java. It has the following features:

 * Admin tasks: add book,remove book, search for defaulters, calculate fines for the deafulters, etc.
 * Usre tasks: book search, borrow book, look for availability of a book.
 * supports running on multiple platform windows, mac, linux, etc.

## Getting it Setup
After you get a copy of this codebase pulled down locally (either downloaded as a zip or git cloned), you'll need to set up the system dsn:

Look for the database file library.mdb.

Then you'll need to open ODBC Data source Administrator(32/64-bit):

1. Under User DSN add a new MS Access Database then select a drive from the options with title Microsoft Access Driver(*.mdb)
2. Now click finish and you will see a pop up with title ODBC Micrososft access setup
3. Click the select button and navigate to the library.mdb file from the project repository and select it.
4. Click ok and finish the set-up.
5. Now you are good to go.

## How it Works
Just double click on the library.jar to launch the application. Add the user and passwords by modifying the database file library.mdb.
Password for the file is "akshay".
