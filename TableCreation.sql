create table if not exists Place_Of_Service(
	ID varchar(15),
	Name varchar(30),
	Address varchar(50),
	Type varchar(15),
	primary key (ID)
);

create table if not exists Bartender(
	Name varchar(30),
	Gender varchar(7),
	Rating numeric(3,2),
	primary key (Name)
);

create table if not exists Company(
	Cname varchar(30),
	Country varchar(15),
	Territory varchar(15),
	City varchar(15),
	primary key (Cname)
);


create table if not exists Drink(
	Name varchar(30),
	Type varchar(15),
	Company varchar(30),
	primary key (Name)
);

create table if not exists Manager (
	mid varchar(30),
	name varchar(30),
	gender varchar(10),
	networth numeric(15),
	primary key (mid)
);

create table if not exists event (
	startTime time,
	name varchar(30),
	dateofevent date,
	maxattendence numeric(4,0),
	primary key (name, dateofevent)
);


create table if not exists student(
	sid varchar(30),
	name varchar(30),
	year numeric (5,0),
	primary key (sid)
);

create table if not exists Operational_Times(
	OT varchar(5),
	Open_day varchar(9),
	Open_hour time,
	Close_day varchar(9),
	Close_hour time,
	primary key (OT)
);


create table if not exists Sells(
	POS_ID varchar(15),
	drinkName varchar(30),
	Price numeric (5,3),
	foreign key (POS_ID) references Place_Of_Service,
	foreign key (drinkName) references Drink
);

create table if not exists Works(
	POS_ID varchar(15),
	bartenderName varchar(30),
	start_shift time,
	end_shift time,
	foreign key (POS_ID) references Place_Of_Service,
	foreign key (bartendername) references Bartender
);

create table if not exists Makes(
	Cname varchar(30),
	drinkName varchar(30),
	foreign key (Cname) references Company,
	foreign key (drinkName) references Drink
);

create table if not exists is_Open(
	POS_ID varchar(15),
	OT varchar(5),
	foreign key (POS_ID) references Place_Of_Service,
	foreign key (OT) references Operational_Times
);

create table if not exists manages (
	POS_ID varchar(30),
	mid varchar(30),
	foreign key (POS_ID) references Place_Of_Service,
	foreign key (mid) references manager
);

create table if not exists hosts(
	POS_ID varchar(30),
	eventName varchar(30),
	dateofevent date,
	foreign key (POS_ID) references Place_Of_Service,
	foreign key (eventName , dateofevent) references event
);

create table if not exists attend(
	sid varchar(30),
	eventName varchar(30),
	dateofevent date,
	foreign key (sid) references student,
	foreign key (eventName, dateofevent) references event
);

create table if not exists buys(
	SID varchar(30),
	num_bought numeric(3,0),
	drinkname varchar(30),
	foreign key (sid) references student,
	foreign key (drinkname) references drink
);