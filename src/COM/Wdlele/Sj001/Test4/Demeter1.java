/*
 * 版权所有(C)，威海神匠渔具有限公司，2022，所有权利保留。
 *
 * 项目名： ShenJiang008
 * 文件名： Demeter1.java
 * 模块说明：
 * 修改历史:
 * 2022-3-2 - wdlele - 创建。
 */

package COM.Wdlele.Sj001.Test4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wdlele
 * @create 2022-03-02 8:54
 */
public class Demeter1 {
    public static void main(String[] args) {
        //ToDO AUTO_generated method Stub
        SchoolManger schoolManger = new SchoolManger();
        schoolManger.printAllEmployee();

    }
}

class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class SchoolManger implements IPrintAllEmployee {
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            Employee emp = new Employee();
            emp.setId("学生总部员工id="+i);
            list.add(emp);
        }
        return list;
    }
    public void printAllEmployee(){

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------------学校总员工----------------");
        for (Employee e:list2){
            System.out.println(e.getId());
        }

    }

}
interface IPrintAllEmployee{
    void printAllEmployee();
}

class CollegeManger implements IPrintAllEmployee{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员id"+i);
            list.add(emp);
        }
        return list;
    }
    public void printAllEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("----------分校员工-------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }

}

