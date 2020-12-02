public class ProjectTest{
    public static void main(String[] args){
        Project proj1 = new Project(); 

        Project proj2 = new Project("Project 2"); 

        Project proj3 = new Project("Project 3", "A creative project for building revenue."); 

        System.out.println(proj1.elevatorPitch()); 

        proj1.setName("Project 1"); 

        proj1.setDescription("A crazy idea that just might work"); 
        proj1.setInitialCost(450.75);
        System.out.println(proj1.elevatorPitch()); 

        System.out.println(proj2.elevatorPitch()); 

        System.out.println(proj3.elevatorPitch());

    };
}