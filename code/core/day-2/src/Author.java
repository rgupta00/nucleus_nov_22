public class Author {
    private String name;
    private  String email;
    private char gender;// M F

    public Author(){}
    public Author(String name, String email, char gender){

        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return  name;
    }
    public  String getEmail(){
        return  email;
    }

    public char getGender(){
        return  gender;
    }

    public void setEmail(String newEmail){
        this.email=newEmail;
    }

    public  void  printAuthorDetails(){
        System.out.println("name: "+ name+" email: "+ email+" gender: "+ gender);
    }
}
