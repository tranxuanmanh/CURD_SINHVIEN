
package Entity;


public class QueQuan {
    private String id,name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueQuan(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public QueQuan() {
    }

    @Override
    public String toString() {
        return name+"-"+id;
    }
    
    
}
