public class Project{
    private String name; 
    private String description; 
    private double initialCost; 

    public String elevatorPitch(){
        return this.name+"("+initialCost+"): " + this.description; 
    }

    public Project(){
        this.name = null; 
        this.description = null; 
        this.initialCost = 0; 
    }; 
    
    public Project(String n){
        this.name = n; 
        this.description = null; 
        this.initialCost = 0; 
    }; 

    public Project(String n, String d){
        this.name = n; 
        this.description = d; 
        this.initialCost = 0; 
    }; 

    public String getName(){
        return name; 
    }; 

    public String getDescription(){
        return description; 
    }; 

    public void setName(String n){
        this.name = n; 
    };

    public void setDescription(String d){
        this.description = d; 
    }; 

    public void setInitialCost(double c){
        this.initialCost = c; 
    }; 

    public double getInitialCost(){
        return initialCost; 
    }; 

}