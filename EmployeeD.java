package com.mycompany.thegioididong;

import java.util.ArrayList;
import java.util.List;

public class EmployeeD {
    List<Employee> lsEm = new ArrayList<>();
    public int add(Employee e){
        lsEm.add(e);
        return 1;
    }
    public int cout(){
        return lsEm.size();
    }
}


