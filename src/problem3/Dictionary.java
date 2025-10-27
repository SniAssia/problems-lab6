package problem3;

public class Dictionary extends Document  {
    private String language;
    public Dictionary(String language, String title){
        super(title);
        this.language = language;
    }
    public String toString(){

        return super.toString()+ String.format("the language of this dictionary is %s ",language);
    }

}
