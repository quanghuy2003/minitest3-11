package service;

import model.Staff;

import java.util.ArrayList;

public class StaffManagement {
    ArrayList<Staff> staffList;

    public StaffManagement(ArrayList<Staff> staffList) {
        this.staffList = new ArrayList<>();
    }

    public void add(Staff staff) {
        staffList.add(staff);
    }

    public void showStaffList() {
        System.out.printf("|%-12s|%-12s|%-12s|%-20s", "Name", "Type", "Status", "Salary");
        System.out.println();
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
        System.out.println();
    }

    public void findByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).equals(name)) {
                System.out.printf("|%-12s|%-12s|%-12s|%-20s", "Name", "Type", "Status", "Salary");
                System.out.println();
                System.out.println(staffList.get(i));
            } else System.out.println("Không có nhân viên cần tìm");
        }
    }

    public void editByName(String name, Staff staff) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).equals(name)) {
                staffList.set(i, staff);
            }
        }
    }

    public void removeByName(String name) {
     for (int i = 0; i < staffList.size(); i++) {
      if (staffList.get(i).equals(name)) {
       staffList.remove(i);
      }
     }
    }

   public  void updateStaffStatus(String name){
    int index = staffList(id);
    staffList.set(index, );
   }
–

    calSalaryFulltime()
–

    calSalaryParttime()
–

    filterFulltimeStaff()
–

    filterPartimeStaff()

}
