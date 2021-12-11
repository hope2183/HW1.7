package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// TASK 1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника - " + fullName+".");

    // TASK 2
        String nameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для отчета - "+nameForReport+".");

    // TASK 3
        String nameForAdminDep = fullName;
        nameForAdminDep = fullName.replace(" ","; ");
        System.out.println("Данные ФИО сотрудника для административного отдела: "+nameForAdminDep+".");

    // TASK 4
       String fullNameNoYo = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника: "+fullNameNoYo+".");

        }


    }

