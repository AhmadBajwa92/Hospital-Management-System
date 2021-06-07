SELECT * FROM hms.appointment;
create table Patient
(
Patient_id varchar(30) primary key not null ,
patient_name varchar(30),
patient_address varchar(50),
patient_phone varchar(30),
patient_age int ,
patient_sex varchar(30),
patient_disease varchar(50)
);
create table Appointment
(
Appointment_id varchar(30),
patient_id varchar(30),
doctor_id varchar(30),
foreign key (patient_id) References patient(patient_id) on delete cascade,
foreign key (doctor_id) References doctor(doctor_id) on delete cascade
);
create table Report
(
result varchar (100),
patient_id varchar(30),
doctor_id varchar(30),
foreign key (patient_id) References patient(patient_id) on delete cascade ,
foreign key (doctor_id) References doctor(doctor_id) on delete cascade
);
create table doctor
(
doctor_id varchar(30) primary key not null,
doctor_name varchar(30),
doctor_address varchar(50),
doctor_phone varchar(30),
doctor_age int ,
doctor_sex char,
specialization varchar(50)
);

create table nurse
(
nurse_id varchar(30) primary key not null,
nurse_name varchar(30),
nurse_address varchar(50),
nurse_phone varchar(30),
nurse_age int ,
nurse_sex char
);


create table PatientLogin
(
user_id varchar(30) not null,
Password varchar(50)  not null,

foreign key (user_id) References Patient(Patient_id) on delete cascade 
);


create table adminlogin
(
user_id varchar(30) not null,
Password varchar(50)  not null,

foreign key (user_id) References admin(admin_id) on delete cascade
)


create table doctorlogin
(
user_id varchar(30) not null,
Password varchar(50)  not null,

foreign key (user_id) References doctor(doctor_id) on delete cascade 
)


create table nurselogin
(
user_id varchar(30) not null,
Password varchar(50)  not null,

foreign key (user_id) References nurse(nurse_id) on delete cascade 
)


create table receptionistlogin
(
user_id varchar(30) not null,
Password varchar(50)  not null,

foreign key (user_id) References receptionist(receptionist_id)
)



create table admin
(
admin_id varchar(30) primary key not null,
admin_name varchar(30),
admin_address varchar(50),
admin_phone varchar(30),
admin_age int ,
admin_sex char
)


create table receptionist
(
receptionist_id varchar(30) primary key not null,
receptionist_name varchar(30),
receptionist_address varchar(50),
receptionist_phone varchar(30),
receptionist_age int ,
receptionist_sex char
)
create table patientreport
(

Patient_id varchar(30) not null,
doctor_id varchar(30) not null,
patient_disease varchar(50),

foreign key (Patient_id) References Patient(patient_id) on delete cascade ,

foreign key (doctor_id) References doctor(Doctor_id) on delete cascade 


)
create table apointment
(
Patient_id varchar(30) not null,
doctor_id varchar(30) not null,
apointment_time time,admin
apointment_date date,

foreign key (Patient_id) References Patient(patient_id)on delete cascade ,

foreign key (doctor_id) References doctor(Doctor_id)on delete cascade 
)
