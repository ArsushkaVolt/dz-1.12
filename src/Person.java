public abstract class Person {
    String name, surname, form;

    public Person(String name, String surname, String form){
        this.name = name;
        this.surname = surname;
        this.form = form;
    }

    public String getName(){
        return name + " " + surname;
    }


    public String getForm(){
        return form;
    }

    public abstract int getSalary();
}
