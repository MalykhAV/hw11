package org.employees.hw8_2;

public class EmployeeUtils {
    // поиск сотрудника в массиве по его имени
    public static int findByName(String name, Employee[] arr){
        for(int i = 0; i < arr.length; i++){
            if(name.equals(arr[i].getName())){
                return i;
            }
        }
        return -1;
    }
    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static int findBySubName(String subname, Employee[] arr){
        for(int i = 0; i < arr.length;i++){
           if(arr[i].getName().contains(subname)){
               return i;
           }
        }
        return -1;
    }
// подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int salarySum (Employee[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i].getSalary();

        }
        return result;
    }
// поиск наименьшей зарплаты в массиве
    public static int min(Employee[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i].getSalary()){
                min = arr[i].getSalary();
            }
        }
        return min;
    }
    //поиск наименьшей зарплаты в массиве менеджера

    public static int min(Manager[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i].getSalary()){
                min = arr[i].getSalary();
            }
        }
        return min;
    }
    // поиск наибольшей надбавки (разница между базовой стравкой и зарплатой) в массиве менеджеров
    public static int maxExtraManger(Manager[] arr){
        int difference = 0;
        for(int i = 0; i < arr.length; i++) {
            if(difference < (arr[i].getSalary() - arr[i].getBaseSalary())){
                difference = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }
        return difference;
    }

    public static int maxExtraManger(Director[] arr){
        int difference = 0;
        for(int i = 0; i < arr.length; i++) {
            if(difference < (arr[i].getSalary() - arr[i].getBaseSalary())){
                difference = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }
        return difference;
    }
}
