public class Sdelnaya extends Person{

    int money, work;

    public Sdelnaya(String name, String surname, String form,  int money, int work){
        super(name, surname, form);
        this.money = money;
        this.work = work;


    }
    public int getSalary(){
        return money * work;
    }
}
