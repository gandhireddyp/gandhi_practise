package corejava.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    @SuppressWarnings("rawtypes")
    public static void main(final String[] args) {
        final ArrayList<Employee> emplList = new ArrayList<Employee>();
        final List<Object> abc = new ArrayList<Object>();
        final CompanySort companySort = new CompanySort();
        final IdSort idSort = new IdSort();
        final SalarySort salarySort = new SalarySort();
        abc.add(emplList);

        final Employee e1 = new Employee();
        e1.setName("Gandhi");
        e1.setCompany("ABC");
        e1.setSalary(1200.7f);
        e1.setId(4);
        emplList.add(e1);

        final Employee e2 = new Employee();
        e2.setName("ZGandhi");
        e2.setCompany("DEF");
        e2.setId(3);
        e2.setSalary(1200.8f);
        emplList.add(e2);

        final Employee e3 = new Employee();
        e3.setName("AGandhi");
        e3.setCompany("GHI");
        e3.setId(2);
        e3.setSalary(1200.5f);
        emplList.add(e3);

        final Employee e4 = new Employee();
        e4.setName("XGandhi");
        e4.setCompany("JKL");
        e4.setId(1);
        e4.setSalary(1200.6f);
        emplList.add(e4);

        System.out.println("Actual List " + emplList);

        Collections.sort(emplList);
        System.out.println("Normal Sort " + emplList);

        Collections.sort(emplList, companySort);
        System.out.println("Company Sort " + emplList);

        Collections.sort(emplList, idSort);
        System.out.println("ID Sort " + emplList);

        Collections.sort(emplList, salarySort);
        System.out.println("Salary Sort " + emplList);

        final Object obn = new Employee();
        System.out.println(obn.getClass());
    }
}
