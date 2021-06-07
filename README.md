# Hospital-Management-System
We are going to implement Hospital Management system for our OOAD Project. The purpose of this project is to provide and efficient and reliable management system to the hospital that would be beneficial to them avoiding any ambiguity in system.
Users
In our system we will have:-
•	Admin
•	Patients
•	Doctors
•	Nurses
•	Staff
•	Receptionist
•	Accountant

Characteristics of Users:
•	Admin will be able to manage account of user, data update, records
•	Patients will be able to see their reports, booking appointment
•	Doctor will be able to see list of patients, set and see appointment
•	Nurse can assist doctor, medicate, check record of patient
•	Pharmacy staff can update medicine record, handle prescription, manage inventory
•	Regular staff don’t have profile
•	Technical staff can be assigned certain tasks to manage networks, technical work, and do works related to electricity and machines
•	Receptionist can set appointments for doctors, patients and check timings for doctors
•	Accountant can handle accounts and billing.

Use Cases:
Ahmad:
•	Log in and log out from system
•	Delete Account
•	Change Credentials
Abeeq:	
•	Generate test report
•	Generate medicine reports
•	Add Patient
Abdullah:
•	Schedule Doctor Appointment
•	Admit a patient
•	File medial report
Saad:
•	Generate test results
•	Manage pharmacy inventory
•	Manage hospital inventory
Zaman:
•	Collect payment
•	Prescribe treatment
•	View medical history

4. Use Cases Description: 
Saad:
Use case name: Generate test results
Use case id: 10
Actors: Nurse
Description: By clicking on generate test result, a form will be generated which will gather information of patient and test from the database.
Pre-conditions: Nurse must be logged in to access the database.
Post-conditions: A form will be available having information of the respective test and its result, which can be used for download or print purposes.
Use case name: Manage Pharmacy Inventory
Use case id: 11
Actors: Pharmacy staff
Description: A pharmacy staff member can update inventory as add, remove a particular thing. I.e. medicine, surgical instruments for sale.
Pre-conditions: Pharmacy staff member must be logged in to access the database of pharmacy.
Post-conditions: A Popup will be generated after pressing update button which will tell you all the changes in the inventory and after pressing close it will be saved in the database of pharmacy.
Use case name: Manage Hospital Inventory
Use case id: 12
Actors: Admin
Description: Only Admin can update inventory as add, remove a particular thing. I.e. medicine, surgical instrument or print out the current inventory for future purposes.
Pre-conditions: Admin must be logged in to access the database of hospital.
Post-conditions: A Popup will be generated after pressing update button which will tell you all the changes in the inventory and after pressing close it will be saved in the database of pharmacy.
