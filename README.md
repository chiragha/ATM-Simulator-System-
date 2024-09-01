# ATM-Simulator-System-


• Interpreters: Java and Java Database Connectivity(JDBC).

• Software: Netbeans.

• Database: MySQL Workbench.


## Run the application using the following command:

```java
java login
```


## DataBase

```java
create database bankmanagementsystem;

use bankmanagementsystem;

show databases;

create table signup(formno varchar(20),name varchar(20),fname varchar(20),date varchar(20),gender varchar(20),email varchar(30),status varchar(20),address varchar(40),city varchar(20),state varchar(25),pincode varchar(20));

create table signuptwo(formno varchar(20),religion varchar(20),category varchar(20),income varchar(20),education varchar(20),occupation varchar(30),pan varchar(30),aadhar varchar(30),scitizen varchar(20),pin varchar(20),exist varchar(25));

create table signupthree(formno varchar(20),acctype varchar(30),cardnumber varchar(30),pinnumber varchar(30),facility varchar(30));
create table login(formno varchar(20),cardnumber varchar(30),pinnumber varchar(30));

create table bank(pinnumber varchar(10), date varchar(50), type varchar(20), amount varchar(20));
show tables;

select * from signup;
select * from signuptwo;
select * from signupthree;
select * from login;
select * from bank;

````

## Sign-in Page

![log](https://github.com/user-attachments/assets/ed2e14ba-40ac-4b19-91d1-8217eafc457a)

## Sign-up Page-1

![page1](https://github.com/user-attachments/assets/85ccdc18-c51b-4014-a6e9-0e05e57738e9)

## Sign-up Page-2

![page2](https://github.com/user-attachments/assets/3a5473d6-50b9-4e67-8f01-4122ce4b6731)

## Sign-up Page-3

![page3](https://github.com/user-attachments/assets/f31632d0-152a-4782-b4e0-9993e495cc31)



### Now Customer can Login using Card Number and PIN

![page4](https://github.com/user-attachments/assets/6c7425b1-7d3f-41da-b590-2435030d120e)

## Main Page

![page5](https://github.com/user-attachments/assets/4d4b5baa-25e8-4dd9-b9c3-b1ed9d6c4ec4)

## Deposit Page

![page6](https://github.com/user-attachments/assets/b62af3b6-44eb-44ea-bce2-989367ad7a3c)

## Withdrawl Page

![page7](https://github.com/user-attachments/assets/f4699378-f08b-4073-b6bd-df60dc749404)

## FastCash Page

![page8](https://github.com/user-attachments/assets/5cda52db-6411-4a22-8dc3-a8caf9fea0b8)

## You Can Change Your PIN

![pin change](https://github.com/user-attachments/assets/557de748-a5cc-4437-8ded-7d7ec75443a0)

##  Mini-Statement

![page9](https://github.com/user-attachments/assets/ac1a2076-ac7a-4569-9148-fa2455ea498e)

## Balance Enquiry

![balanceenq](https://github.com/user-attachments/assets/fd255bd5-40d0-491a-9f71-bedbefc872b6)











