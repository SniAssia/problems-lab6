package problem3;

import java.util.Objects;

public class Dictionary extends Document  {
    private String language;
    public Dictionary(String language, String title){
        super(title);
        this.language = language;
    }
    public String toString(){

        return super.toString()+ String.format("the language of this dictionary is %s ",language);
    }
    public boolean equals(Object o){
        Dictionary d = (Dictionary)o;
        return super.equals(d) && Objects.equals(this.language,d.language);
    }

}
