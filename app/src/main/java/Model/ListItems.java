package Model;

/**
 * Created by go on 9/3/2017.
 */

public class ListItems {

    private String name;
    private String description;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public ListItems(String name, String description){
        this.name = name;
        this.description = description;



    }


}
